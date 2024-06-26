package com.pilha;

public class Pilha {

    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public void push(No novoNo) {
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        novoNo.setRefNo(refAuxiliar);
    }

    public No pop() {
        if(!isEmpty()) {
            No refPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return refPoped;
        }
        return null;
    }

    public No top () {
        return refNoEntradaPilha;
    }

    public boolean isEmpty() {
        return refNoEntradaPilha == null ? true : false;
    }


    @Override
    public String toString() {
        String stringAuxiliar = "-----------\n";
        stringAuxiliar += "Pilha \n";
        stringAuxiliar += "-----------\n";

        No noAuxiliar = refNoEntradaPilha;

        while(true) {
            if(noAuxiliar != null) {
                stringAuxiliar += "[No{Dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            } else {
                break;
            }
        }
        stringAuxiliar += "-----------\n";
        stringAuxiliar += "Fim da pilha\n";
        stringAuxiliar += "-----------\n";

        return stringAuxiliar;
    }

}
