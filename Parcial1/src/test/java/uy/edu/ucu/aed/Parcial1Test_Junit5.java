package uy.edu.ucu.aed;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for implemented methods.
 */
public class Parcial1Test_Junit5 {
    String instanceVariable;

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
        // Release any resources or clean up after the tests
        instanceVariable = null;
    }

    /**
     * Sample test in JUnit 5
     */
    @Test
    public void ltimArbolVacio() {
        TArbolDeProductos arbol = new TArbolDeProductos();

        assertEquals(-1, arbol.ltim());
    }

    @Test
    public void ltimArbol2Elemento() {
        TArbolDeProductos arbol = new TArbolDeProductos();
        Producto nuevoProducto = new Producto(1, "instanceVariable");
        arbol.insertar(nuevoProducto.getIdentificador(), nuevoProducto);

        nuevoProducto = new Producto(2, "instanceVariable");
        arbol.insertar(nuevoProducto.getIdentificador(), nuevoProducto);

        assertEquals(0.5, arbol.ltim());
    }
}
