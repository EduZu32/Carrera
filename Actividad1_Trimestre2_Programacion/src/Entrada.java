import model.Carrera;
import model.Coche;

import java.util.Scanner;

public class Entrada {
static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        Coche coche1 = new Coche("Ford","Escort","M-9453-LU",115,1.8);
        Coche coche2 = new Coche("Renault","Clio","V-0192-DS",147,2.0);
        System.out.println("\n Introduce los KM totales del circuito de hoy");
        int kmTotales = teclado.nextInt();
        System.out.println("Introduce las vueltas del circuito");
        int numeroVueltas = teclado.nextInt();
        Carrera carrera = new Carrera(coche1, coche2, kmTotales, numeroVueltas);
        carrera.iniciarCarrera(teclado);
        teclado.close();

    }
}
 