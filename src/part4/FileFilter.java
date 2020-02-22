package part4;

import java.io.File;

/**
 * @Description 遍历 D:\dev\program-case\src目录下的所有java文件
 * @Author jl_huang
 * @Date 2020-02-22
 **/
public class FileFilter {
    public static void main(String[] args) {
        File fileDir = new File("D:\\dev\\program-case\\src");
        print(fileDir);
    }
    public static void print(File file){
        File[] files = file.listFiles(f ->{
            return f.getName().endsWith(".java") || f.isDirectory();
        });
        for (File f:files){
            if (f.isFile()){
                System.out.println("文件绝对路径:" + f.getAbsolutePath());
            }else {
                print(f);
            }
        }
    }

}