import java.util.Scanner;

public class app {

    // VARIABLES GLOBALS
    static boolean livingRoom;
    static boolean kitchen;
    static boolean bathroom;
    static boolean bedroom1;
    static boolean bedroom2;
    static boolean bedroom3;

    // Variables per menus do whail
    static int menu_Select_Room;
    static int menu_Temperature;

    // Llums
    static int lightOption;
    static int roomOption;

    // Calefacció
    static boolean speed_ON;
    static double speed = 0.0;

    // Finestres
    static int blind_Room_Option;
    static int blind_Option;
    static boolean blinds_ON;
    static double blinds = 0.0;

    // Ventilador
    static int fan_Room_Option;
    static int fan_Option;
    static boolean fan_ON;
    static int fanSpeed = 0;



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int menuOption = 0;

        do {
            // MENÚ PRINCIPAL
            System.out.println("============ MENÚ ============");
            System.out.println("1- Llums");
            System.out.println("2- Calefacció");
            System.out.println("3- Finestres");
            System.out.println("4- Ventilador");
            System.out.println("5- Estas de general");
            System.out.println("0- Sortir");
            System.out.print("Escull una opció (1-5): ");

            menuOption = scanner.nextInt();

            if (menuOption == 1) { // Llums
                lightsRooms(scanner);

            } else if (menuOption == 2) { // Temperatura
                temperature(scanner);

            } else if (menuOption == 3) { // Ventiladors
                blinds(scanner);

            } else if (menuOption == 4) { // Finestres
                fan(scanner);

            } else if (menuOption == 5) {

            } else if (menuOption == 0) { // Sortir del programa

            } else {
                System.out.println("Opció invàlida. Torna-ho a intentar.");
            }

        } while (menuOption != 5);

        general_Status(scanner);

