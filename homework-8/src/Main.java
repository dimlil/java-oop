import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.Flow.Publisher;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Car> cars = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Car " + (i + 1) + ": ");
            Car p = null;
            char c = 't';

            switch (i) {
                case 0:
                    c = 't';
                    break;
                case 1:
                    c = 't';
                    break;
                case 2:
                    c = 'f';
                    break;
                case 3:
                    c = 's';
                    break;
                case 4:
                    c = 's';
                    break;
                default:
                    break;
            }
            switch (c) {
                case 't':
                    p = new Truck();
                    System.out.print("Weight: ");
                    int truckWeight = Integer.parseInt(scanner.nextLine());
                    ((Truck) p).setWeight(truckWeight);
                    System.out.print("Speed: ");
                    int truckSpeed = Integer.parseInt(scanner.nextLine());
                    ((Truck) p).setSpeed(truckSpeed);
                    
                    break;
                case 'f':
                    p = new Ford();
                    System.out.print("Year: ");
                    int year = Integer.parseInt(scanner.nextLine());
                    ((Ford) p).setYear(year);
                    System.out.print("Manufacturer discount: ");
                    int manufacturerDiscount = Integer.parseInt(scanner.nextLine());
                    ((Ford) p).setManufacturerDiscount(manufacturerDiscount);
                    System.out.print("Speed: ");
                    int fordSpeed = Integer.parseInt(scanner.nextLine());
                    ((Ford) p).setSpeed(fordSpeed);

                    break;
                case 's':
                    p = new Sedan();
                    System.out.print("Length: ");
                    int length = Integer.parseInt(scanner.nextLine());
                    ((Sedan) p).setLength(length);
                    System.out.print("Speed: ");
                    int sedanSpeed = Integer.parseInt(scanner.nextLine());
                    ((Sedan) p).setSpeed(sedanSpeed);
                    break;

                default:
                    break;
            }
            System.out.print("Enter price of item " + (i + 1) + ": ");
            double price = Double.parseDouble(scanner.nextLine());
            p.setRegularPrice(price);
            cars.add(p);
        }
        System.out.println("");
        double totalDiscount = 0;
        for (int j = 0; j < cars.size(); j++) {
            Car p = cars.get(j);
            double regularPrice = p.getRegularPrice();
            double salePrice = p.getSalePrice();
            int speed = p.getSpeed();
            totalDiscount += salePrice - regularPrice;
            System.out.println("Car " + (j + 1) + ": Type =  " + p.getClass().getSimpleName() 
            + ", Speed = " + speed 
            + ", Regular price = " + regularPrice 
            + ", Sale price: " + salePrice);
        }
        System.out.println("Total discount: " + totalDiscount);
    }
}
