import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;
public class Main {
    public static void main(String[] args) {

        int option;
        Scanner s = new Scanner(System.in);
        ArrayList<Hotel> hotels = new ArrayList<>();
        while (true) {
            System.out.println();
            System.out.println("Menu");
            System.out.println("1. Insert data");
            System.out.println("2. Print data");
            System.out.println("3. Print names and price of particular city");
            System.out.println("4. Exit");
            System.out.print("Choose an option: "); option = s.nextInt();

            switch (option) {
                case 1:
                    System.out.println();
                    hotels.add(insertData(s));
                    break;
                case 2:
                    System.out.println();
                    printData(hotels);
                    break;
                case 3:
                    System.out.println();
                    printHotelGuestsFromParticularCity(hotels, s);
                    break;
                case 4: exit(0);
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        }
    }

    public static void printData(ArrayList<Hotel> hotels) {
        System.out.println("Print all data!");
        for (Hotel h : hotels) {
            System.out.println(h.toString());
        }
    }

    public static Hotel insertData(Scanner scanner) {

        String nothing = scanner.nextLine();
        String name;
        String id;
        int status;
        int nights;
        double beds;
        String city;

        System.out.println("Insert data!");
        System.out.println();
        System.out.print("Name: "); name = scanner.nextLine();
        System.out.println();
        System.out.print("ID: "); id = scanner.nextLine();
        System.out.println();
        System.out.print("Engaged(1) or single(2)?: "); status = scanner.nextInt();
        System.out.println();
        System.out.print("Nights: "); nights = scanner.nextInt();
        System.out.println();
        System.out.print("Price for beds: "); beds = scanner.nextInt();
        System.out.println();
        String nothing1 = scanner.nextLine();
        System.out.print("City: "); city = scanner.nextLine();

        return new Hotel(name, id, status, nights, beds, city);
    }

    public static void printHotelGuestsFromParticularCity(ArrayList<Hotel> hotels, Scanner sc) {

        int totalPrice = 0;
        ArrayList<Hotel> newClients = new ArrayList<>();

        String nothing = sc.nextLine();

        System.out.println();
        System.out.println("Enter a city: ");
        String city = sc.nextLine();

        for (Hotel h : hotels) {
            if(h.city.equals(city)) {
                newClients.add(h);
                totalPrice += h.beds;
            }
        }

        System.out.println();
        for (Hotel h : newClients) {
            System.out.println("Guest name: " + h.name);
        }

        System.out.println("Total price for beds of the beds: " + totalPrice);
    }
}