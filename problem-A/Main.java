public class Main {
    public static void main(String[] args) {
        Dog b1 = new Dog("barsa");
        System.out.println(b1);
        b1.greets();
        Cat b2 = new Cat("Mishka");
        System.out.println(b2);
        b2.greets();
    }
}
