import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Item " + (i + 1) + ": ");
            Product p = null;
            char c = 't';

            switch (i) {
                case 0:
                    c='t';
                    break;
                case 1:
                    c='t';
                    break;
                case 2:
                    c='m';
                    break;
                case 3:
                    c='b';
                    break;
                case 4:
                    c='b';
                    break;
                default:
                    break;
            }
            switch (c) {
                case 'm':
                    p = new MP3Player();
                    System.out.print("Colour: ");
                    String mp3Color = scanner.nextLine();
                    Color color = new Color();
                    color.setName(mp3Color);
                    ((MP3Player)p).setColor(color);

                    System.out.print("Manifacturere name: ");
                    String mp3Name = scanner.nextLine();
                    Manufacturer mp3Manufacturer = new Manufacturer();
                    mp3Manufacturer.setName(mp3Name);
                    ((MP3Player)p).setManufacturer(mp3Manufacturer);
                    break;
                case 't':
                    p = new TV();
                    System.out.print("Size: ");
                    int size = Integer.parseInt(scanner.nextLine());
                    ((TV)p).setSize(size);

                    System.out.print("Manifacturere name: ");
                    String tvName = scanner.nextLine();
                    Manufacturer tvManufacturer = new Manufacturer();
                    tvManufacturer.setName(tvName);
                    ((TV)p).setManufacturer(tvManufacturer);
                    
                    break;
                case 'b':
                    p = new Book();
                    System.out.print("Publisher Name: ");
                    String publisherName = scanner.nextLine();
                    Publisher publisher = new Publisher();
                    publisher.setName(publisherName);
                    ((Book)p).setPublisher(publisher);

                    System.out.print("Year Published: ");
                    int year = Integer.parseInt(scanner.nextLine());
                    ((Book)p).setYearPublished(year);
                    
                    break;
            
                default:
                    break;
            }
            System.out.print("Enter price of item " + (i + 1) + ": ");
            double price = Double.parseDouble(scanner.nextLine());
            p.setPrice(price);
            products.add(p);
        }
        System.out.println("");
        double totalDiscount = 0;
        for (int j = 0; j < products.size(); j++) {
            Product p = products.get(j);
            double regularPrice = p.getPrice();
            double salePrice = p.getSalePrice();
            totalDiscount += salePrice - regularPrice;
            System.out.println("Item " + (j + 1) + " Type =  " + p.getClass().getSimpleName() 
            + ", Regular price = " + regularPrice 
            + ", Sale price: " + salePrice);
        }
        System.out.println("Total discount: " + totalDiscount);
    }
}
