import java.util.Objects;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long inputNum1 = scanner.nextLong();
        String inputOp = scanner.next();
        long inputNum2 = scanner.nextLong();
        if(Objects.equals(inputOp, "/") && inputNum2 == 0){
            System.out.println("Division by 0!");
        }else {
            switch (inputOp) {
                case "+" -> System.out.println(inputNum1 + inputNum2);
                case "-" -> System.out.println(inputNum1 - inputNum2);
                case "/" -> System.out.println(inputNum1 / inputNum2);
                case "*" -> System.out.println(inputNum1 * inputNum2);
                default -> System.out.println("Unknown operator");
            }
        }
    }
}