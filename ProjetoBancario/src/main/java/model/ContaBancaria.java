/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author samue
 */
public class ContaBancaria {
    
    private int numeroConta;
    private String nomeTitular;
    private double depositoInicial;
    private double saldo;
    
    public void contaBancaria(int numeroConta, String nomeTitular, double depositoInicial) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.depositoInicial = depositoInicial;
    }
    
    public void contaBancaria(int numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
    }
    
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    
    public int getNumeroConta() {
        return numeroConta;
    }
    
    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }
    
    public String getNomeTitular() {
        return nomeTitular;
    }
    
    public void setDepositoInicial(double depositoInicial) {
        this.depositoInicial = depositoInicial;
    }
    
    public double getDepositoInicial() {
        return depositoInicial;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    
    public void deposito(double deposito) {
        
        saldo = depositoInicial+deposito;  
    }
    
    public void saque(double saque) {
        saque+=5;
        saldo-=saque;
    }
}
