package com.example.calculator1;
import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            boolean flag = true;

            Scanner scanner = new Scanner(System.in);
            do {

                System.out.print(" 양의 정수를 입력하세요: ");
                int number = scanner.nextInt();

                System.out.print(" 양의 정수를 입력하세요: ");
                int number2 = scanner.nextInt();

                Scanner scanner2 = new Scanner(System.in);
                System.out.print("사칙 연산을 입력하세요(+, -, *, /): ");
                String operation = scanner2.nextLine();

                switch (operation) {
                    case "+":
                        int sum = number + number2;
                        System.out.println("result = " + sum);
                        break;
                    case "-":
                        int sub = number - number2;
                        System.out.println("result = " + sub);
                        break;
                    case "*":
                        int mul = number * number2;
                        System.out.println("result = " + mul);
                        break;
                    case "/":
                        if (number2 == 0) {
                            System.out.println("0으로는 나누기를 할 수 없습니다!");
                        }
                        int div = number / number2;
                        System.out.println("result = " + div);
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

