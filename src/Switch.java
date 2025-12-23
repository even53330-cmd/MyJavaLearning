import java.util.Scanner;

public class Switch {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your age");
        String age = scanner.nextLine();
            switch(age){
                case "0" :
                    System.out.println("you were born");
                    break;
                case "7" :
                    System.out.println("you went to school");
                    break;
                case "18" :
                    System.out.println("you finished school");
                    break;
                default:
                    System.out.println("No");
            }
    }
}
