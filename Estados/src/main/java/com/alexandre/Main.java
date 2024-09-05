package com.alexandre;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Conveniencia> conveniencias = List.of(
                new Conveniencia("SP", 67836.43),
                new Conveniencia("RJ", 36678.66),
                new Conveniencia("MG", 29229.88),
                new Conveniencia("ES", 27165.48),
                new Conveniencia("OUTROS", 19849.53)
        );

        double total = 0;
        for (Conveniencia conveniencia : conveniencias) {
            total += conveniencia.getFaturamento();
        }
        System.out.println(total);
        for (Conveniencia conveniencia : conveniencias) {
            double porcentagem = (conveniencia.getFaturamento() * 100) / total;
            System.out.println(conveniencia.getEstado() + ": " + porcentagem + "%");
        }
    }
}