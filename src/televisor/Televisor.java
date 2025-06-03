
package televisor;

import java.util.Scanner;
//Trabajo de Carlos Torres Leon
public class Televisor {
    
    public static void menu(){
        System.out.println("+--------+");
        System.out.println("|  TELE  |");
        System.out.println("+--------+");
        System.out.println("\n1.Subir Canal");
        System.out.println("2.Bajar Canal");
        System.out.println("3.Subir Color");
        System.out.println("4.Bajar Color");
        System.out.println("5.Subir Volumen");
        System.out.println("6.Bajar Volumen");
        System.out.println("7.Salir");
    }
        
    public static void main(String[] args) {
        int respuestaSwi = 0;
        Tele t1 = new Tele();//instancia de la clase 
        Scanner entrada = new Scanner(System.in);
        //loop :3
        do {            
            menu();
            System.out.print("Introduzca un valor encontrado en el menu: ");
            respuestaSwi = entrada.nextInt();
            switch (respuestaSwi) {
                //Acordarse de que si no se tiene set no se pasa valor ya que tampoco tiene definido un constructor(esta vacio)
                case 1:
                    t1.subirCanal();
                    t1.getCanal();
                    break;
                case 2:
                    t1.bajarCanal();
                    t1.getCanal();
                    break;
                case 3:
                    t1.subirColor();
                    t1.getColor();
                    break;
                case 4:
                    t1.bajarColor();
                    t1.getColor();
                    break;
                case 5:
                    t1.subirVolumen();
                    t1.getVolumen();
                    break;
                case 6:
                    t1.bajarVolumen();
                    t1.getVolumen();
                    break;
                case 7:
                    System.out.println("Saliendo del programa");
                    entrada.close();
                    break;
                default:
                    throw new AssertionError();
            }
        } while (respuestaSwi!=7);
    }
    
}
