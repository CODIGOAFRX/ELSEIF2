/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ifelse;

/**
 *
 * @author AlumnoT
 */
public class IFELSE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double nota1 = 7 ;
        double nota2 = 10 ;
        double nota3 = 6 ;       
        double promedio ;
                
        promedio = (nota1 + nota2 + nota3) /3 ;
        
        if(promedio < 5) {
            System.out.println("INSUFICIENTE, tu nota es " + promedio);
            
        } // else if se usa para seguir metiendo condiciones cuando el if primero no se ha completado
        else if (promedio >= 5 && promedio <6) { // un = es asignar y == es realizar comprobación
            System.out.println("SUFICIENTE, tu nota es " + promedio);
        }
         else if (promedio >= 6 && promedio <7) { // un = es asignar y == es realizar comprobación
            System.out.println("BIEN, tu nota es " + promedio);
        }
         else if (promedio >= 7 && promedio <9 ) { // ||-> SIGNIFICA "o"
            System.out.println("NOTABLE, tu nota es " + promedio);
        }
        else if (promedio >= 9) { // ||-> SIGNIFICA "o" , & significa "y"
            System.out.println("SOBRESALIENTE, tu nota es " + promedio);
        }
    }
    
}
// El else es lo que quieres que pase cuando el if no se cumple mientras que el else if sirve para seguir metiendo condiciones a los datos referidos