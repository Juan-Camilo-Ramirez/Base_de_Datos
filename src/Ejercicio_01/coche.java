package Ejercicio_01;

import java.util.Scanner;

public class coche {
    //variables
    String marca = "";
    String modelo = "";
    String color = "";
    int anio;
    float nivel_combustible = 10;
    boolean motor_encendido;

    public void coche(boolean motor_encendido, String marca, String modelo, String color, int anio, float nivel_combustible) {
        this.motor_encendido = motor_encendido;
        this.marca = marca;
        this.anio = anio;
        this.color = color;
        this.modelo = modelo;
        this.nivel_combustible = nivel_combustible;
    }
    //metodos

    public void Encender() {

        System.out.println("El motor esta encendido. Su nivel de combustible esta en: " + "\n" + nivel_combustible + " galones");
    }

    public void Apagar() {
        System.out.println("El motor esta apagado");
    }

    public float Acelerar(Double Kilometros) {
        nivel_combustible -= Kilometros;
        if (nivel_combustible <= 2) {
            System.out.println("ten cuidado el combustible se esta acabando");
        }
        return nivel_combustible;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        coche car = new coche();
        car.Acelerar(keyboard.nextDouble());
        car.motor_encendido = keyboard.nextBoolean();
        car.coche(car.motor_encendido, "Toyota", "Fortuner", "Blanca", 2024, car.nivel_combustible);
        if (car.motor_encendido == false) {
            System.out.println("El motor esta apagado");
        } else {
            System.out.println("El motor esta encendido" + "\n" +
                    "Su nivel de combustible es: " + car.nivel_combustible + " galones");
        }

        System.out.println(car.motor_encendido + " " + car.marca);
    }
}
