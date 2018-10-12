/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploarrays;
//array: agrupacion de varias variables 

import java.util.Arrays;

/**
 *
 * @author pilar
 */
public class EjemploArrays {
    
    boolean [] listaAprobados = new boolean[34];
            //primero tipo de datos del array y despues el nombre del array
            //se inicializa con new y hay que especificar cuantos boolean habra
    
    
    String palabra = "ola k ase!";
        char[] palabraChar = {'o','l','a',' ', 'k',' ','a','s','e','!'};
        
        String [] meses = {"Enero", "Febrero", "Marzo","Abril"};
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        EjemploArrays ejemplo1 = new EjemploArrays();
//        ejemplo1.listaAprobados[2] = true;
//        
//        System.out.println(Arrays.toString(ejemplo1.listaAprobados));
//        
//        for (int i=0; i <ejemplo1.listaAprobados.length; i++){
//             ejemplo1.listaAprobados[i] = true;
//           System.out.print(ejemplo1.listaAprobados[i] + " ");
//             
        
       System.out.println(ejemplo1.meses[2]);
        
        }
}
        
        

   
//}


//length sirve para saber cuantos elementos tiene el array, en vez de poner un numero magico