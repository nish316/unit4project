import images.APImage;
import java.util.Scanner;

public class ImageProcessorDriver {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        APImage original = new APImage("smokey.jpg");

        boolean running = true;

        while (running) {
            System.out.println("\nIMAGE PROCESSING MENU");
            System.out.println("1. Display original image");
            System.out.println("2. Convert to grayscale");
            System.out.println("0. Quit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    original.draw();
                    break;

                case 2:
                    APImage gray = ImageProcessor.toGrayscale(original);
                    gray.draw();
                    break;

                case 0:
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }
}
