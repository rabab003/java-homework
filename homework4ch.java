import java.util.Scanner;

public class homework4ch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("enter your grade: ");
        String grade = input.nextLine();
        input.close();



        switch (grade) {
            case "A":
                System.out.println("excellent");
                break;
            case "B":
                System.out.println("very good");
                break;
            case "C":
                System.out.println("good");
                break;
            case "D":
                System.out.println("medium");
                break;
            case "E":
                System.out.println("passed");
                break;
            case "F":
                System.out.println("fail");
                break;

            default:
                break;


        }

    }

}
