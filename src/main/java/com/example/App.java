package com.example;

// Calculadora

public class App {

    // Soma dois números
    public int somar(int a, int b) {
        return a + b;
    }

    // Subtrai dois números
    public int subtrair(int a, int b) {
        return a - b;
    }

    // Multiplica dois números
    public int multiplicar(int a, int b) {
        return a * b;
    }

    // Divide dois números (lança exceção se divisor for zero)
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não permitida");
        }
        return a / b;
    }

    // Verifica se um número é par
    public boolean ePar(int numero) {
        return numero % 2 == 0;
    }
}
