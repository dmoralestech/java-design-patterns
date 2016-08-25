package App;

import command.Command;

/**
 * Created by darwinmorales on 24/08/2016.
 */
public class Main {



    interface MyInnerInterface{
        void run();
        void jump();

        static void makeNoise() {
            System.out.println("make noise");
        }
    }

    static class MyInnerClass implements MyInnerInterface {
        @Override
        public void run() {
            System.out.println("run");

        }

        @Override
        public void jump() {
            System.out.println("jump");
        }
    }

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

        MyInnerInterface.makeNoise();

        Inner.doNothing();

        Inner inner = new Inner();
        System.out.println("inner.getName() = " + inner.getName());

        Main main = new Main();
        main.doSomething();

        MyInnerClass m = new MyInnerClass();
        m.jump();
        m.run();

    }

    public void doSomething() {
        Inner2 inner2 = new Inner2();
        System.out.println("inner.getName() = " + inner2.getName());
        inner2.doNothing();
    }
}
