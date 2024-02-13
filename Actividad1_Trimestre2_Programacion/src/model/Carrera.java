package model;

import java.util.Scanner;

public class Carrera {
    Scanner teclado = new Scanner(System.in);
    private Coche coche1;
    private Coche coche2;
    private Coche ganador;
    private int kmTotales;
    private int numeroVueltas;

    public Carrera(Coche coche1, Coche coche2, int kmTotales, int numeroVueltas) {
        this.coche1 = coche1;
        this.coche2 = coche2;
        this.kmTotales = kmTotales;
        this.numeroVueltas = numeroVueltas;

    }
    public void iniciarCarrera(Scanner teclado) {

        int aceleracion1;
        int aceleracion2;
        int velocidadInicialCoche1 = 10;
        int velocidadInicialCoche2 = 10;

        //Piloto1
        System.out.println("\n Los pilotos de esta carrera conduciran los siguentes coches: \n");
        System.out.println("Datos de los participantes:");
        System.out.println("‍🚶‍♂️Piloto 🚗Coche 1");
        System.out.println("MARCA: " + coche1.getMarca());
        System.out.println("MODELO: " + coche1.getModelo());
        System.out.println("MATRICULA: " + coche1.getMatricula());
        System.out.println("CV: " + coche1.getCv());
        System.out.println("CC: " + coche1.getCc());
        //Piloto2
        System.out.println("\n 🚶‍♀️Piloto 🚕Coche 2");
        System.out.println("MARCA: " + coche2.getMarca());
        System.out.println("MODELO: " + coche2.getModelo());
        System.out.println("MATRICULA: " + coche2.getMatricula());
        System.out.println("CV: " + coche2.getCv());
        System.out.println("CC:" + coche2.getCc() + "\n");
        System.out.println("Los pilotos arancan los motores y espera instruciones para comenzar🚦🚦🚦🚦 \n");

        for (int vuelta = 1; vuelta <= numeroVueltas; vuelta++){
            System.out.println("Vuelta " + vuelta + ":");

            // Acelerar el primer coche
            System.out.println("Introduce la acelceracion del coche1");
            aceleracion1 = teclado.nextInt();
            coche1.acelerar(velocidadInicialCoche1 += (Math.random() * aceleracion1 ));
            System.out.println("Coche 1 " + coche1.getMatricula() + " - Distancia recorrida: " + coche1.getDistanciaRecorrida() + " km");

            // Acelerar el segundo coche
            System.out.println("Introduce la acelceracion del coche2");
            aceleracion2= teclado.nextInt();
            coche2.acelerar(velocidadInicialCoche2 += (Math.random()* aceleracion2));
            System.out.println("Coche 2 " + coche2.getMatricula() + " - Distancia recorrida: " + coche2.getDistanciaRecorrida() + " km");

            // Verificar si algún coche ha alcanzado o superado la distancia total de la carrera
            if(coche1.getDistanciaRecorrida() >= kmTotales || coche2.getDistanciaRecorrida() >= kmTotales){
                elGanador();
                return;
            }

        }
        // Si ningún coche ha ganado después de todas las vueltas, determinar el ganador basado en la distancia recorrida
        elGanador();

    }

    private void elGanador() {
        if (coche1.getDistanciaRecorrida() >= kmTotales) {
            ganador = coche1;
            System.out.println("🏆🏆🏆🏆El ganador ha sido el piloto con el coche " + ganador.getMarca() + " y matrícula " + ganador.getMatricula() + "🏆🏆🏆🏆");
        } else if (coche2.getDistanciaRecorrida() >= kmTotales) {
            ganador = coche2;
            System.out.println("🏆🏆🏆🏆El ganador ha sido el piloto con el coche " + ganador.getMarca() + " y matrícula " + ganador.getMatricula() + "🏆🏆🏆🏆");
        } else {
            System.out.println("Ningún coche ha completado la carrera.");
        }

    }


}




