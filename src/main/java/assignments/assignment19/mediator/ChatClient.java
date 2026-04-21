package assignments.assignment19.mediator;

public class ChatClient {
    private String username;
    private ChatMediator mediator;
    private ChatWindow chatWindow;

    public ChatClient(String username, ChatMediator mediator) {
        this.username = username;
        this.mediator = mediator;
        this.mediator.registerClient(this);
        this.chatWindow = new ChatWindow(this);
    }

    public String getUsername() {
        return username;
    }

    public void sendMessage(String message, String receiver) {
        mediator.sendMessage(message, username, receiver);
    }

    public void receiveMessage(String message, String sender) {
        chatWindow.displayMessage(sender + ": " + message);
    }

    public void closeClient() {
        mediator.removeClient(this);
    }

    public ChatMediator getMediator() {
        return mediator;
    }
}
