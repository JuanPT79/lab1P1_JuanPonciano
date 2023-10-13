
package lab1p1_juanponciano;

import java.util.Scanner;


public class Lab1P1_JuanPonciano {


    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int numero =0;
        char character = 'a';
        double doble = 1.25;
        boolean VoF = true;
        System.out.println("Elija el ejericio");
        numero = scanner.nextInt();
        
        if (numero == 1){
            int num1 = 15;
            int num2 = 30;
            int resultado;
            resultado = 15*30;
            System.out.print("Reultado: ");
            System.out.println(resultado);
            
              
        }else if (numero == 2){            
            System.out.println ("Ingrese un número entero: ");
            int numeroUsuario1 = scanner.nextInt();
            System.out.println ("Ingrese un número entero: ");
            int numeroUsuario2 = scanner.nextInt();
            System.out.println ("Ingrese un número entero: ");
            int numeroUsuario3 = scanner.nextInt();
            
            
            double promedio = (numeroUsuario1 + numeroUsuario2 + numeroUsuario3) /3;
            
            System.out.println("Promedio: " + promedio);
            
        }else{
           System.out.println("Salió del programa.");
        }
    
    
    }



}