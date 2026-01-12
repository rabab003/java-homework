// homework of switch (lab) 

import java.util.Scanner;

public class switchCondition {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your grade (0-100): ");


        int gradeOriginal = input.nextInt();

        // Convert the grade to a scale of 0-10
        int grade = gradeOriginal / 10;

        switch (grade) {
            case 10:
            case 9:
                System.out.println("A - Excellent");
                break;
            case 8:
                System.out.println("Very Good");
                break;
            case 7:
                System.out.println("Very Good");
                break;
            case 6:
            case 5:
                System.out.println("Good");
                break;
            case 4:
            case 3:
            case 2:
            case 1:
                System.out.println("Fail");
                break;

        default:
        System.out.println("Invalid Grade");

        }

    }

}



// homework of chapter 4 (class)
// import java.util.Scanner;

// public class switchCondition {
//     public static void main(String[] args){

//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter your mark: ");


//          String mark = input.nextLine();

//         switch (mark) {

//             case "A": System.out.println("Excellent"); break;
//             case "B": System.out.println("Very Good");break;
//             case "C":System.out.println("Good"); break;
//             case "D": System.out.println("Medium"); break;
//             case "E": System.out.println("passed"); break;
//             case "F":System.out.println("Fail"); break;
//             default: System.out.println("Invalid Mark");
       
//         }

//     }
// }