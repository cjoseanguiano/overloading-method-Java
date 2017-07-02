package com.devix.www;

public class Main {

    public static void main(String[] args) {

        NewMyClass myClass = new NewMyClass(0);
        myClass.info();
        myClass.info("Overloaded method");
        new NewMyClass();
    }

    private static class NewMyClass {
        int height;

        public NewMyClass(int i) {
            System.out.println("Building new House that is " + i + " feet tall");
            height = i;
        }

        public NewMyClass() {
            System.out.println("bricks");
            height = 0;
        }

        void info() {
            System.out.println("House is " + height + " feet tall");
        }

        void info(String s) {
            System.out.println(s + ": House is " + height + " feet tall");
        }
    }
}
