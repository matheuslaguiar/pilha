package br.inatel.c215;

import br.inatel.c215.pilha.Pilha;

public class App 
{
    public static void main( String[] args )
    {
        Pilha pilha = new Pilha<Integer>();
        
        System.out.println(pilha.getQtdElementos());

    }
}
