/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package million_dollar_showdown;

import million_dollar_showdown.controller.GameController;
import million_dollar_showdown.model.GameModel;

public class App {

    public static void main(String[] args) {
        GameModel questionSelection = new GameModel();
        ControllerInterface controllerInterface = new GameController(questionSelection);
    }
}