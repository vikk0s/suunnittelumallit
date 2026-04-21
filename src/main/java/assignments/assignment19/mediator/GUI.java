package assignments.assignment19.mediator;

import javafx.application.Application;
import javafx.stage.Stage;

public class GUI extends Application {
    public void start(Stage stage) {
        ChatMediator mediator = new ChatMediator();

        ChatClient client1 = new ChatClient("Alice", mediator);
        ChatClient client2 = new ChatClient("Bob", mediator);
        ChatClient client3 = new ChatClient("Charlie", mediator);
    }
}
