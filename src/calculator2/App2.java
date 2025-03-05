package calculator2;

import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        boolean flag = true;
        Calculator calculator = new Calculator();

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print(" 양의 정수를 입력하세요: ");
            int number = scanner.nextInt();     // nextInt : 숫자 입력 + 엔터
            scanner.nextLine();
            System.out.print(" 양의 정수를 입력하세요: ");
            int number2 = scanner.nextInt();
            scanner.nextLine();

            System.out.print("사칙 연산을 입력하세요(+, -, *, /): ");
            String operation = scanner.nextLine();



            int result = 0;
            switch (operation) {
                case "+":
                    result = calculator.sum(number,number2);
                    break;
                case "-":
                    result = calculator.sub(number, number2);
                    break;
                case "*":
                    result = calculator.mul(number,number2);
                    break;
                case "/":
                    result = calculator.div(number,number2);
                    break;
                default:
                    System.out.println("올바른 연산자를 입력하세요!! ");
            }

            System.out.println(" 계산을 계속 진행하시겠습니까? (exit 를 입력하면 종료됩니다.)");
            String answer = scanner.nextLine();
            flag = !answer.equals("exit");

        } while (flag);
        System.out.println("계산 종료");
        scanner.close();
    }
}

