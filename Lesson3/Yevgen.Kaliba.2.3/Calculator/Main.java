import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;
import java.lang.Math;
public class Main {

    public static void main(String[] args) {
        String MyOper;
        String[] Actions = {"Addiction", "Subtraction", "Multiplication", "Division", "Remainder", "Modulus"};
        Scanner MyKeyb = new Scanner(System.in);
        double a=0, b=0;
        boolean ok1 = false;
        boolean ok2 = false;
        if (args.length >= 2) { //Проверяем, были ли переданы аргументы при вызове программы, и затем - корректность переменных;
            try {
                   a = Double.parseDouble(args[1]);
                   b = Double.parseDouble(args[2]);
                   ok1 = true;
                }
            catch (NumberFormatException e) {
                  System.out.println("Аргументы, переданные из командной строки, неверны. Попробуйте ручной ввод.");
                  ok1 = false;
                }
        }
        if (args.length == 0) {System.out.println("Аргументы при запуске не переданы, попробуйте ручной ввод.");}
        else if (args.length > 0 && Arrays.asList(Actions).contains(args[0])) { //Проверяем, соответсвует ли переданное действие предусмотренным
            ok2 = true;
                } else  {
            System.out.println("Действие, переданное из командной строки, задано неверно. Попробуйте ручной ввод.");
            ok2 = false;
                        }

        if (ok1 && ok2) {                       //Если с данными - аргументами все хорошо, то используем их
            a = Double.parseDouble(args[1]);
            b = Double.parseDouble(args[2]);
            MyOper = args[0];
        }

        else {  // Если переданных аргументов нет, вводим аргументы вручную

            while (true) {
                System.out.println("Введите операцию:");
                MyOper = MyKeyb.next();
                if (Arrays.asList(Actions).contains(MyOper)) {   //Проверка на соответсвие допустимым командам
                    break;
                }
                else {
                    System.out.println("Введена неверная операция. Используйте операцию из списка" + Arrays.asList(Actions));
                }
            }
            System.out.println("Введите первое число:");
            a = MyKeyb.nextDouble();
            System.out.println("Введите второе число:");
            b = MyKeyb.nextDouble();
        }
        // И собственно расчет и вывод значения
        if (MyOper.equalsIgnoreCase("Addiction")) { System.out.println("Результат сложения: " + (a+b));}
        else if (MyOper.equalsIgnoreCase("Subtraction")) { System.out.println("Результат вычитания: " + (a-b));}
        else if (MyOper.equalsIgnoreCase("Multiplication")) { System.out.println("Результат умножения: " + (a*b));}
        else if (MyOper.equalsIgnoreCase("Division")) { System.out.println("Результат деления: " + (a/b));}
        else if (MyOper.equalsIgnoreCase("Remainder")) { System.out.println("Остаток от деления: " + (a%b));}
        else if (MyOper.equalsIgnoreCase("Modulus")) { System.out.println("Модуль первого числа: " +Math.abs(a)+" Модуль второго числа: "+Math.abs(b) );}

    }
}

