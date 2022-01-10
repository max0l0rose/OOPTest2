package com.company;

import com.pack.CFoo;

public class Main {

    CFoo foo = new CFoo();

    class CBar extends CFoo {
        private int privateField2 = 2;
        private int privateField;
    }

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

        new Main().solution();

//        CFoo cFoo2 = null;
//        cFoo2.staticFunc(); // OK!

    }


    void solution() {
        foo.field = 5;

        CBar bar = new CBar();
        bar.privateField = 2; // Does not access to the parent private field
        bar.privateField2 = 20;
        bar.field = 4;
        int res = bar.getDef();
    }
}


