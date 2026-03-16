

public class compile {
    
  static class MathUtil {

    int add(int a, int b){
        return a + b;
    }

    int add(int a, int b, int c){
        return a + b + c;
    }


}

public static void main(String[]args){
    MathUtil m = new MathUtil();
    System.out.println(m.add(50,124));
    System.out.println(m.add(54,47,84));
}
}

