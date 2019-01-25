package prueba.tercerparcial;

import java.util.ArrayList;
import java.util.Scanner;

public class PruebaTercerParcial {
    public static void main(String[] args) {
        ArrayList <Float> producto = new ArrayList();
        ArrayList <String> productos = new ArrayList();
        Scanner entrada = new Scanner(System.in);
        
        float codigo = 0,precio = 0;
        String nombre = null,tipo = null;
        System.out.println("[1]. Aniadir Producto\n[2]. Modificar Producto\n[3].Eliminar Producto\n[4].Buscar Producto\n Eliga su Opcion: ");
        int op = entrada.nextInt();
        switch(op){
            case 1:
                Producto p;
        p= new Producto(codigo, nombre, tipo, precio);
        
          System.out.print("Digite la cantidad de productos a ingresar: ");
         float pro = entrada.nextFloat();
         for(int i=0; i<pro; i++){
             System.out.println("Digite el codigo del producto: ");
             codigo = entrada.nextFloat();
             producto.add(codigo);
             System.out.println("Digite el nombre del producto: ");
             nombre = entrada.next();
             productos.add(nombre);
             System.out.println("Digite el tipo del producto: ");
             tipo = entrada.next();
             productos.add(tipo);
             System.out.println("Digite el precio del producto: ");
             precio = entrada.nextFloat();
             producto.add(precio);
            } 
            System.out.println("Los Productos son: "+producto+" "+productos);
         break;
        }
        
         
    }
    
}
