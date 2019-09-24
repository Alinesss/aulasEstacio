package aulajava.flavio;

public class TestaAdicionaNoFIm {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();
         
        lista.adiciona("Marcos");
        lista.adiciona("Daniel");
        lista.adiciona("Joao");
        lista.adiciona("Carlos");
         
         System.out.println(lista);
    }
}
