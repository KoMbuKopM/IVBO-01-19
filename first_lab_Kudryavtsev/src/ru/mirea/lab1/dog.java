package ru.mirea.lab1;

public class dog {
    int age;
    private String name;
    int HumanAge;
    dog dog1;
    public dog (){
        name = "Marta";
        age = 6;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int human_age(){
        return this.HumanAge = 7 * this.age;
    }
    public static void main(String[] args) {
        dog dog1 = new dog();
        System.out.println(dog1.getAge());
        System.out.println(dog1.getName());
        System.out.println(dog1.human_age());
        dog1.setAge(8);
        dog1.setName("Bobik");
        System.out.println(dog1.getName());
    }
}
