/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package model;

import java.util.Scanner;

/**
 *
 * @author samue
 */
public class ProjetoBancario {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        ContaBancaria conta1 = new ContaBancaria();

        System.out.println("Digite o Número da conta:");
        int numeroConta = sc.nextInt();
        
        conta1.setNumeroConta(numeroConta);
        
        System.out.println("Digite o Nome do Titular:");
        String nomeTitular = sc.next();
        
        conta1.setNomeTitular(nomeTitular);
        
        System.out.println("Gostaria de fazer um depósito inicial? s/n");
        String condicao = sc.next();
        
        if(condicao == "s") {
            System.out.println("Digite o valor do depósito inicial:");
            double depositoInicial = sc.nextDouble();
        
            conta1.setDepositoInicial(depositoInicial);
        }
        
        
        
        
        
    }
}
