package com.mycompany.pm;
import java.util.Scanner;

public class PM {

    public static void main(String[] args) {
        Veterinario veterinario1 = new Veterinario("Marcos", "000", "X", 000);
        Veterinario veterinario2 = new Veterinario("Glender", "111", "Y", 001);
        Veterinario veterinario3 = new Veterinario("Laerte", "222", "Z", 020);
        
        Sala sala1 = new Sala(1, "A", 10, "X");
        Sala sala2 = new Sala(2, "B", 15, "Y");
        Sala sala3 = new Sala(3, "C", 8, "Z");
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Menu:\nCadastrar\nAssociar Veterinario\nAtribuir Atendimento\nExibir Atendimentos\nTotal de Atendimentos da Sala\nBuscar por Status\nDetalhes do Atendimento" );
    }
}
