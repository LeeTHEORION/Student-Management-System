package StudentManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<>();
        while (true) {
            System.out.println("-------------欢迎来到学生管理系统-------------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看所有学生");
            System.out.println("5 退出");
            System.out.println("请输入你的选择：");

            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();

            switch (line) {

                case "1":
                    //System.out.println("添加学生");
                    addStudent(array);
                    break;
                case "2":
                    //System.out.println("删除学生");
                    deleteStudent(array);
                    break;
                case "3":
                    //System.out.println("修改学生");
                    updataStudent(array);
                    break;
                case "4":
                    //System.out.println("查找所有学生");
                    FindAllStudent(array);
                    break;
                case "5":
                    System.out.println("谢谢使用");
                    return;
            }
        }
    }

    public static void addStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生的学号：");
        String id = sc.nextLine();
        System.out.println("请输入学生的姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生的年龄：");
        String age = sc.nextLine();
        System.out.println("请输入学生的住址：");
        String address = sc.nextLine();

        Student s = new Student();
        s.setName(name);
        s.setId(id);
        s.setAge(age);
        s.setAddress(address);

        array.add(s);
        System.out.println("添加学生成功!!!");
    }

    public static void FindAllStudent(ArrayList<Student> array) {
        if(array.size()==0){
            System.out.println("无信息，请先添加后再查询！！！");
            return;
        }
        System.out.println("学号\t\t姓名\t年龄\t\t住址");
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getId() + "\t" + s.getName() + "\t" + s.getAge() + "岁\t" + s.getAddress());
        }
    }

    public static void deleteStudent(ArrayList<Student> array){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你要删除学生的学号：");
        String id = sc.nextLine();
        for(int i=0;i< array.size();i++){
            Student s=array.get(i);
            if(s.getId().equals(id)){
                array.remove(i);
                break;
            }
        }
        System.out.println("删除成功！！！");

    }

    public static void updataStudent(ArrayList<Student> array){
        Scanner sc=new Scanner(System.in);

        System.out.println("请输入你要修改学生的学号：");
        String id = sc.nextLine();

        System.out.println("请输入学生的新姓名：");
        String name=sc.nextLine();
        System.out.println("请输入学生的新年龄：");
        String age=sc.nextLine();
        System.out.println("请输入学生的新住址：");
        String address= sc.nextLine();

        Student s=new Student();
        s.setName(name);
        s.setId(id);
        s.setAge(age);
        s.setAddress(address);

        for (int i = 0; i < array.size(); i++) {
            Student student=array.get(i);
            if(student.getId().equals(id)){
                array.set(i,s);
                break;
            }
        }

        System.out.println("修改成功！！！");


    }

}
