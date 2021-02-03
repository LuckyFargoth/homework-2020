package homeworks.hw1Intro;


public class Person {
    private   int age;
    private  String name;
    private  String sex;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Person(String sex) {
        this.sex = sex;
    }

}
