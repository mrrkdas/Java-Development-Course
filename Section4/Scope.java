package Section4;
public class Scope {
    public static void main(String[] args) {
        int apples = 5;
        someFunction();
    }
    public static void someFunction(){
        System.out.println(apples);
    }
    
    
}
