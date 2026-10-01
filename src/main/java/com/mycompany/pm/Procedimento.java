/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pm;

/**
 *
 * @author 1197600
 */
public class Procedimento {

    public Procedimento() {
    }

    public Procedimento(String nome, double duracao, double valor, int complexidade) {
        this.nome = nome;
        this.duracao = duracao;
        this.valor = valor;
        this.complexidade = complexidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getComplexidade() {
        return complexidade;
    }

    public void setComplexidade(int complexidade) {
        this.complexidade = complexidade;
    }
    
    private String nome;
    private double duracao;
    private double valor;
    private int complexidade; 
}
