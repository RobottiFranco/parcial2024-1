package uy.edu.ucu.aed;

public class TArbolDeProductos extends TArbolBB<Producto> {
    public int lti(int nivel) {
        if (!esVacio()) {
            return this.raiz.lti(nivel);
        }
        return -1;

    }

    public double ltim() {
        if (!esVacio()) {
        double cantidadNodos = this.obtenerTamanio();
        double lti = this.lti(0);

        return lti / cantidadNodos;
        }
        return -1;
    }
}
