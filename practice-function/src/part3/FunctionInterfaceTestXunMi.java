package part3;

import java.util.Random;
import java.util.Scanner;

/**
 * @author xunmi
 * @ClassName FunctionInterfaceTestXunMi
 * @Description 张浩杰的自定义函数式接口练习
 * @Date 2020/2/23
 * @Version 1.0
 **/
public class FunctionInterfaceTestXunMi {

    public static void main(String[] args) {
        Person person = (type -> {
            /* 根据不同职业类型，拟建手机号码 */
            Random random = new Random();
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < 8; i++) {
                stringBuilder.append(random.nextInt(10));
            }
            switch (type) {
                case "学生":
                    return "136" + stringBuilder;
                case "老师":
                    return "137" + stringBuilder;
                case "工人":
                    return "138" + stringBuilder;
                case "其它":
                    return "139" + stringBuilder;
                default:
                    return "%%%***%%%***%%%";
            }
        });
        Scanner scanner = new Scanner(System.in);
        System.out.println("请选择你的职业类型：学生；老师；工人；其它。");
        String type = scanner.nextLine();
        String phoneNumber = person.getPhone(type);
        if (phoneNumber.equals("%%%***%%%***%%%")) {
            System.out.println("请正确选择你的职业类型");
        } else {
            System.out.println("给您随机出来的手机号码为：" + phoneNumber);
        }
        scanner.close();
    }
}

@java.lang.FunctionalInterface
interface Person {
    /**
     * 拟建手机号的方法
     * @param type 自己的职业类型
     * @return 拟建出来的手机号
     */
    String getPhone(String type);
}
