/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo05;

/**
 *
 * @author reroes
 */
public class Ejemplo05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("----------------");
        System.out.println(10 / 3);
        // esta operacion sirve para dividir números enteros
        
        System.out.println("----------------");
        System.out.println(10 / 3.0);
        // esta operacion sirve para dividir números con decimales
        
        System.out.println("----------------");
        System.out.println(10 / 3.0 + 1);
        System.out.println(10 / (3.0 + 1));
        // esta operacion sirve para calcular de acuerdo con jerarquías de paréntesis
        
        System.out.println("----------------");
        System.out.println(10 % 3 );
        // esta operacion es para hacer el cálculo el residuo
        
        System.out.println("----------------");
        System.out.println(Math.pow(10, 2));
        // esta operacion es para potenciar cifras
        System.out.println("----------------");
        System.out.println(Math.sqrt(16));
        // esta operacion es para calcular la raiz cuadrada
        
        double m = Math.sqrt(16);
        System.out.println(m);
        // esta operacion sirve para asignar un valor a una variable y sacarle la raíz cuadrada
        
    }

}
