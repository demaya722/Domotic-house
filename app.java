import java.util.Scanner;

public class app {

    // VARIABLES GLOBALS
    static boolean livingRoom;
    static boolean kitchen;
    static boolean bathroom;
    static boolean bedroom1;
    static boolean bedroom2;
    static boolean bedroom3;

    // Llums
    static  int lightOption;
    static int roomOption;

    // Calefacció
    static boolean temperatureON;
    static double temperature = 0.0;

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

            if (menuOption == 1) { // Llums
                lightsRooms(scanner);

            } else if (menuOption == 2) { // Temperatura
                temperature(scanner);

            } else if (menuOption == 3) { // Ventiladors

            } else if (menuOption == 4) { // Finestres

            } else if (menuOption == 5) { // Sortir del programa

            } else {
                System.out.println("Opció invàlida. Torna-ho a intentar.");
            }

        } while (menuOption != 5);

        scanner.close();
    }

    public static void lightsRooms(Scanner scanner) {

        // Variablers

        // Menu de les llums
        show_Light_Menu(); // public statuc void...

        System.out.print("Selecciona una habitació: ");

        roomOption = scanner.nextInt();
        if (roomOption >= 1 && roomOption <= 6) { // Opcions de les llums de les habitacions
            System.out.println("1- Llums ON");
            System.out.println("2- Llums OFF");

            System.out.print("Selecciona una opció: ");
            int lightOption = scanner.nextInt();


            // Switch per saber quines llums encenem o apaguem
            switch (roomOption) {
                case 1: // Menjador
                    livingRoom = (lightOption == 1);
                    light_ON_OFF(); // public statuc void...
                    break;
                    
                case 2: // Cuina
                    kitchen = (lightOption == 1);
                    light_ON_OFF(); // public statuc void...
                    break;

                case 3: // Lavabo
                    bathroom = (lightOption == 1);
                    light_ON_OFF(); // public statuc void...
                    break;

                case 4: // Habitació 1
                    bedroom1 = (lightOption == 1);
                    light_ON_OFF(); // public statuc void...
                    break;

                case 5: // Habitació 2
                    bedroom2 = (lightOption == 1);
                    light_ON_OFF(); // public statuc void...
                    break;

                case 6: // Habitació 3
                    bedroom3 = (lightOption == 1);
                    light_ON_OFF(); // public statuc void...
                    break;
            }

        } else if (roomOption == 7) {
            System.out.println("Tornant al menú principal...");
        } else {
            System.out.println("Opció invàlida.");
        }
    }

    private static void show_Light_Menu() {
        System.out.println("===== SELECCIONA L'HABITACIÓ =====");
        System.out.println("1- Menjador");
        System.out.println("2- Cuina");
        System.out.println("3- Lavabo");
        System.out.println("4- Habitació 1");
        System.out.println("5- Habitació 2");
        System.out.println("6- Habitació 3");
        System.out.println("7- Tornar al menú principal");
    }

    public static void light_ON_OFF(){

        // Variable
        if (lightOption == 1) {
                        System.out.println("Llums de l'habitació " + roomOption + ": Llums ON");
                    } else {
                        System.out.println("Llums de l'habitació " + roomOption + ": Llums OFF");
                    }
    }

    public static void temperature(Scanner scanner) {

        menu_Temperature(); // public statuc void...
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
            show_Climate_Temperature(); // public statuc void...

        } else if (temperatureOptions == 4) {
            System.out.println("Tornant al menú principal...");

        } else {
            System.out.println("Opció invàlida.");
        }
    }

    public static void menu_Temperature(){
        System.out.println("===== MENÚ CALEFACCIÓ =====");
        System.out.println("1- Encendre calefacció");
        System.out.println("2- Apagar calefacció");
        System.out.println("3- Mostrar estat");
        System.out.println("4- Tornar al menú principal");
    }

    public static void show_Climate_Temperature() {
        if (temperatureON) {
            System.out.println("La calefacció ON a " + temperature);
        } else {
            System.out.println("La calefacció OFF");
        }
    }
}
