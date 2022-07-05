package co.sofka.test;

import jexer.TApplication;

import java.io.UnsupportedEncodingException;

public class TestApplication extends TApplication {
    public TestApplication() throws UnsupportedEncodingException {
        super(BackendType.SWING);
        addWindowMenu();
        addToolMenu();
        addFileMenu();
        addToolMenu();
    }
}
