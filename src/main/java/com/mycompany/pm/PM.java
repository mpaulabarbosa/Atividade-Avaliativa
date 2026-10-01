package com.mycompany.pm;
import java.util.Scanner;
import java.util.ArrayList;

public class PM {

    public static void main(String[] args) {
        Veterinario veterinario1 = new Veterinario("Marcos", "000", "X", 000);
        Veterinario veterinario2 = new Veterinario("Glender", "111", "Y", 001);
        Veterinario veterinario3 = new Veterinario("Laerte", "222", "Z", 020);
        
        Sala sala1 = new Sala(1, "A", 10, "X");
        Sala sala2 = new Sala(2, "B", 15, "Y");
        Sala sala3 = new Sala(3, "C", 8, "Z");
        
        ArrayList<Atendimento> atendimentoUM = new ArrayList();
        ArrayList<Atendimento> atendimentoDOIS = new ArrayList();
        ArrayList<Atendimento> atendimentoTRES = new ArrayList();
        
        sala1.setAtendimentos(atendimentoUM);
        sala2.setAtendimentos(atendimentoDOIS);
        sala3.setAtendimentos(atendimentoTRES);
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Menu:\nCadastrar\nAssociar Veterinario\nAtribuir Atendimento\nExibir Atendimentos\nTotal de Atendimentos da Sala\nBuscar por Status\nDetalhes do Atendimento" );
        String resposta = entrada.nextLine();
        
        if (resposta.equals("Cadastrar")) {
            Atendimento atendimento1 = new Atendimento(1, "Lola", "Cachorro", "Paula", "22/03/2026", "11:54", "Sem Observação");
        }
        
        else if (resposta.equals("Associar Veterinario")) {
            sala1.setResponsavel(veterinario1);
        }
        
        else if (resposta.equals("Atribuir Atendimento")) {
            /* Como eu fiquei sem tempo, coloquei tudo definido pois não iria conseguir mais colocar para ler entrada em cada, portanto essa parte está chamando o atendimento1 que deve ser criado antes para funcionar*/
            atendimentoUM.add(atendimento1);
        }
    }
}
