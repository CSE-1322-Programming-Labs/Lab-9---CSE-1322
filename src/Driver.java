import java.util.Scanner;
public class Driver {
    public static void main(String[] args) {
        boolean running = true;
        while (running){
            printMenu();
            int num1;
            int num2;
            switch (getUserInputInt()){
                case 0:
                    running = false;
                    break;
                case 1:
                    System.out.println("Please enter first number.");
                    num1 = getUserInputInt();
                    System.out.println("Please enter second number.");
                    num2 = getUserInputInt();
                    System.out.println("Answer: "+recursive_multiply(num1,num2));
                    break;
                case 2:
                    System.out.println("Please enter first number.");
                    num1 = getUserInputInt();
                    System.out.println("Please enter second number.");
                    num2 = getUserInputInt();
                    System.out.println("Answer: "+recursive_div(num1,num2));
                    break;
                case 3:
                    System.out.println("Please enter first number.");
                    num1 = getUserInputInt();
                    System.out.println("Please enter second number.");
                    num2 = getUserInputInt();
                    System.out.println("Answer: "+recursive_mod(num1,num2));
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    public static void printMenu(){
        System.out.println("Choose from the following:");
        System.out.println("0. Quit.");
        System.out.println("1. Multiply 2 numbers");
        System.out.println("2. Div 2 numbers");
        System.out.println("3. Mod 2 numbers");
    }

    public static int getUserInputInt(){
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        while (running) {
            String userInput = sc.next();
            try{
                return Integer.parseInt(userInput);
            }catch (Exception e){
                System.out.println("Please enter a valid input.");
            }
        }
        return -1;
    }

    public static int recursive_multiply(int num1, int num2){
        if(num2 == 1){
            return num1;
        }else if(num2 == 0){
            return 0;
        }
        return num1 + recursive_multiply(num1,num2-1);
    }
    public static int recursive_div(int num1, int num2){
        if(num2 == 0){
            return -1;
        }else if(num1 == num2){
            return 1;
        }else if(num1<num2){
            return 0;
        }
        return 1+recursive_div(num1-num2,num2);
    }

    public static int recursive_mod(int num1,int num2){
        if(num2 == 0){
            return -1;
        }else if(num1<num2){
            return num1;
        }
        return recursive_mod(num1-num2,num2);
    }


}
