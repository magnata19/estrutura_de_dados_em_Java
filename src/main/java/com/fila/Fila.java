package com.fila;

public class Fila {

    private No refNoEntrada;

    public Fila(){
        this.refNoEntrada = null;
    }

    public void enqueue(No novoNo) {
        novoNo.setRefNo(refNoEntrada);
        refNoEntrada = novoNo;
    }

    public boolean isEmpty() {
        return refNoEntrada == null ? true : false;
    }
}
