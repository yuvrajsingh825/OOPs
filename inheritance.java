public class inheritance {

    public class Animal{
        void eat(){
            System.out.println(("Animal is eating "));
        }
        void running(){
            System.out.println("Animal is running");
        }
        void sleep(){
            System.out.println("Animal is sleeping");
        }


    }

    public class Cat extends Animal{
        void meow(){
            System.out.println("Cat is meowing");
        }
        void lick(){
            System.out.println("Cat is licking the milk");
        }
    }
    public static void main(String[] args) {
        
        inheritance inh = new inheritance();
        Cat c1 = inh.new Cat();
        c1.eat();
        c1.running();
        c1.lick();
        c1.sleep();
        

    

    }
}