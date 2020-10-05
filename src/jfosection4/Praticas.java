/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jfosection4;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Edilson do Nascimento
 * 
 */

public class Praticas {
    
   //Converte a temperatura fornecida de Fahrenheit para Celsius.
    public double calculaCelsius(double fahrenheit){
       double celcius = 5.0 / 9.0 * (fahrenheit-32.0);
       BigDecimal bd = new BigDecimal(celcius).setScale(2, RoundingMode.HALF_EVEN);
       return bd.doubleValue();
   }
    
    public double calculaHipotenusa(double a, double b){
       double hipotenusa = Math.sqrt(Math.pow(a,2) + Math.pow(b, 2));
       BigDecimal bd = new BigDecimal(hipotenusa).setScale(2, RoundingMode.HALF_EVEN);
       return bd.doubleValue();
    }
    
    public String lancamentoDoisDados(){
        Random random = new Random();
        int dado1 = random.nextInt(6) + 1;
        int dado2 = random.nextInt(6) + 1;
        int soma = dado1 + dado2;        
        return "DADO1: " + dado1 + " + DADO2: " + dado2 + " = " + soma;
    }
    
    public int quantidadeLetrasPrimeiroNome(String nome) {        
        return nome.indexOf(" ");
    }
    
    public String processando(String nome){        
        return  nome.substring(nome.indexOf(" "), nome.length()) + ", " + nome.charAt(0) + ".";
    }
    
    public void processandoNome(){        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Entre com um nome inteiro: ");
        String nome = input.nextLine();
        System.out.println("Nome: " + this.quantidadeLetrasPrimeiroNome(nome));
        System.out.println("Nome processado: " + this.processando(nome));
    }
}
