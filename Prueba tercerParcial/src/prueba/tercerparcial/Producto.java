package prueba.tercerparcial;

import java.util.ArrayList;
import java.util.Scanner;
public class Producto {
    Scanner entrada = new Scanner(System.in);
    ArrayList <Integer> producto = new ArrayList();
    float codigo;
    String nombre;
    String tipo;
    float precio;

    public Producto(float codigo, String nombre, String tipo, float precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
    }

    public float getCodigo() {
        return codigo;
    }

    public void setCodigo(float codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getProducto() {
        return precio;
    }

    public void setProducto(float producto) {
        this.precio = precio;
    }
    
}
