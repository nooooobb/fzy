package Teest;

public class Person {
    private String name;
    private String age;
    private String hobby;

    public Person(String name,String age,String hobby){
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }
    public String getHobby(){
        return hobby;
    }
}
