import java.util.Scanner;

public class app {

    //Variable global habitacions
    static boolean  livingRoom;
    static boolean  bathroom;
    static boolean  kitchen;
    static boolean  h1;
    static boolean  h2;
    static boolean  h3;
    


    public static void main(String[] args) {
        
        //Variables
        boolean lightsRooms;
        boolean temperature;
        boolean fan;
        boolean blinds;
        boolean turnOFF_ON;
        int menu;
        int option = 0;
        boolean continuar = true;
        int roomChoice;

        Scanner scanner = new Scanner(System.in);

        while (continuar) {
            System.out.println("============MENÚ============");
            System.out.println("1- Llums");
            System.out.println("2- Calefacció");
            System.out.println("3- Ventilador");
            System.out.println("4- Finestres");
            System.out.println("5- Sortir");
            System.out.print("Escull una opció del 1 - 5: ");

            try {
                menu = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Error: Has d'introduir un número vàlid.");
                scanner.nextLine();
                continue;
            }

            switch (menu) {
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
                        roomChoice = scanner.nextInt();
                    } catch (Exception e) {
                        System.out.println("Error: Has d'introduir un número vàlid.");
                        scanner.nextLine();
                        continue;
                    }

                    if (roomChoice == 7) continue;
                    if (roomChoice < 1 || roomChoice > 7) {
                        System.out.println("Opció no vàlida.");
                        continue;
                    }

                    System.out.println("1- Llums ON");
                    System.out.println("2- Llums OFF");
                    System.out.print("Seleciona una opció: ");

                    int optionslights = scanner.nextInt();


                    optionslights = scanner.nextInt();

                    if (optionslights < 1 || optionslights > 2) {
                        System.out.println("Opció invàlida.");
                        continue;
                    }

                    System.out.println("Llums de l'habitació " + roomChoice +
                        (optionslights == 1 ? " ENCÈSES." : " APAGADES."));
                    break;

                case 2:
                    System.out.println("Has escollit calefacció.");
                    break;

                case 3:
                    System.out.println("Has escollit ventilador.");
                    break;

                case 4:
                    System.out.println("Has escollit finestres.");
                    break;

                case 5:
                    System.out.println("Sortint del programa...");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opció no vàlida.");
                    break;
            }
        }
        scanner.close();
    }
}