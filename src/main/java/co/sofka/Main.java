package co.sofka;

import co.sofka.test.FuncionalTest;
import co.sofka.test.TestApplication;
import jexer.TApplication;

import java.io.UnsupportedEncodingException;

public class Main {
    public static void main(String[] args) {
        //        FuncionalTest runnable = (FuncionalTest) (x) -> {
        //            System.out.println("Hello " + (String) x[0] + "!");
        //        };
        //        runnable.run("David");

        TestApplication app = null;

        try {
            app = new TestApplication();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        assert app != null;
        app.run();
    }


}