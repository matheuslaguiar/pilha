package br.inatel.c215.pilha;

import java.util.ArrayList;
import java.util.List;

public class Pilha<T> {
    private List<T> elementos;
    private int qtdElementos;

    public Pilha(){
        elementos = new ArrayList<>();
    }
    public boolean pilhaVazia(){
        return qtdElementos == 0;
    }
    public void push(T elemento){
        elementos.add(elemento);
        qtdElementos++;
    }

    public int getQtdElementos() {
        return qtdElementos;
    }
}
