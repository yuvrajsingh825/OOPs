class Student {
    String name;

    Student(String n){
        name = n;
    }
}

public class constructor {
    public static void main(String[] args) {

        Student s1 = new Student("Rahul");
        Student s2 = new Student("Ram");
        Student s3 = new Student("Raj");

        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(s3.name);
    }
}