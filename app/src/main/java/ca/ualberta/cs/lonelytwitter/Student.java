package ca.ualberta.cs.lonelytwitter;

public class Student {
    private String name;
    private int age;

    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    public Student(String name){
        this.name=name;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
}
