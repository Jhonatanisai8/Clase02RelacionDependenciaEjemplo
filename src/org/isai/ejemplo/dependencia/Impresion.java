package org.isai.ejemplo.dependencia;

public class Impresion {
    private boolean estaEncendida;

    public void encender() {
        this.estaEncendida = true;
    }

    public void imprimir(Documento documento) {
        if (estaEncendida) {
            System.out.println("Imprimiendo doc " + documento.getTitulo());
            System.out.println("**************");
            System.out.println(documento.getCuerpo());
            System.out.println("**************");
        } else {
            System.out.println("Imprersora apagada.");
        }
    }
}
