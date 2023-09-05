package lib.ListasGenericas.src.tp02.ejercicio3;

import lib.ListasGenericas.src.tp02.ejercicio2.ListaEnlazadaGenerica;
import lib.ListasGenericas.src.tp02.ejercicio2.ListaGenerica;

public class PilaGenerica<T> {
    ListaGenerica<T> pila;
    public void ColaGenerica(){
        this.pila = new ListaEnlazadaGenerica<T>();
    }
    public void apilar(T elemento) {
        this.pila.agregarEn(elemento, 0);
    }
    public void desapilar() {
        this.pila.eliminarEn(0);
    }
    public T tope() {
        return this.pila.elemento(0);
    }
    public boolean esVacia() {
        return this.pila.esVacia();
    }
}
