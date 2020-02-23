package part3;

/**
 * @Author xuyuan
 * @Date 2020/2/23 0:23
 * @Version 1.0
 */
public class FunctionalInterfaceTest {
    public static void main(String[] args) {
        FunctionalInterface aa=(x,y)->{
            System.out.println(x*y);
        };
        aa.number(2,3);
    }
}
