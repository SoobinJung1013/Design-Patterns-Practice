package factory_method.example;

import factory_method.example.buttons.Button;
import factory_method.example.buttons.HtmlButton;
import factory_method.example.buttons.WindowsButton;
import factory_method.example.factory.Dialog;
import factory_method.example.factory.HtmlDialog;
import factory_method.example.factory.WindowsDialog;

import javax.swing.*;

public class Demo {
    private static Dialog dialog;
//    private static Button button;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure() {
        if (System.getProperty("os.name").equals("Mac OS X")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }
//    static void configure() {
//        if (System.getProperty("os.name").equals("Mac OS X")) {
//            button = new WindowsButton();
//        } else {
//            button = new HtmlButton();
//        }
//    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }
//    static void runBusinessLogic() {
//        button.render();
//    }
}
