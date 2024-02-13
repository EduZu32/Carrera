package model;

public class Coche {
        private String marca, modelo , matricula;
        private int cv;
        private double cc;
        private int distanciaRecorrida;

        //Constructor
        public Coche(){

        };
        public Coche(String marca, String modelo, String matricula, int cv, double cc) {
            this.marca = marca;
            this.modelo = modelo;
            this.matricula = matricula;
            this.cv = cv;
            this.cc = cc;
            this.distanciaRecorrida = 0;
        }


    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCv() {
        return cv;
    }

    public double getCc() {
        return cc;
    }

    public String getMatricula() {
            return matricula;
        }

        public int getDistanciaRecorrida() {
            return distanciaRecorrida;
        }

        public void acelerar(int distancia) {
            this.distanciaRecorrida += distancia;
        }

}
