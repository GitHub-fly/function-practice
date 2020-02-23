package part3;/*@ClassName StudentGreetingServiceTest
 *@Description:todo
 *@author yc_shang
 *@Date2020/2/22
 *@Version 1.0
 **/

import java.util.ArrayList;
import java.util.List;

public class StudentGreetingServiceTest {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("李四"));
        list.add(new Student("小王王"));
        list.add(new Student("端木上官"));
        SelectStudent selectStudent = studentList -> {

            list.stream().filter(name -> name.getName().length()==3)
                    .forEach(name -> System.out.println(name.toString()));
        };
        selectStudent.selectStudent(list);
    }
}
