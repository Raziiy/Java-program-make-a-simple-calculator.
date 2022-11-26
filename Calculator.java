import java.util.Scanner;

class Calculator {
  public static void main(String[] args) {

    char operator;
    int number1, number2, result;

    Scanner input = new Scanner(System.in);


    System.out.println("Enter first number");
    number1 = input.nextInt();

    System.out.println("Enter second number");
    number2 = input.nextInt();


    System.out.println("Choose an operator: +, -, *, or /");
    operator = input.next().charAt(0);

    switch (operator) {

      case '+':
        result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result);
        break;

      case '-':
        result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + result);
        break;

      case '*':
        result = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + result);
        break;

      case '/':
        result = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + result);
        break;

      default:
        System.out.println("Invalid operator!");
        break;
    }

    input.close();
  }
}