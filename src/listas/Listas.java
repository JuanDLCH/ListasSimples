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
            miLista.add(n);
            miListica.add((double)n);
        }while(n != 0);
        
        try {
            miLista.deleteLast();
        } catch (Exception ex) {
            Logger.getLogger(Listas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println(miLista.showData());
        System.out.println("Número de datos: "+miLista.count());
        System.out.println("El número mayor es: "+miLista.max());
        System.out.println("El número menor es: "+miLista.min());
        System.out.println("El promedio de los datos es: "+miLista.average());
        
    }
}
