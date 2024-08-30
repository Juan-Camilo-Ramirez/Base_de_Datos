//Java, Intelillij
package Ejercicio_02;


public class Cuenta_Bancaria {
    long Numero_cuenta;
    float Saldo;
    String Nombre_usuario;

    public void cuenta(long Numero_cuenta, float Saldo, String Nombre_usuario) {
        this.Nombre_usuario = Nombre_usuario;
        this.Numero_cuenta = Numero_cuenta;
        this.Saldo = Saldo;
    }

    public void Datos_Usuario() {
        System.out.println("Bienvenido: " + this.Nombre_usuario + "\n" +
                "Número de cuenta: " + this.Numero_cuenta + "\n" +
                "Tu saldo es: $" + Saldo);
    }

    public float Depositar(double Cantidad) {
        System.out.println("Procediendo con el deposito");
        float sum = Saldo += Cantidad;
        System.out.println("Has depositado $" + Cantidad + " en tu cuenta" + "\n"
                + "Tu saldo actual es $" + sum);
        return Saldo;
    }

    public float Retirar(double cantidad) {
        float sum = Saldo -= cantidad;
        System.out.println("Estas retirando $" + cantidad + " de tu cuenta");
        if (cantidad > Saldo) {
            System.out.println("Lo sentimos no tienes fondos suficientes");
        } else {
            System.out.println("Retiro exitoso, tu saldo actual es $" + sum);
        }
        return sum;
    }

    public float Obtener_saldo(){
        System.out.println("Tu saldo: $" + Saldo);
        return Saldo;
    }


    public static void main(String[] args) {
        Cuenta_Bancaria banco = new Cuenta_Bancaria();
        banco.cuenta(03210122333, 400000, "Juan Camilo");
        banco.Datos_Usuario();
        banco.Depositar(455.4);
        banco.Retirar(500000);
        banco.Obtener_saldo();
    }
}