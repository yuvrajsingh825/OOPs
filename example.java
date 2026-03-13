class Student {

    String name;

    Student(){
        name = "Unknown";
    }

}

public class example {

    public static void main(String[] args) {

        Student s1 = new Student();

        System.out.println(s1.name);
    }

}