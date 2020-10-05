package jfosection4;

import java.util.Scanner;

/**
 *
 * @author Edilson do Nascimento
 */
public class Jfosection4 {

    public static void main(String[] args) {
        Praticas pratica = new Praticas();
        
        System.out.println("Converte a temperatura fornecida de Fahrenheit para Celsius: " + pratica.calculaCelsius(75.5));
        System.out.println("Calcula o tamanho da hipotenusa de um triângulo dado o comprimento de seus lados: " + pratica.calculaHipotenusa(4.0, 6.0));
        System.out.println("Simula o giro de dois dados de seis lados e exibe a soma deles: " + pratica.lancamentoDoisDados());                
        pratica.processandoNome();
        
        
    }
    
}
