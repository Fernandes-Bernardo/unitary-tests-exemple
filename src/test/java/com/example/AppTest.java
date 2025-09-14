package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {

    App app =  new App();

    // @Test // define metodo como de teste
    // void testSoma(){
        
    //     int result = app.somar(4, 5); // objeto para armazenar o resultado esperado, e rodar o metodo
    //     assertEquals(9, result); // o primeiro parametro seria o valor esperado, o segundo e o resultado gerado pelo metodo chamado. Esta linha por completa compara o valor esperado com o resultado do metodo
    // }

    @Test
    void testSoma(){
        int teste = app.somar(1, 4);
        assertEquals(5, teste);
    }

    @Test
    void testSub(){
        int teste = app.subtrair(3, 10);
        assertEquals(4, teste); // Vai falhar quando executado
    }

    @Test
    void testMul(){
        int teste = app.multiplicar(2, 4);
        assertEquals(8, teste);
    }

    @Test
    void testDiv(){
        int teste = app.dividir(10, 2);
        assertEquals(5, teste);
    }
}