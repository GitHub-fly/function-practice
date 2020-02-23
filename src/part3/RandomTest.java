package part3;

import java.util.Scanner;

public class RandomTest {
    public static void main(String[] args) {
        Calculator formula = ((str,fma) -> {
            switch (fma) {
                case "+" : return String.valueOf(Double.parseDouble(str[0]) + Double.parseDouble(str[1]));
                case "-" : return String.valueOf(Double.parseDouble(str[0]) - Double.parseDouble(str[1]));
                case "*" : return String.valueOf(Double.parseDouble(str[0]) * Double.parseDouble(str[1]));
                case "/" : return String.valueOf(Double.parseDouble(str[0]) / Double.parseDouble(str[1]));
                default : return "sdafgjSDLKDF*wedlK:Fml321 4R3%";
            }
        });

        System.out.print("请输入你要计算的数据：");
        //控制台输入数据
        Scanner scanner = new Scanner(System.in);
        String fma = scanner.nextLine();
        System.out.println("您输入的算数式子是：" + fma);

        if (fma.contains("+")) {
            String str[] = fma.split("\\+");
            System.out.println(formula.Formula(str,"+"));
        }
        if (fma.contains("-")) {
            String str[] = fma.split("-");
            System.out.println(formula.Formula(str,"-"));
        }
        if (fma.contains("*")) {
            String str[] = fma.split("\\*");
            System.out.println(formula.Formula(str,"*"));
        }
        if (fma.contains("/")) {
            String str[] = fma.split("/");
            System.out.println(formula.Formula(str,"/"));
        }
    }
}

@java.lang.FunctionalInterface
interface Calculator {
    /**
     * 模拟计算器进行计算
     *
     * 接口接收运算数据
     * */
    String Formula(String str[],String fma);

    default void points(String fma){

    }
}
