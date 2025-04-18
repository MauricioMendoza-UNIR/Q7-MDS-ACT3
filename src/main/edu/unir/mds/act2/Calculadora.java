package edu.unir.mds.act2;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n=== Calculadora ===");
            System.out.println("Selecciona una operación:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Raíz cuadrada");
            System.out.println("6. Exponente");
            System.out.println("7. Salir");
            System.out.print("Opción: ");
            int opcion = scanner.nextInt();

            double num1 = 0, num2 = 0, resultado = 0;

            if (opcion >= 1 && opcion <= 4 || opcion == 6) {
                System.out.print("Ingresa el primer número: ");
                num1 = scanner.nextDouble();

                System.out.print("Ingresa el segundo número: ");
                num2 = scanner.nextDouble();
            } else if (opcion == 5) {
                System.out.print("Ingresa el número: ");
                num1 = scanner.nextDouble();
            } else if (opcion == 7) {
                continuar = false;
                System.out.println("Saliendo de la calculadora...");
                break;
            } else {
                System.out.println("Opción no válida.");
                continue;
            }

            switch (opcion) {
                case 1:
                    resultado = num1 + num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 3:
                    resultado = num1 * num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 4:
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("Resultado: " + resultado);
                    } else {
                        System.out.println("Error: No se puede dividir entre cero.");
                    }
                    break;
                case 5:
                    if (num1 >= 0) {
                        resultado = Math.sqrt(num1);
                        System.out.println("Resultado: " + resultado);
                    } else {
                        System.out.println("Error: No se puede calcular la raíz de un número negativo.");
                    }
                    break;
                case 6:
                    resultado = Math.pow(num1, num2);
                    System.out.println("Resultado: " + resultado);
                    break;
            }
        }

        scanner.close();
    }
}

