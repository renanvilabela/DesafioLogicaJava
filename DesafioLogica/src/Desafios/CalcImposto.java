package Desafios;

import java.util.Scanner;

public class CalcImposto {
    public static void main(String[] args) {
        // Lê os valores da entrada
        Scanner leitorDeEntradas = new Scanner(System.in);
        float valorSalario = leitorDeEntradas.nextFloat();
        float valorBeneficios = leitorDeEntradas.nextFloat();
        leitorDeEntradas.close(); // Boa prática: fechar o Scanner

        float valorImposto = 0;

        // Aplica a alíquota correta conforme a faixa salarial
        if (valorSalario >= 0 && valorSalario <= 1100) {
            valorImposto = 0.05F * valorSalario;
        } else if (valorSalario <= 2500) {
            valorImposto = 0.10F * valorSalario;
        } else {
            valorImposto = 0.15F * valorSalario;
        }

        // Calcula e imprime a saída (com 2 casas decimais)
        float saida = valorSalario - valorImposto + valorBeneficios;
        System.out.println(String.format("%.2f", saida));
    }
}