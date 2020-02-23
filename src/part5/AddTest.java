package part5;/*@ClassName AddTest
 *@Description:todo
 *@author yc_shang
 *@Date2020/2/23
 *@Version 1.0
 **/

import part3.Student;

import java.util.ArrayList;
import java.util.List;

public class AddTest {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("李四"));
        list.add(new Student("小王王"));
        list.add(new Student("张三"));
        list.add(new Student("张二狗"));
        list.add(new Student("端木上官"));
        AddPeople addPeople = (stringList) -> {
            list.stream().filter(name -> name.getName().length()==3).skip(1)
                    .forEach(name -> System.out.println(name.toString()));

        };
        addPeople.addPeople(list);
    }
}
