package br.inatel.c215;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.inatel.c215.pilha.Pilha;

public class TestePilha {

    @Test
    public void testePilhaEstaVazia(){
        Pilha <Integer> pilha = new Pilha<>();
        boolean resultado = pilha.pilhaVazia();

        assertTrue(resultado);
    }

    @Test
    public void testePush2Elementos(){
        Pilha <Integer> pilha = new Pilha<>();
        pilha.push(13);
        pilha.push(23);
        assertFalse(pilha.pilhaVazia());
        assertEquals(2, pilha.getQtdElementos());
        
    }
}

