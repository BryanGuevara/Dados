package dados;

import java.util.Random;
import java.util.Scanner;

public class Dados {

    public static void main(String[] args) {
        int dados;
        int caras;
        int valor = 0;
        Random numDado = new Random();
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese cuantas caras tendran los dados: ");
        caras = scan.nextInt();

        System.out.print("Ingrese cuántos dados desea lanzar: ");
        dados = scan.nextInt();

        if (caras <= 0 || dados <= 0) {
            System.out.println("Error: el número de dados y caras debe ser mayor a cero.");
            return;
        }

        for (int i = 0; i < dados; i++) {
            int tirada = numDado.nextInt(caras) + 1;
            System.out.println("Dado " + (i + 1) + ": " + tirada);
            valor += tirada;
        }

        System.out.println("Valor de la tirada " + dados + "D" + caras + ": " + valor);
    }
}
