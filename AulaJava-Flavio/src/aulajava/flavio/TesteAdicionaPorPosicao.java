/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulajava.flavio;

/**
 *
 * @author AlunoTI
 */
public class TesteAdicionaPorPosicao {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();
        
        lista.adiciona("Rafael");
        lista.adiciona(0, "Paulo");
        lista.adiciona(1, "Camila");
        
        System.out.println(lista);
        
    }
}
