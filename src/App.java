import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner e = new Scanner(System.in);

        System.out.println("Digite a media em metros: ");
        double metros = e.nextDouble();

        e.close();

        double cm = metros * 100;

        System.out.println("A medida em cm e: " + cm);
    }
}
