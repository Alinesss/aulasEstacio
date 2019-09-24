package aulajava.flavio;

public class TesteAdicionaNoComeco {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();
        
        lista.adicionaNoComeco("Rafael");
        lista.adicionaNoComeco("Paulo");
        
        System.out.println(lista);
        
        lista.adicionaNoComeco("Ana");
        
        System.out.println(lista);
    }
}
