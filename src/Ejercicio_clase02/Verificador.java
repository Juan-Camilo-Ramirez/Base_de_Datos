package Ejercicio_clase02;
import java.util.Stack;

public class Verificador {

    public static boolean paréntesisBalanceados(String ecuación) {
        Stack<Character> pila = new Stack<>();

        for (char c : ecuación.toCharArray()) {
            if (c == '(') {
                pila.push(c);
            } else if (c == ')') {
                if (pila.isEmpty() || pila.pop() != '(') {
                    return false;
                }
            }
        }

        return pila.isEmpty();
    }
    public static void main(String[] args) {
        String ecuación1 = "3 * (2 + 5)";
        String ecuación2 = "4 + (6 - 2L";

        System.out.println("Ecuación 1: " + (paréntesisBalanceados(ecuación1) ? "Balanceada" : "Desbalanceada"));
        System.out.println("Ecuación 2: " + (paréntesisBalanceados(ecuación2) ? "Balanceada" : "Desbalanceada"));
    }
}
