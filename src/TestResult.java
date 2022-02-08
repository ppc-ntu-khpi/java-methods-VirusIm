import java.util.Scanner;
        
public class TestResult {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int choiсe = 0;
        System.out.println("What task do you want to complete? (1 OR 2)");
        choiсe = myObj.nextInt();
        switch(choiсe)
        {
            case 1:
                boolean result;
                int firstNum, secondNum;
                do {
                    System.out.print("Enter first number: ");
                    firstNum = myObj.nextInt();  // Read user input
                    System.out.print("Enter last number: ");
                    secondNum = myObj.nextInt();    //Read user input
                    result = Exercise.CheckNum(firstNum, secondNum);
                    System.out.print("\033[H\033[2J");  
                    System.out.flush();
                } while (result == false);  //
                 System.out.println("First number: " + firstNum + "\nSecond number: " + secondNum);  //Output user input
                 Exercise.Calculate(firstNum, secondNum);
                break;
            case 2:
                int day = 0, month = 0, year = 0;
                System.out.print("Enter your birthday: ");   day = myObj.nextInt();  //Read user input
                System.out.print("Enter your month birth: ");   month = myObj.nextInt();  //Read user input
                System.out.print("Enter your year birth: ");   year = myObj.nextInt();  //Read user input
                System.out.print(day + "." + month + "." + year);
                int happyNum = Exercise.CalculateTwo(day, month, year);
                System.out.println();
                System.out.println("Your happy number: " + happyNum);
                switch(happyNum)
                {
                    case 1:
                        Exercise.NumOne();
                        break;
                    case 2:
                        Exercise.NumTwo();
                        break;
                    case 3:
                        Exercise.NumThree();
                        break;
                    case 4:
                        Exercise.NumFour();
                        break;
                    case 5:
                        Exercise.NumFive();
                        break;
                    case 6:
                        Exercise.NumSex();
                        break;
                    case 7:
                        Exercise.NumSeven();
                        break;
                    case 8:
                        Exercise.NumEigth();
                        break;
                    case 9:
                        Exercise.NumNine();
                        break;
                    default:
                        System.out.println("Error! There is no such point");break;
                }   //output point
                break;
            default:
                System.out.println("Error! This task don`t done yet.");break;
        }   //Task choice
    }
}