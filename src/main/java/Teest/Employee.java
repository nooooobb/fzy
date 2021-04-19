package Teest;

import java.util.concurrent.FutureTask;

public class Employee extends Person{
    private static Integer totalNum = 0;
    public int empNum;
    protected String position;
    private int salary;

    public Employee(String name, String age, String hobby, int empNum, String position, int salary) {
        super(name, age, hobby);
        this.empNum = empNum;
        this.position = position;
        this.salary = salary;
        Employee.totalNum++;
    }

//    public void hello(){
//        System.out.println(String.format("我是 %s,今年 %s 岁,爱好是 %s,目前的工作是 %s,月入 %s 元 \n"),name,);
//    }


    @Override
    public int hashCode() {

        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
