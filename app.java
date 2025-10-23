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
    static int lightOption;
    static int roomOption;

    // Calefacció
    static boolean temperatureON;
    static double temperature = 0.0;

    // Finestres
    static int blind_Room_Option;
    static int blind_Option;
    static boolean blinds_ON;
    static double blinds = 0.0;

    //  Ventilador
    static int fan_Room_Option;
    static int fan_Option;
    static boolean fan_ON;
    static int fanSpeed = 0;



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int menuOption = 0;

        do { // bucle principal
             // MENÚ PRINCIPAL
            System.out.println("============ MENÚ ============");
            System.out.println("1- Llums");
            System.out.println("2- Calefacció");
            System.out.println("3- Finestres");
            System.out.println("4- Ventilador");
            System.out.println("5- Sortir");
            System.out.print("Escull una opció (1-5): ");

            menuOption = scanner.nextInt();

            if (menuOption == 1) { // Llums
                lightsRooms(scanner);

            } else if (menuOption == 2) { // Temperatura
                temperature(scanner);

            } else if (menuOption == 3) { // Ventiladors
                blinds(scanner);

            } else if (menuOption == 4) { // Finestres

            } else if (menuOption == 5) { // Sortir del programa

            } else {
                System.out.println("Opció invàlida. Torna-ho a intentar.");
            }

        } while (menuOption != 5);

        scanner.close();
    }

    // LLUMS
    public static void lightsRooms(Scanner scanner) {

        // Menu de les llums
        light_Menu(); 

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
                    light_ON_OFF(); 
                    break;

                case 2: // Cuina
                    kitchen = (lightOption == 1);
                    light_ON_OFF(); 
                    break;

                case 3: // Lavabo
                    bathroom = (lightOption == 1);
                    light_ON_OFF(); 
                    break;

                case 4: // Habitació 1
                    bedroom1 = (lightOption == 1);
                    light_ON_OFF(); 
                    break;

                case 5: // Habitació 2
                    bedroom2 = (lightOption == 1);
                    light_ON_OFF(); 
                    break;

                case 6: // Habitació 3
                    bedroom3 = (lightOption == 1);
                    light_ON_OFF(); 
                    break;
            }

        } else if (roomOption == 7) {
            System.out.println("Tornant al menú principal...");
        } else {
            System.out.println("Opció invàlida.");
        }
    }

    private static void light_Menu() {
        System.out.println("===== SELECCIONA L'HABITACIÓ =====");
        System.out.println("1- Menjador");
        System.out.println("2- Cuina");
        System.out.println("3- Lavabo");
        System.out.println("4- Habitació 1");
        System.out.println("5- Habitació 2");
        System.out.println("6- Habitació 3");
        System.out.println("7- Tornar al menú principal");
    }

    public static void light_ON_OFF() {

        if (lightOption == 1) {
            System.out.println("Llums de l'habitació " + roomOption + ": Llums ON");
        } else {
            System.out.println("Llums de l'habitació " + roomOption + ": Llums OFF");
        }
    }

    // CALEFACCIÓ
    public static void temperature(Scanner scanner) {

        menu_Temperature();
        System.out.print("Selecciona una opció: ");

        int temperatureOptions = scanner.nextInt();

        if (temperatureOptions == 1) { // SI la temperatura està encesa demana emperatura
            System.out.print("Introdueix la temperatura: ");
            temperature = scanner.nextDouble();
            temperatureON = true;
            System.out.println("Calefacció ON ==> temperatura a " + temperature);

        } else if (temperatureOptions == 2) {
            temperatureON = false;
            System.out.println("Calefacció OFF");

        } else if (temperatureOptions == 3) { // Mostra l'estat de la calefació
            show_Climate_Temperature();

        } else if (temperatureOptions == 4) {
            System.out.println("Tornant al menú principal...");

        } else {
            System.out.println("Opció invàlida.");
        }
        
    }

    public static void menu_Temperature() {
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

    // FINESTRES
    public static void blinds(Scanner scanner){

        blinds_Menu();

        System.out.print("Selecciona una habitació: ");

        blind_Room_Option = scanner.nextInt();
        if (blind_Room_Option >= 1 && blind_Room_Option <= 6) { // Opcions de les llums de les habitacions
            System.out.println("1- Finestres ON");
            System.out.println("2- Finestres OFF");

            System.out.print("Selecciona una opció: ");
            blind_Option = scanner.nextInt();

            // Switch per saber quines llums encenem o apaguem
            switch (blind_Room_Option) {
                case 1: // Menjador
                    livingRoom = (blind_Option == 1);
                    blinds_ON_OFF();
                    break;

                case 2: // Cuina
                    kitchen = (blind_Option == 1);
                    blinds_ON_OFF();
                    break;

                case 3: // Lavabo
                    bathroom = (blind_Option == 1);
                    blinds_ON_OFF();
                    break;

                case 4: // Habitació 1
                    bedroom1 = (blind_Option == 1);
                    blinds_ON_OFF();
                    break;

                case 5: // Habitació 2
                    bedroom2 = (blind_Option == 1);
                    blinds_ON_OFF();
                    break;

                case 6: // Habitació 3
                    bedroom3 = (blind_Option == 1);
                    blinds_ON_OFF();
                    break;
            }

            get_Status_Blinds(scanner);

        } else if (blind_Room_Option == 7) {
            System.out.println("Tornant al menú principal...");
        } else {
            System.out.println("Opció invàlida.");
        }
    }

    public static void blinds_Menu(){
        System.out.println("===== SELECCIONA L'HABITACIÓ =====");
        System.out.println("1- Menjador");
        System.out.println("2- Cuina");
        System.out.println("3- Lavabo");
        System.out.println("4- Habitació 1");
        System.out.println("5- Habitació 2");
        System.out.println("6- Habitació 3");
        System.out.println("7- Tornar al menú principal");
    }

    public static void get_Status_Blinds(Scanner scanner){
        if (blind_Room_Option == 1) { // SI la temperatura està encesa demana emperatura
            System.out.print("Introdueix la l'altura de la finestres (0 - 100%): ");
            blinds = scanner.nextDouble();
            blinds_ON = true;
            System.out.println("FInestre ON ==> finestres al a " + blinds + "%");

        } else if (blind_Room_Option == 2) {
            blinds_ON = false;
            System.out.println("FInestre OFF");

        } else if (blind_Room_Option == 3) { // Mostra l'estat de la calefació
            blinds_ON_OFF();

        } else if (blind_Room_Option == 4) {
            System.out.println("Tornant al menú principal...");

        } else {
            System.out.println("Opció invàlida.");
        }
    }

    public static void blinds_ON_OFF() {

        if (blind_Option == 1) {
            System.out.println("Finestres de l'habitació " + blind_Room_Option + ": Finestres ON");
        } else {
            System.out.println("Finestres de l'habitació " + blind_Room_Option + ": Finestres OFF");
        }
    }

    // VENTILADOR
    public static void fan(Scanner scanner) {

    fan_Menu();

    System.out.print("Selecciona una habitació: ");
    fan_Room_Option = scanner.nextInt();

    if (fan_Room_Option >= 1 && fan_Room_Option <= 6) {
        System.out.println("1- Ventilador ON");
        System.out.println("2- Ventilador OFF");

        System.out.print("Selecciona una opció: ");
        fan_Option = scanner.nextInt();

        // Switch per saber quin ventilador encenem o apaguem
        switch (fan_Room_Option) {
            case 1: // Menjador
                livingRoom = (fan_Option == 1);
                fan_ON_OFF();
                break;

            case 2: // Cuina
                kitchen = (fan_Option == 1);
                fan_ON_OFF();
                break;

            case 3: // Lavabo
                bathroom = (fan_Option == 1);
                fan_ON_OFF();
                break;

            case 4: // Habitació 1
                bedroom1 = (fan_Option == 1);
                fan_ON_OFF();
                break;

            case 5: // Habitació 2
                bedroom2 = (fan_Option == 1);
                fan_ON_OFF();
                break;

            case 6: // Habitació 3
                bedroom3 = (fan_Option == 1);
                fan_ON_OFF();
                break;
        }

        get_Status_Fan(scanner);

    } else if (fan_Room_Option == 7) {
        System.out.println("Tornant al menú principal...");
    } else {
        System.out.println("Opció invàlida.");
    }
}

    public static void fan_Menu(){
        System.out.println("===== SELECCIONA L'HABITACIÓ =====");
        System.out.println("1- Menjador");
        System.out.println("2- Cuina");
        System.out.println("3- Lavabo");
        System.out.println("4- Habitació 1");
        System.out.println("5- Habitació 2");
        System.out.println("6- Habitació 3");
        System.out.println("7- Tornar al menú principal");
    }

    public static void get_Status_Fan(Scanner scanner){
        if (fan_Option == 1) {
            System.out.print("Introdueix la velocitat del ventilador (1 - 5): ");
            fanSpeed = scanner.nextInt();

            if (fanSpeed < 1 || fanSpeed > 3) {
                System.out.println("Velocitat invàlida. Ha de ser entre 1 i 5.");
            } else {
                System.out.println("Ventilador ON ==> velocitat " + fanSpeed);
            }

        } else {
            System.out.println("Ventilador OFF");
        }
    }

    public static void fan_ON_OFF() {

        if (fan_Option == 1) {
            System.out.println("Ventilador de l'habitació " + fan_Room_Option + ": ON");
        } else {
            System.out.println("Ventilador de l'habitació " + fan_Room_Option + ": OFF");
        }
    }


}

