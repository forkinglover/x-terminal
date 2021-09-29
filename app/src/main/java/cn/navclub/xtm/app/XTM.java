package cn.navclub.xtm.app;

import cn.navclub.xtm.app.controller.MainViewController;
import javafx.application.Application;

import javafx.stage.Stage;

import java.text.DecimalFormat;


/**
 * XTerminal程序启动类
 *
 * @author yangkui
 */
public class XTM extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        MainViewController.newInstance().openWindow();
    }

}
