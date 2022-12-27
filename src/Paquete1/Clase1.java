package Paquete1;

public class Clase1 {
    public static void main(String[] args) {

        // enteros
        byte numero1 = 1; // 1 byte
        short numero2 = 10; // 2 bytes
        int numero3 = 50; // 4 bytes
        long numero4 = 100; // 8 bytes

        System.out.println("Numeros enteros: " + numero1 + " , " + numero2 + " , " + numero3 + " , " + numero4);

        // Números con Decimales
        float decimal1 = 4.9f;
        double decimal2 = 9.99d;

        System.out.println("Decimales: " + decimal1 + " , " + decimal2);

        // Cadenas de texto
        String nombre = "Jose David";
        String apellido = "Prieto";

        // Un solo caracter
        char caracter1 = 'a';

        System.out.println("Cadena de texto: " + nombre + " " + apellido + "\nCaracter: " + caracter1);

        // Booleans
        boolean verdadero = true;
        boolean falso = false;
        System.out.println(verdadero);
    }

}