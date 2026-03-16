class Animal {
    void eat(){
        System.out.println("Eating");
    }
}

class Dog extends Animal {
    void potty(){
        System.out.println("Potty");
    }
}

class Puppy extends Dog {
    void lick(){
        System.out.println("Licking");
    }
}

public class Tommy {

    public static void main(String[] args) {

        Puppy p = new Puppy();
        p.eat();
        p.potty();
        p.lick();

    }

}