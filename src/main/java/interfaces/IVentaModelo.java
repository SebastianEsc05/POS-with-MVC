package interfaces;

import model.Producto;

import java.util.ArrayList;
import java.util.List;

public interface IVentaModelo {

    public void agregarProducto(String nombre, int cantidad, double precio) throws Exception;
    public void finalizarVenta(double pagoCliente) throws Exception;
    public void quitarProducto(int indice);
}
