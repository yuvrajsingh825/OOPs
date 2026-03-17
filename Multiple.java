public class Multiple {
    interface A {
    void show();
}

interface B {
    void show();
}

static class Test implements A, B {

    public void show(){
        System.out.println("Hello");
    }

}
 public static void main(String[]args){
    Test t = new Test();
    t.show();
}
}
