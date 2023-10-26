import java.util.Scanner;

public class Zodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your year of birth:");
        int year = input.nextInt();
        int zodiac = year % 12;

        switch (zodiac) {
            case 0:
                System.out.println("your chinese zodiac sign is monkey");
                break;

            case 1:
                System.out.println("your chinese zodiac sign is cock");
                break;
            case 2:
                System.out.println("your chinese zodiac sign is dog");
                break;
            case 3:
                System.out.println("your chinese zodiac sign is pig");
                break;
            case 4:
                System.out.println("your chinese zodiac sign is mouse");
                break;
            case 5:
                System.out.println("your chinese zodiac sign is cow");
                break;
            case 6:
                System.out.println("your chinese zodiac sign is tiger");
                break;
            case 7:
                System.out.println("your chinese zodiac sign is rabbit");
                break;
            case 8:
                System.out.println("your chinese zodiac sign is dragon");
                break;
            case 9:
                System.out.println("your chinese zodiac sign is snake");
                break;
            case 10:
                System.out.println("your chinese zodiac sign is horse");
                break;
            case 11:
                System.out.println("your chinese zodiac sign is sheep");
                break;
            default:
                System.out.println("error");
        }

    }
}
