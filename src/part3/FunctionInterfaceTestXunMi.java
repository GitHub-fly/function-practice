package part3;

import java.util.Random;
import java.util.Scanner;

/**
 * @author xunmi
 * @ClassName FunctionInterfaceTestXunMi
 * @Description TODO
 * @Date 2020/2/22
 * @Version 1.0
 **/
public class FunctionInterfaceTestXunMi {

    public static void main(String[] args) {
        Person person = (type -> {
            /* ?????????????????????? */
            Random random = new Random();
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < 8; i++) {
                stringBuilder.append(random.nextInt(10));
            }
            switch (type) {
                case "???":
                    return "136" + stringBuilder;
                case "???":
                    return "137" + stringBuilder;
                case "????":
                    return "138" + stringBuilder;
                case "????":
                    return "139" + stringBuilder;
                default:
                    return "%%%***%%%***%%%";
            }
        });
        Scanner scanner = new Scanner(System.in);
        System.out.println("????????????????????????????????????");
        String type = scanner.nextLine();
        String phoneNumber = person.getPhone(type);
        if (phoneNumber.equals("%%%***%%%***%%%")) {
            System.out.println("??????????????");
        } else {
            System.out.println("???????????????????????" + phoneNumber);
        }
        scanner.close();
    }
}

@java.lang.FunctionalInterface
interface Person {

    /**
     * ???????????
     *
     * @param type ???????????
     * @return ?????????????
     */
    String getPhone(String type);
}


