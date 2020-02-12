/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

/**
 *
 * @author s208e19
 */
public class Listas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        SinglyLinkedList<Integer> miLista = new SinglyLinkedList<>();
        SinglyLinkedList<Double> miListica = new SinglyLinkedList<>();
        int n=0;
        do{
            System.out.println("Ingresar un número a la lista");
            n = teclado.nextInt();
            if(miLista.exists(n)){
                System.out.println("El dato ya existe");
            }
            else{
                if(n!=0){
                    miLista.add(n); //Añade en primera posición
                    //miLista.addOrdered(n); //Añade ordenando de mayor a menor
                    //miLista.addLast(n); //Añadir nodo al final de la lista
                }
            }
        }while(n != 0);
        
        try {
            miLista.deleteLast();
        } catch (Exception ex) {
            Logger.getLogger(Listas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try{
            miLista.delete(45); //Se le da como parámetro un dato a borrar
        }
        catch(Exception e){
            Logger.getLogger(Listas.class.getName()).log(Level.SEVERE, null, e);
        }
        
        try{
            miLista.anadirDelante(10,82); //Se le da como parámetros, el nodo existente y el nodo a añadir
        }
        catch(Exception e){
            Logger.getLogger(Listas.class.getName()).log(Level.SEVERE, null, e);
        }
        
        miLista.modificarNodo(69, 96); //Cambia el dato de un nodo, se debe especificar el dato a cambiar
        //(Parámetros, dato nuevo, datoviejo)
        System.out.println(miLista.showData());
        System.out.println("Número de datos: "+miLista.count());
        System.out.println("El número mayor es: "+miLista.max());
        System.out.println("El número menor es: "+miLista.min());
        System.out.println("El promedio de los datos es: "+miLista.average());
        if(miLista.count() == miListica.count()){
            System.out.println("Tienen el mismo tamaño");
        }
        else{
            System.out.println("No lo tienen");
            
        }
        System.out.println(miLista.equals(miLista)); //Retorna verdadero si las 2 listas son iguales;
        System.out.println("Juan Diego Londoño Chavarría - Estructura de Datos");
        
    }
}
