//Java, Intelillij
package Ejercicio_01;

public class coche2 {
    //variables
    String marca = "";
    String modelo = "";
    String color = "";
    int anio;
    float nivel_combustible;
    boolean motor_encendido;

    public void Automovil(boolean motor_encendido, String marca, String modelo, String color, int anio, float nivel_combustible) {
        this.motor_encendido = motor_encendido;
        this.marca = marca;
        this.anio = anio;
        this.color = color;
        this.modelo = modelo;
        this.nivel_combustible = 10; //La inicilializa en un valor
    }

    //metodos
    public void CaracAutomovil() {
        System.out.println("El vehiculo es de marca: " + this.marca + "\n" +
                "El modelo del vehiculo es: " + this.modelo + "\n" +
                "El año del vehiculo es: " + this.anio + "\n" +
                "El color del vehiculo es : " + this.color);
    }

    public void Encender() {

        System.out.println("El motor esta encendido. Su nivel de combustible esta en: " + nivel_combustible + " galones");
    }

    public void Apagar() {
        System.out.println("El motor esta apagado");
    }

    public float Acelerar(Double Kilometros) {
        double niv = nivel_combustible -= Kilometros;
        System.out.println("Has recorrido " + Kilometros * 2 + " kilometros y " +
                "tu nivel de combustible se encuentra en: " + nivel_combustible + " galones");
        if (nivel_combustible <= 2) {
            System.out.println("Tu combustible es bajo deberias repostar");
        }
        return nivel_combustible;
    }

    public float Repostar(double cantidad) {
        System.out.println("A continuación vas a repostar combustible, tu nivel de combustible es: " + nivel_combustible +
                " recuerda no sobrepasar los 10 galones permitidos");
        double nivel = nivel_combustible += cantidad;
        if (nivel>10){
            System.out.println("No puedes recargar esta cantidad porque exece el limite permitido");
        }else {
            System.out.println("Recargaste " + cantidad + " galones correctamente. Tu nivel actual de combustible: " + nivel_combustible);
        }
        return nivel_combustible;
    }

    public static void main(String[] args) {
        coche2 carro = new coche2();
        carro.Automovil(true, "Toyota", "Fortuner", "Blanco",
                2024, carro.nivel_combustible);
        carro.CaracAutomovil();
        if (carro.motor_encendido == false) {
            carro.Apagar();
        } else {
            carro.Encender();
            carro.Acelerar(6.4);
            carro.Repostar(4.3);
        }
    }
}