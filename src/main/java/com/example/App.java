package com.example;

// Calculadora

public class App {

    // Adição
    public int somar(int a, int b) {
        return a + b;
    }

    // Subtração
    public int subtrair(int a, int b) {
        return a - b;
    }

    // Multiplicação
    public int multiplicar(int a, int b) {
        return a * b;
    }

    // Divisão
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não permitida");
        }
        return a / b;
    }
}