import java.util.Scanner;

public class app_prova {

    // Variable global habitacions
    static boolean livingRoom;
    static boolean bathroom;
    static boolean kitchen;
    static boolean bedroom1;
    static boolean bedroom2;
    static boolean bedroom3;

    public static void main(String[] args) {

        // Variables
        int lightsRooms = 0;
        int temperature = 0;
        int fan = 0;
        int blinds = 0;

        // Vaeiables secundaries
        int lihtsTurn_ON_OFF = 0;
        int temperatureActive = 0;
        double setTemperature = 0;
        int options = 0;
        boolean continuar = true;

        Scanner scanner = new Scanner(System.in);

        // Menu per selecionar l'lelement de la casa
        while (continuar) {
            System.out.println("============MENÚ============");
            System.out.println("1- Llums");
            System.out.println("2- Calefacció");
            System.out.println("3- Ventilador");
            System.out.println("4- Finestres");
            System.out.println("5- Sortir");

            System.out.print("Escull una opció del 1 - 5: ");

            // Comprovació del numero valid escullit en el menú
            try {
                options = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Error: Has d'introduir un número vàlid.");
                scanner.nextLine();
                continue;
            }
            // Switch principal
            switch (options) {
                case 1:
                    System.out.println("=====SELECIONAR HABITACIÓ======");
                    System.out.println("1- Menjador");
                    System.out.println("2- Cuina");
                    System.out.println("3- Lavabo");
                    System.out.println("4- Habitació 1");
                    System.out.println("5- Habitació 2");
                    System.out.println("6- Habitació 3");
                    System.out.println("7- Tornar al menú principal");

                    System.out.print("Seleciona una habitació del 1 - 7: ");

                    try {
                        lightsRooms = scanner.nextInt();
                    } catch (Exception e) {
                        System.out.println("Error: Has d'introduir un número vàlid.");
                        scanner.nextLine();
                        continue;
                    }

                    // Switch per les habitacions
                    switch (lightsRooms) {

                        case 1: // Menjador
                            System.out.println("1- Llums ON");
                            System.out.println("2- Llums OFF");

                            System.out.print("Seleciona una opció: ");
                            lihtsTurn_ON_OFF = scanner.nextInt();

                            if (lihtsTurn_ON_OFF == 1) {
                                livingRoom = true;
                                System.out.println("Llums del menjador ON");

                            } else if (lihtsTurn_ON_OFF == 2) {
                                livingRoom = false;
                                System.out.println("Llums del menjador OFF");

                            } else {
                                System.out.println("Opció invàlida.");
                            }
                            break;

                        case 2: // Cuina
                            System.out.println("1- Llums ON");
                            System.out.println("2- Llums OFF");

                            System.out.print("Seleciona una opció: ");
                            lihtsTurn_ON_OFF = scanner.nextInt();

                            if (lihtsTurn_ON_OFF == 1) {
                                kitchen = true;
                                System.out.println("Llums de la cuina ON");

                            } else if (lihtsTurn_ON_OFF == 2) {
                                kitchen = false;
                                System.out.println("Llums de la cuina OFF");

                            } else {
                                System.out.println("Opció invàlida.");
                            }
                            break;

                        case 3: // Lavabo
                            System.out.println("1- Llums ON");
                            System.out.println("2- Llums OFF");

                            System.out.print("Seleciona una opció: ");
                            lihtsTurn_ON_OFF = scanner.nextInt();

                            if (lihtsTurn_ON_OFF == 1) {
                                bathroom = true;
                                System.out.println("Llums del lavabo ON");

                            } else if (lihtsTurn_ON_OFF == 2) {
                                bathroom = false;
                                System.out.println("Llums del lavabo OFF");

                            } else {
                                System.out.println("Opció invàlida.");
                            }
                            break;

                        case 4: // Habitació 1
                            System.out.println("1- Llums ON");
                            System.out.println("2- Llums OFF");

                            System.out.print("Seleciona una opció: ");
                            lihtsTurn_ON_OFF = scanner.nextInt();

                            if (lihtsTurn_ON_OFF == 1) {
                                bedroom1 = true;
                                System.out.println("Llums de l'habitació 1 ON");

                            } else if (lihtsTurn_ON_OFF == 2) {
                                bedroom1 = false;
                                System.out.println("Llums de l'habitació 1 OFF");

                            } else {
                                System.out.println("Opció invàlida.");
                            }
                            break;

                        case 5: // Habitació 2
                            System.out.println("1- Llums ON");
                            System.out.println("2- Llums OFF");

                            System.out.print("Seleciona una opció: ");
                            lihtsTurn_ON_OFF = scanner.nextInt();

                            if (lihtsTurn_ON_OFF == 1) {
                                bedroom2 = true;
                                System.out.println("Llums de l'habitació 2 ON");

                            } else if (lihtsTurn_ON_OFF == 2) {
                                bedroom2 = false;
                                System.out.println("Llums de l'habitació 2 OFF");

                            } else {
                                System.out.println("Opció invàlida.");
                            }
                            break;

                        case 6: // Habitació 3
                            System.out.println("1- Llums ON");
                            System.out.println("2- Llums OFF");

                            System.out.print("Seleciona una opció: ");
                            lihtsTurn_ON_OFF = scanner.nextInt();

                            if (lihtsTurn_ON_OFF == 1) {
                                bedroom3 = true;
                                System.out.println("Llums de l'habitació 3 ON");

                            } else if (lihtsTurn_ON_OFF == 2) {
                                bedroom3 = false;
                                System.out.println("Llums de l'habitació 3 OFF");

                            } else {
                                System.out.println("Opció invàlida.");
                            }
                            break;

                        case 7: // Tornar al menú principal
                            System.out.println("Tornant al menú principal...");
                            break;

                        default:
                            System.out.println("Opció invàlida. Torna-ho a intentar.");
                            break;

                    }
                    break;

                case 2:
                    System.out.println("===== MENÚ CALEFACCIÓ =====");
                    System.out.println("1- Activar calefacció");
                    System.out.println("2- Desactivar calefacció");
                    System.out.println("3- Tornar al menú principal");

                    System.out.print("Selecciona una opció: ");
                    temperature = scanner.nextInt();

                    try {
                        temperature = scanner.nextInt();
                    } catch (Exception e) {
                        System.out.println("Error: Has d'introduir un número vàlid.");
                        scanner.nextLine();
                        continue;
                    }
                    

                    switch (temperature) {
                        case 1:
                            temperatureActive = 1;
                                System.out.println("Calefacció ON");
                                temperatureActive = scanner.nextInt();
                                System.out.print("Introdueix la temperatura: ");
                                setTemperature = scanner.nextInt();
                                System.out.println("Temperatura establerta a " + setTemperature + "ºC");
                            break;

                        case 2:
                            System.out.println("Calefacció OFF");
                            temperatureActive = scanner.nextInt();

                            break;

                        case 3: // Tornar al menú principal
                            System.out.println("Tornant al menú principal...");

                            break;

                        default:
                            System.out.println("Opció invàlida. Torna-ho a intentar.");

                            break;
                    }

                    break;

                default:
                    System.out.println("Opció no vàlida.");
                    break;
            }

        }
        scanner.close();

    }
}

// case 3:
// System.out.println("Has escollit ventilador.");
// break;

// case 4:
// System.out.println("Has escollit finestres.");
// break;

// case 5:
// System.out.println("Sortint del programa...");
// continuar = false;
// break;