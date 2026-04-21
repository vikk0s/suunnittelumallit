package assignments.assignment19.mediator;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ChatMediator {
    public Map<String, ChatClient> clients = new HashMap<>();

    public void registerClient(ChatClient client) {
        clients.put(client.getUsername(), client);
    }

    public void sendMessage(String message, String sender, String receiver) {
        ChatClient receiverClient = clients.get(receiver);
        if (receiverClient != null) {
            receiverClient.receiveMessage(message, sender);
        }
    }

    public void removeClient(ChatClient client) {
        clients.remove(client.getUsername());
    }

    public Set<String> getActiveClients() {
        return clients.keySet();
    }
}
