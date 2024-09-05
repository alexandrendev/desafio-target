package com.alexandre;

import com.alexandre.json.Dados;

import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import java.io.StringReader;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Dados dados = new Dados();

        JsonReader jsonReader = javax.json.Json.createReader(new StringReader(dados.getJson()));
        JsonArray data = jsonReader.readArray();
        jsonReader.close();

        /*
        * |------------------------
        * |CALCULANDO A MÉDIA
        * |------------------------
        * |
        * */
        double somaValores = 0;
        int diasComFaturamento = 0;
        for (JsonObject jsonObject : data.getValuesAs(JsonObject.class)) {
            if(jsonObject.getJsonNumber("valor").doubleValue() != 0){
                somaValores += jsonObject.getJsonNumber("valor").doubleValue();
                diasComFaturamento++;
            }
        }
        double media = somaValores / diasComFaturamento;

        /*
        * |-------------------------
        * | Filtrando informações requisitadas
        * |-------------------------
        * */
        Optional<JsonObject> maiorFaturamento = data.getValuesAs(JsonObject.class).stream()
                .max(Comparator.comparingDouble(i -> i.getJsonNumber("valor").doubleValue()));

        Optional<JsonObject> menorFaturamento = data.getValuesAs(JsonObject.class).stream()
                .min(Comparator.comparingDouble(i -> i.getJsonNumber("valor").doubleValue()));

        List<JsonObject> faturamentosAcimaDaMedia = data.getValuesAs(JsonObject.class).stream()
                        .filter(j -> j.getJsonNumber("valor").doubleValue() > media).toList();


        /*
        * |-----------------------
        * |Imprimindo informações
        * |-----------------------
        * */
        System.out.println("Menor faturamento do mês: " + menorFaturamento
                .get()
                .getJsonNumber("valor")
                .doubleValue() + "\nDia:" + menorFaturamento.get().getJsonNumber("dia").numberValue() + "\n" );

        System.out.println("maior faturamento do mês: " + maiorFaturamento
                .get()
                .getJsonNumber("valor")
                .doubleValue() + "\nDia:" + maiorFaturamento.get().getJsonNumber("dia").numberValue() + "\n");

        System.out.println("Nº de dias com faturamento acima da média: " + faturamentosAcimaDaMedia.size());
    }
}