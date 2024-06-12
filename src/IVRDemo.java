import java.util.Scanner;

class IVRDemo {

    public static void main(String[] args) {
        System.out.println("*****************");
        System.out.println("Welcome to Rogers");
        System.out.println("*****************");

        System.out.println("1. Press for English");
        System.out.println("2. Press for French");

        System.out.println(" Enter the language");
        Scanner language = new Scanner(System.in);
        int choice = language.nextInt();

        if (choice == 1) {


            System.out.println("1. Press for Customer Support");
            System.out.println("2. Press for Billing");
            System.out.println("3. Press for Wireless Services");
            System.out.println("4. Press for Business Plan");
            System.out.println("5. Exit");

            int option = language.nextInt();


            switch (option) {
                case 1:
                    System.out.println("You selected Customer support, Please wait for assistance.");
                    break;
                case 2:
                    System.out.println("You selected Billing, please select one of the following options.");
                    System.out.println("1: Current due amount");
                    System.out.println("2: Last month bill amount");
                    System.out.println("3: Upcoming bill");
                    int billingoption = language.nextInt();
                    break;
                case 3:
                    System.out.println("You selected Wireless Services, please select one of the following options.");
                    break;
                case 4:
                    System.out.println("You selected Business Plan, please select one of the following options.");
                    break;
                case 5:
                    System.out.println("Thank you for using our telephone services.");
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        } else if (choice == 2) {
            System.out.println("1. Appuyez sur 1 pour le support client");
            System.out.println("2. Appuyez sur 2 pour la facturation");
            System.out.println("3. Appuyez sur 3 pour les services sans fil");
            System.out.println("4. Appuyez sur 4 pour le plan d'affaires");
            System.out.println("5. Quitter");

            int option = language.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Vous avez sélectionné le support client. Veuillez patienter pour obtenir de l'aide.");
                    break;
                case 2:
                    System.out.println("Vous avez sélectionné la facturation. Veuillez sélectionner l'une des options suivantes.");
                    break;
                case 3:
                    System.out.println("Vous avez sélectionné les services sans fil. Veuillez sélectionner l'une des options suivantes.");
                    break;
                case 4:
                    System.out.println("Vous avez sélectionné le plan d'affaires. Veuillez sélectionner l'une des options suivantes.");
                    break;
                case 5:
                    System.out.println("Merci d'avoir utilisé nos services téléphoniques.");
                    break;

                default:
                    System.out.println("Option invalide.");
            }

        }else {
            System.out.println("Can't understand. Please choose one of the following option.");
            return;
        }

    }
}



        /*if (option<1 || option>5){
            System.out.println("Invalid option, kindly select from following option menu");
            return;*/
