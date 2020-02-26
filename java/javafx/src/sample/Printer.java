package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

class Printer {
    int x = 0;
    int y = 1;

    void printMe() {
        System.out.println("x is " + x + ", y is " + y);
        System.out.println("I am an instance of the class " +
                this.getClass().getName());
    }
}

class SubPrinter extends Printer {
    int z = 3;

    public static void main(String[] arguments) {
        SubPrinter obj = new SubPrinter();
        obj.printMe();
    }
}