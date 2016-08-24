package App;

/**
 * Created by darwinmorales on 24/08/2016.
 */
public class Main {

    static class Inner{

        public String getName() {
            return "Darwin";
        }

        public static void doNothing() {
            System.out.println("Do nothing");
        }

    }

    class Inner2{
        public String getName() {
            return "Darwin2";
        }

        public void doNothing() {
            System.out.println("Do nothing 2");
        }
    }

    public static void main(String[] args) {

        Inner.doNothing();

        Inner inner = new Inner();
        System.out.println("inner.getName() = " + inner.getName());

        Main main = new Main();
        main.doSomething();
    }

    public void doSomething() {
        Inner2 inner2 = new Inner2();
        System.out.println("inner.getName() = " + inner2.getName());
        inner2.doNothing();
    }
}
