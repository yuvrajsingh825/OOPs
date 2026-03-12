class Student {

    String name;
    int age;
    String branch;

    // Constructor
    Student(String n, int a, String b) {
        name = n;
        age = a;
        branch = b;
    }

    // Method to display student details
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Branch: " + branch);
        System.out.println("----------------------");
    }
}

public class code {

    public static void main(String[] args) {

        // Creating objects
        Student s1 = new Student("Yuvraj", 19, "CSE-AI");
        Student s2 = new Student("Rahul", 20, "CSE");

        // Calling method
        s1.displayInfo();
        s2.displayInfo();
    }
}