/** Напишите постфиксный калькулятор. Пользователь вводит данные и операции в обратной польской записи. Калькулятор вычисляет результат 
 * и проверяет, что в стэке получилось единственное число.
Например:
5 4 3 - + => 5 1 + => 6 */

package HomeWork.HW4;

import java.util.ArrayDeque;
import java.util.Arrays;

public class Task3 {

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void calculator(String str) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        String[] newStr = str.split(" ");
        System.out.println(Arrays.toString(newStr));
        int result = 0;

        for (int i = 0; i < newStr.length; i++) {
            if (isDigit(newStr[i])) {
                stack.push(Integer.parseInt(newStr[i]));
            } else {
                switch (newStr[i]) {
                    case "+":
                        result = stack.pop() + stack.pop();
                        stack.push(result);
                        break;
                    case "-":
                        result = stack.pop() - stack.pop();
                        stack.push(result);
                        break;
                    case "*":
                        result = stack.pop() * stack.pop();
                        stack.push(result);
                        break;
                    case "/":
                        result = stack.pop() / stack.pop();
                        stack.push(result);
                        break;
                    default:
                        break;
                }
            }
        }
        System.out.println(stack);
    }

    public static void main(String[] args) {
        String str = "1 2 3 * 4 * +";
        //String str = "5 4 3 - + => 5 1 + => 6";

        calculator(str);
    }

}