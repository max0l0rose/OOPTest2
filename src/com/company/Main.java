package com.company;

public class Main {

    interface I0 {
    }

    @FunctionalInterface
    interface I1 extends I0
    {
        int a = 1;
        int func();

        static int statFunc() {
            return a;
        }

        default int defFunc() {
            return a;
        }
    }


    class C1 implements I1 {

        int a = 2;

        @Override
        public int func() {
            return a;
        }
    }


    public static void main(String[] args) {
        //int q = I1.statFunc();

        CFoo cFoo = null;
        cFoo.func();
    }

}


