package part3;/*@ClassName Student
 *@Description:todo
 *@author yc_shang
 *@Date2020/2/18
 *@Version 1.0
 **/

public class Student {
    private String name;


    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
