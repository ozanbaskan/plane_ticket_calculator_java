import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        int age, yon;
        float distance;
        double price;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter he distance you want to travel with plane in kilometres: ");
        distance = s.nextFloat();
        System.out.print("Enter your age: ");
        age = s.nextInt();

        System.out.print("One way (1) or two way (2) tickets: ");
        yon = s.nextInt();
        if (distance < 1 || age < 1 || yon != 1 && yon != 2)
        {
            System.out.println("Hatalı veri girdiniz!");
        }
        else
        {
            price = distance / 10.0;
            if (yon == 2)
            {
                price *= 1.6;
            }
            if (age < 12)
            {
                price *= 0.5;
            }
            else if (age < 24)
            {
                price *= 0.9;
            }
            else if (age > 65)
            {
                price *= 0.7;
            }

            System.out.printf("Toplam tutar = %.2f TL", price);
        }



    }

}
