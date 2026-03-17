public class Student {
    private String name;
    private int age;
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    void setName(String name) {
        this.name = name;
    }

void setAge(int age) {
    this.age = age;
}

public static void main(String[] args) {

        Student s1 = new Student("Yuvraj", 20);
        Student s2 = new Student("Rahul", 22);

        System.out.println("Student 1: " + s1.getName() + ", Age: " + s1.getAge());
        System.out.println("Student 2: " + s2.getName() + ", Age: " + s2.getAge());
    }
}
