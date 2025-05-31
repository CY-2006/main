

package com.mycompany.proyecto_10;
import java.util.ArrayList;

public class Proyecto_10 {
public static ArrayList<Usuario> usuarios = new ArrayList<>();
public static ArrayList<Libros> libros = new ArrayList<>();
public static ArrayList<Cupones> cupones = new ArrayList<>();
public static ArrayList<Venta> venta = new ArrayList<>();
public static ArrayList<Proveedores> proveedores = new ArrayList<>();

    public static void main(String[] args) {
Login l = new Login();
        l.setVisible(true);  
        
        /*Venta_libro a = new Venta_libro();
        a.setVisible(true);*/
   
    }
}
