import java.util.Scanner;

public class app {

    // VARIABLES GLOBALS
    static boolean livingRoom;
    static boolean kitchen;
    static boolean bathroom;
    static boolean bedroom1;
    static boolean bedroom2;
    static boolean bedroom3;

    // Calefacció
    static boolean temperatureON;
    static double temperature = 0.0;

    // MAIN
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int menuOption = 0;

        do { // bucle principal
             // MENÚ PRINCIPAL
            System.out.println("============ MENÚ ============");
            System.out.println("1- Llums");
            System.out.println("2- Calefacció");
            System.out.println("3- Ventilador");
            System.out.println("4- Finestres");
            System.out.println("5- Sortir");
            System.out.print("Escull una opció (1-5): ");

            menuOption = scanner.nextInt();

            if (menuOption == 1) {
                lightsRooms(scanner);

            } else if (menuOption == 2) {
                temperature(scanner);

            } else if (menuOption == 3) {
                System.out.println("Has escollit el ventilador.");

            } else if (menuOption == 4) {
                System.out.println("Has escollit les finestres.");

            } else if (menuOption == 5) {
                System.out.println("Sortint del programa...");

            } else {
                System.out.println("Opció invàlida. Torna-ho a intentar.");
            }

        } while (menuOption != 5);

        scanner.close();
    }

    

    // public static void lightsRooms(Scanner scanner) {
        System.out.println("===== SELECCIONA L'HABITACIÓ =====");
        System.out.println("1- Menjador");
        System.out.println("2- Cuina");
        System.out.println("3- Lavabo");
        System.out.println("4- Habitació 1");
        System.out.println("5- Habitació 2");
        System.out.println("6- Habitació 3");
        System.out.println("7- Tornar al menú principal");
        System.out.print("Selecciona una habitació: ");

        int roomOption = scanner.nextInt();

        if (roomOption >= 1 && roomOption <= 6) {
            System.out.println("1- Llums ON");
            System.out.println("2- Llums OFF");
            System.out.print("Selecciona una opció: ");
            int lightOption = scanner.nextInt();

            switch (roomOption) {
                case 1: // Menjador
                    if (lightOption == 1)
                        livingRoom = true;
                    else
                        livingRoom = false;
                    break;
                case 2: // Cuina
                    if (lightOption == 1)
                        kitchen = true;
                    else
                        kitchen = false;
                    break;
                case 3: // Lavabo
                    if (lightOption == 1)
                        bathroom = true;
                    else
                        bathroom = false;
                    break;
                case 4: // Habitació 1
                    if (lightOption == 1)
                        bedroom1 = true;
                    else
                        bedroom1 = false;
                    break;
                case 5: // Habitació 2
                    if (lightOption == 1)
                        bedroom2 = true;
                    else
                        bedroom2 = false;
                    break;
                case 6: // Habitació 3
                    if (lightOption == 1)
                        bedroom3 = true;
                    else
                        bedroom3 = false;
                    break;
            }

            System.out.println("Llums de l'habitació " + roomOption);

        } else if (roomOption == 7) {
            System.out.println("Tornant al menú principal...");
        } else {
            System.out.println("Opció invàlida.");
        }
    }

    public static void temperature(Scanner scanner) {
        System.out.println("===== MENÚ CALEFACCIÓ =====");
        System.out.println("1- Encendre calefacció");
        System.out.println("2- Apagar calefacció");
        System.out.println("3- Mostrar estat");
        System.out.println("4- Tornar al menú principal");
        System.out.print("Selecciona una opció: ");

        int temperatureOptions = scanner.nextInt();

        if (temperatureOptions == 1) {
            System.out.print("Introdueix la temperatura: ");
            temperature = scanner.nextDouble();
            temperatureON = true;
            System.out.println("Calefacció ON ==> temperatura a " + temperature);

        } else if (temperatureOptions == 2) {
            temperatureON = false;
            System.out.println("Calefacció OFF");

        } else if (temperatureOptions == 3) {
            showClimateTemperature(); //public statuc void...

        } else if (temperatureOptions == 4) {
            System.out.println("Tornant al menú principal...");

        } else {
            System.out.println("Opció invàlida.");
        }
    }

    public static void showClimateTemperature() {
        if (temperatureON) {
            System.out.println("La calefacció ON a " + temperature);
        } else {
            System.out.println("La calefacció OFF");
        }
    }
}
