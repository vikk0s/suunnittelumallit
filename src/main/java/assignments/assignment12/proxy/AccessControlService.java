package assignments.assignment12.proxy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class AccessControlService {
    private static AccessControlService instance;
    private HashMap<String, Set<String>> accessMap;

    private AccessControlService() {
        accessMap = new HashMap<>();
    }

    public static AccessControlService getInstance() {
        if (instance == null) {
            instance = new AccessControlService();
        }
        return instance;
    }

    public boolean isAllowed(String documentId, String username) {
        return accessMap.containsKey(documentId) && accessMap.get(documentId).contains(username);
    }

    public void grantAccess(String documentId, String username) {
        accessMap.putIfAbsent(documentId, new HashSet<>());
        accessMap.get(documentId).add(username);
    }
}
