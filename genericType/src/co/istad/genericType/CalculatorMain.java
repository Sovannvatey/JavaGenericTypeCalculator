package co.istad.genericType;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Calculator<Long> cal = new Calculator<>();
        cal.setV1(12L);
        cal.setV2(8L);

        do {
            System.out.println("Enter Operator: 12 ? 8 ");
            String op = scanner.nextLine();

            Long result = switch (op){
                case "+" -> cal.getV1() + cal.getV2();
                case "-" -> cal.getV1() - cal.getV2();
                case "/" -> cal.getV1() / cal.getV2();
                case "*" -> cal.getV1() * cal.getV2();
                default -> throw new IllegalStateException("Invalid");
            };
            System.out.println(result);
        }while(true);


    }
}
