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
            System.out.println("3- Bentilador");
            System.out.println("4- Finestres");

            System.out.print("Escull una opció del 1 - 4: ");
            scanner.nextLine(); // Limpiar

            try {
                menu = scanner.nextInt();
                scanner.nextLine(); // Liempiar
            } catch (Exception e) {
                System.out.println("Error: Has d'introduir un número vàlid.");
                scanner.nextLine(); // Limpiar
                continue;
            }


            switch (menu) {
                case 1:
                    System.out.println("Has escollit llums");
                    System.out.println("=====SELECIONAR HABITACIO======");
                    System.out.println("1- Menjador");
                    System.out.println("2- Cuina");
                    System.out.println("3- Lavabo");
                    System.out.println("4- Habitació 1");
                    System.out.println("5- Habitació 2");
                    System.out.println("6- Habitació 3");
                    System.out.println("7- Tornar al menú principal");



                    System.out.print("Seleciona una habitacio del 1 - 7: ");
                    scanner.nextLine(); // Limpiar

                    try {
                        roomChoice = scanner.nextInt();
                        scanner.nextLine(); // Limpiar
                    } catch (Exception e) {
                        System.out.println("Error: Has d'introduir un número vàlid.");
                        scanner.nextLine(); // Limpiar
                        return;

                    }   if (roomChoice < 1 || roomChoice > 7) {
                            System.out.println("Opció no vàlida. Tria entre 1 i 7.");
                            return;
                        }
                    int optionslights = scanner.nextInt();
                    System.out.println("1- Llums ON");
                    System.out.println("2- LLums OFF");
                    System.out.print("Seleciona una opcio: ");

                    if (optionslights >= 2) {
                        System.out.println("Accio invalida");
                        continue;
                    }
                    
                    turnOFF_ON = (optionslights == 1);
                    switch (option) {
                        case 1:
                            lightsRooms = turnOFF_ON;
                            System.out.println("Llums del menjador " + (livingRoom ? "enceses" : "apagades"));
                            break;
                    
                        default:
                            break;
                    }

                    break;
            
                default:
                    break;

                    case 2: // TEMPERATURE
                    
                    
                    case 3: //BLINDS



                    case 4: // FAN


            }
        }
        

    }
}