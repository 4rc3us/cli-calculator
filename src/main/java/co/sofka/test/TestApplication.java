package co.sofka.test;

import jexer.TAction;
import jexer.TApplication;
import jexer.TButton;
import jexer.TWindow;
import jexer.bits.CellAttributes;
import jexer.bits.Color;

import java.io.UnsupportedEncodingException;

public class TestApplication extends TApplication {
    public TestApplication() throws UnsupportedEncodingException {
        super(BackendType.SWING);
        addToolMenu();
        addFileMenu();
        addWindowMenu();
        ////////////////////////////////////////////////////////////////////////////////////////////////////

        var calculator           = addWindow("Calculator", 0, 0, 100, 5);
        var calculatorRealHeight = calculator.getHeight() - 1;

        var buttonContainer = calculator.addPanel(0,
                                                  3,
                                                  calculator.getWidth(),
                                                  calculator.getHeight() - 1);

        var button1 = buttonContainer.addButton("  1  ", 0, 0, new TAction() {
            @Override
            public void DO() {
                System.out.println("1");
            }
        });

        var button2 = buttonContainer.addButton("  2  ",
                                                button1.getX() + button1.getWidth(),
                                                0,
                                                new TAction() {
                                                    @Override
                                                    public void DO() {
                                                        System.out.println("2");
                                                    }
                                                });

        //        var theme = new CellAttributes();
        //        theme.setBackColor(Color.BLACK);
    }
}
