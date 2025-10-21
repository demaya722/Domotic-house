import java.util.Scanner;

public class App222 {

    // Variables globals
    static boolean livingRoom;
    static boolean bathroom;
    static boolean kitchen;
    static boolean bedroom1;
    static boolean bedroom2;
    static boolean bedroom3;
    static boolean heaterOn = false;
    static double temperature = 0.0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int menuOption = 0;
        int roomOption = scanner.nextInt();


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

            switch (menuOption) {
                case 1:
                    lihtsTurn_ON_OFF(scanner);
                    break;

                case 2:
                    temperatureActive(scanner);
                    break;

                case 3:
                    System.out.println("Has escollit el ventilador.");
                    break;

                case 4:
                    System.out.println("Has escollit les finestres.");
                    break;

                case 5:
                    System.out.println("Sortint del programa...");
                    break;

                default:
                    System.out.println("Opció invàlida. Torna-ho a intentar.");
            }

        } while (menuOption != 5);

        scanner.close();
    }

    // -----------------------------
    // FUNCIONS AUXILIARS
    // -----------------------------

    public static void lihtsTurn_ON_OFF(Scanner scanner) {
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
            System.out.println("1- Llums ENCENDRE");
            System.out.println("2- Llums APAGAR");
            System.out.print("Selecciona una opció: ");
            int lightOption = scanner.nextInt();

            boolean state = lightOption == 1;

            switch (roomOption) {
                case 1:
                    livingRoom = state;
                    break;
                case 2:
                    kitchen = state;
                    break;
                case 3:
                    bathroom = state;
                    break;
                case 4:
                    bedroom1 = state;
                    break;
                case 5:
                    bedroom2 = state;
                    break;
                case 6:
                    bedroom3 = state;
                    break;
            }

            System.out.println("Llums de l'habitació " + roomOption + (state ? " ENCENDRE" : " APAGAR"));
        } else if (roomOption == 7) {
            System.out.println("Tornant al menú principal...");
        } else {
            System.out.println("Opció invàlida.");
        }
    }

    public static void temperatureActive(Scanner scanner) {
        System.out.println("===== MENÚ CALEFACCIÓ =====");
        System.out.println("1- Encendre calefacció");
        System.out.println("2- Apagar calefacció");
        System.out.println("3- Mostrar estat");
        System.out.println("4- Tornar al menú principal");
        System.out.print("Selecciona una opció: ");

        int heaterOption = scanner.nextInt();

        switch (heaterOption) {
            case 1:
                System.out.print("Introdueix la temperatura desitjada: ");
                temperature = scanner.nextDouble();
                heaterOn = true;
                System.out.println("Calefacció ENCENDRE — temperatura establerta a " + temperature + " ºC");
                break;

            case 2:
                heaterOn = false;
                System.out.println("Calefacció APAGAR");
                break;

            case 3:
                mostrarEstatClima();
                break;

            case 4:
                System.out.println("Tornant al menú principal...");
                break;

            default:
                System.out.println("Opció invàlida.");
        }
    }

    public static void mostrarEstatClima() {
        if (heaterOn) {
            System.out.println("La calefacció està ENCENDRE a " + temperature + " ºC");
        } else {
            System.out.println("La calefacció està APAGAR");
        }
    }
}
