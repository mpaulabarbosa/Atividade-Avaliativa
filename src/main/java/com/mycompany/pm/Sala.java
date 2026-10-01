/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pm;
import java.util.ArrayList;
/**
 *
 * @author 1197600
 */
public class Sala {

    public Sala(int numero, String bloco, int maxima, String tipo) {
        this.numero = numero;
        this.bloco = bloco;
        this.maxima = maxima;
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

    public int getMaxima() {
        return maxima;
    }

    public void setMaxima(int maxima) {
        this.maxima = maxima;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    /*Associa o responsável*/
    public Veterinario getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Veterinario responsavel) {
        this.responsavel = responsavel;
    }

    public ArrayList getAtendimentos() {
        return atendimentos;
    }

    public void setAtendimentos(ArrayList atendimentos) {
        this.atendimentos = atendimentos;
    }

    private int numero;
    private String bloco;
    private int maxima;
    private String tipo;
    private Veterinario responsavel;
    private ArrayList<Atendimento> atendimentos;
    
    public void ExibirAtendimentos() {
        for (Atendimento atendimento : atendimentos) {
            System.out.println(atendimento.getCodigo());
        }
        System.out.println("O número total de atendimentos é " );
    }
    
    public int QuantidadeAtendimentos() {
        int contador = atendimentos.size();
        return contador;
    }
}
