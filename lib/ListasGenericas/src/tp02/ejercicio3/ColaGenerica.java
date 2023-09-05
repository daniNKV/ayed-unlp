package lib.ListasGenericas.src.tp02.ejercicio3;

import lib.ListasGenericas.src.tp02.ejercicio2.ListaEnlazadaGenerica;
import lib.ListasGenericas.src.tp02.ejercicio2.ListaGenerica;

public class ColaGenerica<T>{
    ListaGenerica<T> cola;
    public void ColaGenerica(){
        this.cola = new ListaEnlazadaGenerica<T>();
    }
    public void encolar(T elemento) {
        this.cola.agregarFinal(elemento);
    }
    public void desencolar() {
        this.cola.eliminarEn(0);
    }
    public T tope() {
        return this.cola.elemento(0);
    }
    public boolean esVacia() {
        return this.cola.esVacia();
    }

}
