/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.bmoranter.a010;
import java.util.Scanner;
/**
 *
 * @author Benito Mv
 */
public class SPP2BMoranteRA010 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //ACT 09
      //Hacer un programa Java que sume 2 matrices de tamaño y contenido determinados por el usuario.
      //uso de métodos
      //validación de enteros
      int tamaño = solicitarTamaño();
        int [][] a = arreglo ("A", tamaño);
        int [][] b = arreglo ("B", tamaño);
        
        restaMatriz (a,b);
        multiplicacionMatriz (a,b);
       
    }
    public static int solicitarTamaño(){
        Scanner sc = new Scanner (System.in);
        boolean flag;
        int a = 0;
        do{
            try{
                System.out.println("Ingresa el tamaño del arreglo: ");
                a = sc.nextInt();
                flag = false;
            }
            catch (Exception e){
                System.out.println("Ingresa otra vez el tamaño del arreglo");
                sc.next();
                flag = true;
            }
        }
        while (flag);
        return a;
    }
    public static int solicitarEntero(){
        Scanner sc = new Scanner (System.in);
        boolean flag;
        int a = 0;
        do{
            try{
                System.out.println("Escribe un entero: ");
                a = sc.nextInt();
                flag = false;
            }
            catch (Exception e){
                System.out.println("Error");
                sc.next();
                flag = true;
            }
        }
        while (flag);
        return a;
    }
    public static int [][] arreglo (String a, int tamaño){
        int [][]arreglo = new int [tamaño][tamaño];
        System.out.println("Arreglo: " + a );
        for (int i = 0; i < arreglo.length; i++){
        for (int j = 0; j < arreglo[i].length; j++){
        arreglo [i][j] = solicitarEntero();
        }
        }
        return arreglo;
    }
    public static int [][] restaMatriz (int [][]a, int[][]b){
        int [][] r = new int [a.length] [a.length];
        System.out.println("Suma: ");
        for (int i = 0; i < r.length; i++){
        for (int j = 0; j < r[i].length; j++){
        r[i][j] = a[i][j] - b[i][j];
        System.out.println("["+r[i][j]+"]");   
    }
        System.out.println("");   
    }
        return r; 
    }
   
    public static void multiplicacionMatriz(int[][] a,int[][] b){
        int[][]r=new int[a.length][a.length];
        System.out.println("Multiplicación: ");
        for (int i=0; i<r.length; i++){
            for (int j=0; j<r.length; j++){
                for (int z=0; z<r.length; z++){
                    r[i][j]+=(a[i][z]*b[z][j]);
                }
            System.out.println("El valor ("+i+","+j+") es igual a: "+(r[i][j]));
            }
        }
    }    
}