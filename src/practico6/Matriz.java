/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico6;

/**
 *
 * @author mgara
 */
public class Matriz {
    
    void armar(){
        int i;
        int x;
        int valor=3;
        int matriz[][]= new int[4][];
        matriz[0]= new int[4];
        matriz[1]= new int[3];
        matriz[2]= new int[5];
        matriz[3]= new int[2];
        for(i=0;i<matriz.length;i++){/*Filas*/
            System.out.print("\nFila "+(i+1)+":  ");
            for(x=0;x<matriz[i].length;x++){/*columnas*/
                matriz[i][x]=valor;
                valor+=3;
                if(matriz[i][x]%2==0){
                    System.out.print(" "+matriz[i][x]);
                }
            }
        }
        
    }
}
