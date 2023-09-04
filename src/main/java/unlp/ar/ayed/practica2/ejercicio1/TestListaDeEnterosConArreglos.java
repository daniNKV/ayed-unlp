package unlp.ar.ayed.practica2.ejercicio1;

import lib.ListasDeEnteros.src.tp02.ejercicio1.ListaDeEnterosConArreglos;

public class TestListaDeEnterosConArreglos {
    public static void main(String [] args) {
        ListaDeEnterosConArreglos lista = new ListaDeEnterosConArreglos();
        lista.agregarInicio(1);
        lista.agregarInicio(2);
        lista.agregarInicio(3);

        lista.agregarFinal(5);

        lista.comenzar();

        while (!lista.fin()) {
            System.out.print(lista.proximo() + " ");
        }
    }
}
