package Teest;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException {

        /**
         * 获取class对象的三种方式
         */
        //有误第一种
        Class c1 = Class.forName("reflect.Employee");
        Class c2 = Employee.class;

        Employee employee = new Employee("fan","25","cpde",1,"yc",1000);
        Class c3 = employee.getClass();

        if(c1 == c2 && c2 == c3){
            System.out.println(c1);
            System.out.println(c2);
            System.out.println(c3);
        }


    }
}