        scanner.close();
    }

    // LLUMS
    public static void lightsRooms(Scanner scanner) {

        do {
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

        } while (roomOption != 7);

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

        do {
            menu_Temperature();
            System.out.print("Selecciona una opció: ");

            int temperatureOptions = scanner.nextInt();

            if (temperatureOptions == 1) { // SI la temperatura està encesa demana emperatura
                System.out.print("Introdueix la temperatura (entre 10 i 30 ºC): ");
                speed = scanner.nextDouble();
                speed_ON = true;

                // Bucle per demana temperatura adecuada
                bucle_Request_Temperature(scanner);

                System.out.println("Calefacció ON ==> temperatura a " + speed);

            } else if (temperatureOptions == 2) {
                speed_ON = false;
                System.out.println("Calefacció OFF");

            } else if (temperatureOptions == 3) { // Mostra l'estat de la calefació
                show_Climate_Temperature();

            } else if (temperatureOptions == 4) {
                set_heating_time(scanner);

            } else if (temperatureOptions == 5) {
                System.out.println("Tornant al menú principal...");

            } else {
                System.out.println("Opció invàlida.");
            }

        } while (menu_Temperature != 4);

    }

    public static void bucle_Request_Temperature(Scanner scanner) {
        while (speed <= 10 || speed >= 30) {
            System.out.println("Temperatura invàlida. Ha de ser entre 10 i 30 ºC.");
            System.out.print("Introdueix una temperatura vàlida: ");
            speed = scanner.nextDouble();
        }
    }

    public static void menu_Temperature() {

        System.out.println("===== MENÚ CALEFACCIÓ =====");
        System.out.println("1- Encendre calefacció");
        System.out.println("2- Apagar calefacció");
        System.out.println("3- Mostrar estat");
        System.out.println("4- Programar calefacció");
        System.out.println("5- Tornar al menú principal");

    }

    public static void set_heating_time(Scanner scanner) {
        int time_Schedule;
        do {
            System.out.println("Vols programar la calefacció per alguna hora?");
            System.out.println("1- Sí");
            System.out.println("2- No");
            System.out.print("Seleciona una opció: ");

            time_Schedule = scanner.nextInt();

            temperature_Time(scanner);

        } while (time_Schedule != 2);
    }

    public static void temperature_Time(Scanner scanner) {
        int time_Schedule = scanner.nextInt();

        if (time_Schedule == 1) {
            System.out.print("A quina hora vols que s'encengui la calefacció? (0-23): ");
            int timeProg = scanner.nextInt();

            // Validació de l'hora
            while (timeProg < 0 || timeProg > 23) {
                System.out.print("Hora invàlida. Torna a introduir-la (0-23): ");
                timeProg = scanner.nextInt();
            }

            System.out.print("Quina temperatura vols programar? (10-30 ºC): ");
            int tempProg = scanner.nextInt();
            while (tempProg < 10 || tempProg > 30) {
                System.out.print("Temperatura invàlida. Torna a introduir-la (10-30 ºC): ");
                tempProg = scanner.nextInt();
            }
            System.out.println("===================HORA PROGRAMADA CALEFACCIÓ===================");
            System.out.println("Calefacció programada a les " + timeProg + ":00 a " + tempProg + "ºC");

            // Bucle que simula el “pas del temps” de 0 a 23 hores
            for (int timeClock = 0; timeClock < 24; timeClock++) {
                if (timeClock == timeProg) {
                    speed_ON = true;
                    speed = tempProg;
                    System.out.println("Automàtic: Calefacció ON a " + speed + "ºC a les " + timeClock + ":00");
                    System.out.println("=========================================================================");
                }
            }
        }
    }

    public static void show_Climate_Temperature() {

        if (speed_ON) {
            System.out.println("La calefacció ON a " + speed);
        } else {
            System.out.println("La calefacció OFF");
        }
    }

    // FINESTRES
    public static void blinds(Scanner scanner) {

        do {
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
        } while (blind_Room_Option != 7);

    }

    public static void blinds_Menu() {

        System.out.println("===== SELECCIONA L'HABITACIÓ =====");
        System.out.println("1- Menjador");
        System.out.println("2- Cuina");
        System.out.println("3- Lavabo");
        System.out.println("4- Habitació 1");
        System.out.println("5- Habitació 2");
        System.out.println("6- Habitació 3");
        System.out.println("7- Tornar al menú principal");
    }

    public static void get_Status_Blinds(Scanner scanner) {
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

        do {
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

            } else if (fan_Room_Option == 7) { // Programar ventilador
                program_Fan(scanner);

            } else if (fan_Room_Option == 8) {
                System.out.println("Tornant al menú principal...");
            } else {
                System.out.println("Opció invàlida.");
            }
        } while (fan_Room_Option != 8);
    }

    public static void fan_Menu() {

        System.out.println("===== SELECCIONA L'HABITACIÓ =====");
        System.out.println("1- Menjador");
        System.out.println("2- Cuina");
        System.out.println("3- Lavabo");
        System.out.println("4- Habitació 1");
        System.out.println("5- Habitació 2");
        System.out.println("6- Habitació 3");
        System.out.println("7- Programar ventilador");
        System.out.println("8- Tornar al menú principal");
    }

    public static void program_Fan(Scanner scanner) {
        int time_Fun;
        do {
            System.out.println("Vols programar el ventilador per alguna hora?");
            System.out.println("1- Sí");
            System.out.println("2- No");
            System.out.print("Selecciona una opció: ");

            time_Fun = scanner.nextInt();

            if (time_Fun == 1) {
                fun_Time(scanner); // llamamos a la función para programar hora y velocidad
            }

        } while (time_Fun != 2);
    }

    public static void fun_Time(Scanner scanner) {
        System.out.print("A quina hora vols que s'encengui el ventilador? (0-23): ");
        int time_Prog = scanner.nextInt();

        while (time_Prog < 0 || time_Prog > 23) {
            System.out.print("Hora invàlida. Torna a introduir-la (0-23): ");
            time_Prog = scanner.nextInt();
        }

        System.out.print("Quina velocitat vols programar? (1 - 5): ");
        int speed_Prog = scanner.nextInt();
        while (speed_Prog < 1 || speed_Prog > 5) {
            System.out.print("Velocitat invàlida. Torna a introduir-la (1 - 5): ");
            speed_Prog = scanner.nextInt();
        }

        System.out.println("===================HORA PROGRAMADA VENTILADOR===================");
        System.out.println("Ventilador programat a les " + time_Prog + ":00 a velocitat " + speed_Prog);

        // Bucle que simula el pas del temps de 0 a 23 hores
        for (int timeClock = 0; timeClock < 24; timeClock++) {
            if (timeClock == time_Prog) {
                fan_ON = true;
                fanSpeed = speed_Prog;
                System.out.println("Automàtic: Ventilador ON a velocitat " + fanSpeed + " a les " + timeClock + ":00");
                System.out.println("================================================================");
            }
        }
    }

    public static void get_Status_Fan(Scanner scanner) {
        if (fan_Option == 1) {
            System.out.print("Introdueix la velocitat del ventilador (1 - 5): ");
            fanSpeed = scanner.nextInt();

            if (fanSpeed < 1 || fanSpeed > 5) {
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

    public static void general_Status(Scanner scanner) {
        System.out.println("===== ESTAT GENERAL DE LA CASA =====");
        System.out.println("Menjador: llums " + (livingRoom ? "ON" : "OFF"));
        System.out.println("Cuina: llums " + (kitchen ? "ON" : "OFF"));
        System.out.println("Lavabo: llums " + (bathroom ? "ON" : "OFF"));
        System.out.println("Habitació 1: llums " + (bedroom1 ? "ON" : "OFF"));
        System.out.println("Calefacció: " + (speed_ON ? "ON (" + speed + "ºC)" : "OFF"));
        System.out.println("Finestres: " + (blinds_ON ? "OBERTES (" + blinds + "%)" : "TANCADES"));
        System.out.println("Ventilador: " + (fan_ON ? "ON (velocitat " + fanSpeed + ")" : "OFF"));
    }

}
