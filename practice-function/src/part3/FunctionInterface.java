package part3;

/**
 * @Description 函数式编程简单例子
 * @Author jl_huang
 * @Date 2020-02-22
 **/
public interface FunctionInterface {
    void number(int a,int b);
    class Test{
        public static void main(String[] args) {
           FunctionInterface ft = (a,b) -> {
               System.out.println(a + b);
           };
           ft.number(1,1);
        }
    }
}

