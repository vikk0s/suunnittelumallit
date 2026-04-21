package assignments.assignment19.mediator;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.geometry.Pos;

public class ChatWindow {
    private ChatClient client;
    private ChatMediator mediator;
    private TextArea textArea;
    private TextField inputField;
    private ComboBox<String> receiverComboBox;
    private Button sendButton;

    public ChatWindow(ChatClient client) {
        this.client = client;
        this.mediator = client.getMediator();
        CreateUI();
    }

    public void CreateUI() {
        Stage stage = new Stage();

        textArea = new TextArea();
        textArea.setEditable(false);

        inputField = new TextField();
        inputField.setPromptText("Enter your message...");

        receiverComboBox = new ComboBox<>();
        receiverComboBox.getItems().addAll(mediator.getActiveClients());
        receiverComboBox.setPromptText("Select receiver");

        sendButton = new Button("Send");
        sendButton.setOnAction(e -> {
            String message = inputField.getText();
            String receiver = receiverComboBox.getValue();
            if (!message.isEmpty() && receiver != null && !receiver.isEmpty()) {
                client.sendMessage(message, receiver);
                displayMessage("Me to " + receiver + ": " + message);
                inputField.clear();
            } else {
                displayMessage("Please enter a message and select a receiver.");
            }
        });

        VBox layout = new VBox(10, textArea, inputField, receiverComboBox, sendButton);
        layout.setAlignment(Pos.CENTER);

        stage.setTitle("Chat Window - " + client.getUsername());
        stage.setScene(new Scene(layout, 400, 300));
        stage.show();
    }

    public void displayMessage(String message) {
        textArea.appendText(message + "\n");
    }
}
