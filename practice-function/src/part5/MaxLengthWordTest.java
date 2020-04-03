package part5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author xunmi
 * @ClassName MaxLengthWordTest
 * @Description Stream获取前五个最长单词
 * @Date 2020/2/23
 * @Version 1.0
 **/
public class MaxLengthWordTest {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(Arrays.asList("JavaScript", "Java", "JavaWeb", "SpringFramework", "JavaAPI", "SpringBoot", "JavaEE"));
        // 重写接口，实现把最长的字符串击中到一个结果中
        MaxLengthSteam mls = (list) -> {
            List<String> result = new ArrayList<>(5);
            for (int i = 0; i < 5; i++) {
                // 找出长度最长的字符串
                String s = stringList.stream().max(Comparator.comparingInt(String::length)).get();
                // 加入结果集
                result.add(s);
                // 从原集合移除
                stringList.removeIf((str) -> str.equals(s));
            }
            return result;
        };
        // 调用目标方法
        List<String> maxLengthWords = mls.getMaxLengthWords(stringList);
        // 输出结果
        System.out.println(maxLengthWords);
    }
}

@FunctionalInterface
interface MaxLengthSteam {
    /**
     * 获取最长单词方法
     *
     * @param list 比较对象
     * @return 前五个最长单词
     */
    List<String> getMaxLengthWords(List<String> list);
}
