package br.senai.sp.jandira;

import java.util.Scanner;

public class MultiplosDeSeis {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int valor1 = teclado.nextInt();

        System.out.print("Digite o segundo valor: ");
        int valor2 = teclado.nextInt();

        int menorValor, maiorValor;

        if (valor1 < valor2) {
            menorValor = valor1;
            maiorValor = valor2;
        } else {
            menorValor = valor2;
            maiorValor = valor1;
        }

        int primeiroMultiplo = (menorValor / 6) * 6;
        if (primeiroMultiplo < menorValor) {
            primeiroMultiplo += 6;
        }

        while (primeiroMultiplo <= maiorValor) {
            System.out.println(primeiroMultiplo);
            primeiroMultiplo += 6;
        }

        teclado.close();
    }
}
