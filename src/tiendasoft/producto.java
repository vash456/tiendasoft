/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendasoft;

import java.util.Scanner;

/**
 *
 * @author practi24
 */
public class producto {
    private Scanner lector;
    private String nombre;
    private int cantidad, precio, ventas;
    private int eliminar = 0;

    public producto() {
        this.ventas = 0;
    }
    
    public String getnombre(){
        return nombre;
    }
    
    public void agregar(){
        lector = new Scanner(System.in);
        System.out.println("Digite el nombre: ");
        nombre = lector.nextLine();
        System.out.println("Ingrese la cantidad: ");
        cantidad = lector.nextInt();
        System.out.println("Ingrese el precio: ");
        precio = lector.nextInt();
        
    }
    
    public void mostrar(){
        if (eliminar == 0){
            System.out.println("Nombre: "+nombre);
            System.out.println("cantidad: "+cantidad);
            System.out.println("precio: "+precio);
        }else System.out.println("Producto no existente");
    }
    
    public void eliminar(){
        nombre = " ";
        cantidad = 0;
        precio = 0;
        eliminar = 1;
        System.out.println("Producto eliminado");
    }
     public void vender(){
         int cant_vender;
         lector = new Scanner(System.in);
         System.out.println("Cuantas unidades desea vender");
         cant_vender = lector.nextInt();
         if ( cant_vender<= cantidad){
            cantidad = cantidad - cant_vender;
            ventas = ventas + cant_vender;
         } else System.out.println("Rebasa la cantidad disponible");
     }
     
     public int ventas(){
        if (eliminar == 0){
            System.out.println("Nombre: "+nombre);
            System.out.println("Ventas: "+ventas);
            System.out.println("Valor ventas: "+(ventas*precio));
        } System.out.println("Producto no existente");
        return ventas;
     }
     
     public int getvalorventas(){
         return (ventas*precio);
     }
      public int geteliminar(){
          return eliminar;
      }
}
