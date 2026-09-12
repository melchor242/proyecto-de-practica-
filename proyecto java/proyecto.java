import java.util.Scanner;

public class proyecto{

    static String [] nombres = new String [5];
    static int [] matematicas = new int [5];
    static int [] programacion = new int [5];
    static int [] fisica = new int [5];

    public static void main (String [] args){
        nombres[0] = "omar";
        matematicas[0] = 90;
        programacion[0] = 100;
        fisica[0]= 100;

        nombres[1] = "barbara";
        matematicas[1] = 70;
        programacion[1] = 80;
        fisica [1] = 75;

        nombres [2] = "adolfo";
        matematicas [2] =45;
        programacion [2] = 30;
        fisica [2] = 20;

        nombres[3] = "isai";
        matematicas[3] = 80;
        programacion[3] = 70;
        fisica[3]= 90;

        nombres[4] = "gabriel";
        matematicas[4] = 95;
        programacion[4] = 80;
        fisica[4]= 90;


        Scanner entrada = new Scanner(System.in);

        int opcion;

            do {

                System.out.println("\n=== MENU DE ALUMNOS ===");
                System.out.println("1. Mostrar alumnos");
                System.out.println("2. Calcular promedios");
                System.out.println("3. Promedio general");
                System.out.println("4. Mostrar aprobados/reprobados");
                System.out.println("5. Salir");

                System.out.print("Selecciona una opcion: ");
                opcion = entrada.nextInt();

                switch (opcion) {

                case 1:

                    System.out.println("\n=== ALUMNOS ===");

                    for (int i = 0; i < 5; i++) {
                        System.out.println((i + 1) + ". " + nombres[i]);
                    }

                    System.out.print("Selecciona un alumno: ");
                    int alumno = entrada.nextInt();

                    if (alumno >= 1 && alumno <= 5) {

                        alumno = alumno - 1;

                        System.out.println("\n=== DATOS DEL ALUMNO ===");
                        System.out.println("Nombre: " + nombres[alumno]);
                        System.out.println("Matematicas: " + matematicas[alumno]);
                        System.out.println("Programacion: " + programacion[alumno]);
                        System.out.println("Fisica: " + fisica[alumno]);

                    } else {

                        System.out.println("Alumno no valido.");

                    }

                    break;

                case 2:

                    System.out.println("\n=== PROMEDIOS ===");

                    for (int i = 0; i < 5; i++) {

                        double promedio = calcularPromedio(
                                matematicas[i],
                                programacion[i],
                                fisica[i]
                        );

                        System.out.println(
                                nombres[i] + ": " + promedio
                        );
                    }

                    break;

                case 3:

                    System.out.println("\n=== PROMEDIO GENERAL ===");

                    double sumaPromedios = 0;

                    for (int i = 0; i < 5; i++) {

                        sumaPromedios += calcularPromedio(
                                matematicas[i],
                                programacion[i],
                                fisica[i]
                        );
                    }

                    double promedioGeneral = sumaPromedios / 5;

                    System.out.println(
                            "Promedio general: " + promedioGeneral
                    );

                    break;

                case 4:

                    System.out.println("\n=== APROBADOS Y REPROBADOS ===");

                    for (int i = 0; i < 5; i++) {

                        double promedio = calcularPromedio(
                                matematicas[i],
                                programacion[i],
                                fisica[i]
                        );

                        if (promedio >= 70) {

                            System.out.println(
                                    nombres[i] + " - APROBADO (" + promedio + ")"
                            );

                        } else {

                            System.out.println(
                                    nombres[i] + " - REPROBADO (" + promedio + ")"
                            );
                        }
                    }

                    break;

                case 5:

                    System.out.println("\nPrograma finalizado.");

                    break;

                default:

                    System.out.println("\nOpcion no valida.");
            }

        } while (opcion != 5);

        entrada.close();
    }

    public static double calcularPromedio(
            int matematicas,
            int programacion,
            int fisica) {

        return (matematicas + programacion + fisica) / 3.0;
    }
}