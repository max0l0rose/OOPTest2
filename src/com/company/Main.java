package com.company;

import com.pack.CFoo;
import com.pack.IFoo;
import com.pack2.ModifAccessChange;
import com.pack2.ModifAccessChange2;

public class Main {

    CFoo foo = new CFoo();

    class CBar extends CFoo {
        public int field;
    }



    public static void main(String[] args) {

        //ModifAccessChange modifAccessChange = new ModifAccessChange();
        ModifAccessChange modifAccessChangeA = new ModifAccessChange2();
        ModifAccessChange2 modifAccessChange2Cast = (ModifAccessChange2)modifAccessChangeA;

        int q = modifAccessChange2Cast.func();

        //new AbsctractFoo(); cannot inst abstract class

        //int q = I1.statFunc();

        new Main().solution();

//        CFoo cFoo2 = null;
//        cFoo2.staticFunc(); // OK!

    }


    void solution() {

        CBar bar = new CBar();
        bar.field = 4; // Cool, but this is NOT right field from parent.... (((
        //bar.field2 = 5; // error despite the fact that it is a nested class...
        bar.defFunc();
        bar.getField();
        //bar.privStaticFunc(); // error
        //bar.privFunc(); // error

        IFoo foo = new CFoo();
        foo.defFunc(); // def - ok
        int w = foo.field;

        int a = 1;
    }
}


