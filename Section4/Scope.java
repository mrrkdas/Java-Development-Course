package Section4;
public class Scope {
    static int dog = 5;
    public static void main(String[] args) {
        System.out.println(dog);
        someFunction();
    }
    public static void someFunction() {
        System.out.println(dog);
    }
    
    
}
