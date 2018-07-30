package com.company;

import com.company.controller.Controller;
import com.company.model.Model;
import com.company.view.View;

/**
 * Created by Roman Kobzar on 20.07.2018.
 */

public class Main {

    public static void main(String[] args) {
        Controller controller =
                new Controller(new Model(), new View());
        controller.processUser();
    }
}
