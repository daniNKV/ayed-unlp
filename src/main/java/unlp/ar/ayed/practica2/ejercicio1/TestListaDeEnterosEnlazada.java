package unlp.ar.ayed.practica2.ejercicio1;

import lib.ListasDeEnteros.src.tp02.ejercicio1.ListaDeEnteros;
import lib.ListasDeEnteros.src.tp02.ejercicio1.ListaDeEnterosEnlazada;

public class TestListaDeEnterosEnlazada {
    public static void main(String [] args) {
        ListaDeEnterosEnlazada lista = new ListaDeEnterosEnlazada();

        testListaDeEnterosEnlazada(lista);

        System.out.println();

        lista.comenzar();
        imprimirOrdenInverso(lista);

        System.out.println();
        calcularMiembrosSucesionConsola(6);

        ListaDeEnterosEnlazada miembrosSucesion = calcularMiembrosSucesion(6);
        miembrosSucesion.comenzar();
        for(int i = 0; i < miembrosSucesion.tamanio(); i++) {
            System.out.print(miembrosSucesion.proximo() + " ");
        }

    }
    public static void testListaDeEnterosEnlazada(ListaDeEnterosEnlazada lista) {
        lista.agregarInicio(2);
        lista.agregarInicio(1);
        lista.agregarFinal(3);

        lista.comenzar();
        while (!lista.fin()) {
            System.out.print(lista.proximo() + " ");
        }
    }
    public static void imprimirOrdenInverso(ListaDeEnteros lista) {
        if (lista.fin()) {
            return;
        }
        int dato = lista.proximo();
        imprimirOrdenInverso(lista);
        System.out.print(dato + " ");
    }

    public static ListaDeEnterosEnlazada calcularMiembrosSucesion(int n) {
        int dato;
        ListaDeEnterosEnlazada lista;
        if (n == 1) {
            lista = new ListaDeEnterosEnlazada();
            return lista;
        }
        if (n % 2 == 0) {
            dato = n / 2;
        } else {
            dato = 3 * n + 1;
        }
        lista = calcularMiembrosSucesion(dato);
        lista.agregarInicio(dato);
        return lista;
    }

    public static void calcularMiembrosSucesionConsola(int n) {
        int dato;
        System.out.print(n + " ");
        if (n == 1) {
            return;
        }
        if (n % 2 == 0) {
            dato = n / 2;
        } else {
            dato = 3 * n + 1;
        }

        calcularMiembrosSucesion(dato);
    }
}
