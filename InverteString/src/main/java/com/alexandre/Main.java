package com.alexandre;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String entrada = "TRABALHO";

        int tamanho = entrada.length();

        String invertida =  "";
        for (int i = tamanho - 1; i >= 0; i--) {
            invertida += entrada.charAt(i);
        }
        System.out.println(invertida);
    }
}