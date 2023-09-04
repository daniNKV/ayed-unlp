package unlp.ar.ayed.practica2.ejercicio1;

import lib.ListasDeEnteros.src.tp02.ejercicio1.ListaDeEnterosEnlazada;

public class TestListaDeEnterosEnlazada {
    public static void main(String [] args) {
        ListaDeEnterosEnlazada lista = new ListaDeEnterosEnlazada();

        lista.agregarInicio(2);
        lista.agregarInicio(1);
        lista.agregarFinal(3);

        lista.comenzar();

        while (!lista.fin()) {
            System.out.print(lista.proximo() + " ");
        }
    }
}
