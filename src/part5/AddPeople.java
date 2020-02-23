package part5;/*@ClassName AddPeople
 *@Description:todo
 *@author yc_shang
 *@Date2020/2/23
 *@Version 1.0
 **/

import part3.Student;

import java.util.List;

@FunctionalInterface
public interface AddPeople {
   void   addPeople(List<Student> student);
}
