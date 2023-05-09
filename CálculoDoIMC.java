
package com.mycompany.fugaprog;

import java.util.Scanner;

public class Fugaprog {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Bem vindo ao Cálculo do IMC");
        System.out.println("Digite o peso em kg: ");
            double peso = input.nextDouble();
            
        System.out.println("Digite sua altura em metros: ");
            double altura = input.nextDouble();
            
        double IMC = peso/(altura*altura);
        
        System.out.println("Seu IMC é de \n"+IMC);
        if(IMC<18.5){
            System.out.println("Você está a baixo do peso\n");
        }
        else if(IMC>18.5 && IMC<25){
            System.out.println("Você está no peso normal\n");
        }
        else if(IMC>25 && IMC<30){
            System.out.println("Você está no sobrepeso\n");
        }
        else if(IMC>30){
            System.out.println("Você está na obesidade\n");
        }
        
        System.out.println("Quer ver a tabela?\n");
        System.out.println("Digite 1 para ver a tabela\nDigite 2 para sair do programa");
            int opcao = input.nextInt();
        
        
        switch(opcao) {
            case 1:
                System.out.println("Menor que 18,5 - Abaixo do peso \nEntre 18,5 e 25 - Normal\nEntre 25 e 29,99 - Acima do peso\nAcima de 30 - Obesidade");
                break;
            case 2:
                System.out.println("Tchauu!");
                break;
            default:
                System.out.println("Opção inválido");
        }
    }
}
