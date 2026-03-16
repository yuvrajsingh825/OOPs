public class Hierarchical {
    static class Animal {
    void eat(){
        System.out.println("Eating");
    }
}

static class Dog extends Animal {
}

static class Cat extends Animal {
}

public static void main(String[]args){
    Dog d =new Dog();
    Cat c = new Cat();
    d.eat();
    c.eat();
    


}
}
