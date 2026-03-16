
public class Diampndp {
    class Animal {
        Animal() {
            System.out.println("Animal is fighting");
        }
    }
    class Dog extends Animal {
    void sound(){
        System.out.println("Dog barking");
    }
}

class Cat extends Animal {
    void sound(){
        System.out.println("Cat meowing");
    }
}

// Java does not support multiple inheritance with classes.
// You can implement interfaces or choose one class to extend.
class Hybrid extends Dog {
    // Optionally, you can override methods or add new ones here.
}

public static void main(String[]args){
    

}
}
