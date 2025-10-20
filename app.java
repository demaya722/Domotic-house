import java.util.Scanner;

public class app {

    //Variable global
    boolean livingRoom;
    boolean bathroom;
    boolean kitchen;
    boolean h1;
    boolean h2;
    boolean h3;

    public static void main(String[] args) {
        
        //Variables
        boolean lightsRooms;
        boolean temperature;
        boolean fan;
        boolean blinds;
        int options = 0;
        int menu = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("============MENÚ============");
            System.out.println("1- Llums");
            System.out.println("2- Calefacció");
            System.out.println("3- Bentilador");
            System.out.println("4- Finestres");

            System.out.print("Escull una opció del 1 - 4: ");

            try { //Per verificar q ha escolit correctament una opció
                menu = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Error: Has d'introduir un número vàlid.");
                 scanner.nextLine();
                continue;
            } finally {
                scanner.nextLine();
            }


            switch (options) {
                case 1:
                    System.out.println("");
                    break;
            
                default:
                    break;
            }
        }
        

    }
}