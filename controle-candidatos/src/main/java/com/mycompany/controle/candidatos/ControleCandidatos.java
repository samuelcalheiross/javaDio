/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.controle.candidatos;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author samue
 */
public class ControleCandidatos {

    public static void main(String[] args) {
        
        String[] candidatos = {"SAMUEL", "SOPHIA", "LAURA", "ESTHER", "ANA", "CLÁUDIA", "FÁTIMA"};
        for(int i = 0; i<candidatos.length; i++) {
            Double valorPretendido = valorPretendido();
            
            System.out.println( candidatos[i] + ":" + " " + valorPretendido.toString().formatted("%.2f"));
            AnalisarCandidatos(valorPretendido);
            System.out.println();
        }
        
    }
    
    public static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    
    public static void AnalisarCandidatos(double salarioPretendido) {
        double salarioBase = 2000;
        
        if(salarioPretendido < salarioBase) {
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if(salarioPretendido == salarioBase) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }else {
            System.out.println("AGUARDENDO RESULTADO DEMAIS CANDIDATOS");
        }
    }
}
