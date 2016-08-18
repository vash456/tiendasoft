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
public class Tiendasoft {

    /**
     * @param args the command line arguments
     */
    
    static Scanner lector = new Scanner(System.in);
    static Scanner lector2 = new Scanner(System.in);
    static producto[] producto = new producto[20];
    
    public static void main(String[] args) throws Throwable {
        
        int opcion;
        int i = 0;
        String buscar;
        int ventastotales = 0;
        int valor_ventastot = 0;
        
        do{
            System.out.println("\nMenu principal");
            System.out.println("1) Agregar producto ");
            System.out.println("2) buscar producto ");
            System.out.println("3) Eliminar producto ");
            System.out.println("4) Mostrar inventario ");
            System.out.println("5) Realizar venta ");
            System.out.println("6) Mostrar Ganancias totales ");
            System.out.println("7) Salir ");
            opcion = lector.nextInt();
            
            switch(opcion){
                case 1:
                    producto[i] = new producto();
                    producto[i].agregar();
                    i++;
                    break;
                case 2:
                    //buscar(2);
                    System.out.println("Nombre del producto a buscar");
                    buscar = lector2.nextLine();
                    for (int j=0;j<i;j++){
                        if (producto[j].getnombre().equals(buscar)){
                            producto[j].mostrar();
                            break;
                        }else if (j == (i-1)){
                            System.out.println("Producto no existente");
                        }
                    }
                    break;
                case 3:
                    //buscar(3);
                    System.out.println("Nombre del producto a buscar");
                    buscar = lector2.nextLine();
                    for (int g=0;g<i;g++){
                        if (producto[g].getnombre().equals(buscar)){
                            producto[g].eliminar();
                            i=i-1;
                            break;
                        } else if (g == (i-1)){
                            System.out.println("Producto no existente");
                        }
                    }
                    break;
                case 4:
                    for (int k = 0;k < i;k++){
                        System.out.println("\nProducto #"+(k+1));
                        producto[k].mostrar();
                    }
                    break;
                case 5:
                    //buscar(5);
                    System.out.println("Nombre del producto a buscar");
                    buscar = lector2.nextLine();
                    for (int y = 0;y<i;y++){
                        if (producto[y].getnombre().equals(buscar)){
                            producto[y].vender();
                            break;
                        }else if (y == (i-1)){
                            System.out.println("Producto no existente");
                        }
                            
                                
                    }
                    break;
                case 6:
                    for (int q = 0;q < i;q++){
                        System.out.println("\nProducto #"+(q+1));
                        ventastotales = ventastotales + producto[q].ventas();
                        valor_ventastot = valor_ventastot + producto[q].getvalorventas();
                    }
                    System.out.println("\nVentas Totales :"+ventastotales);
                    System.out.println("Valor de Ventas Totales :"+valor_ventastot);
                    break;
                case 7:
                    System.out.println("Programa finalizado");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
            
        }while(opcion != 7);
    }
    
    /*public static void buscar(int num) {
        String buscar;
        System.out.println("Nombre del producto a buscar");
        buscar = lector2.nextLine();
        for (int j=0;j==producto.length;j++){
            if (producto[j].getnombre().equals(buscar)){
                if (num == 2){
                    producto[j].mostrar();
                    break;
                } else if(num == 3){
                    producto[j].eliminar();
                    break;
                }else if(num == 5){
                    producto[j].vender();
                    break;
                }
                    
            } else {
                System.out.println("Producto no existente");
                break;
            }
        }
    }*/
    
}
