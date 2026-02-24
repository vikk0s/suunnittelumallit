package assignments.assignment6.decorator;

public class EncryptedPrinter extends PrinterDecorator {
    private static final int SHIFT = 3;

    public EncryptedPrinter(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String message) {
        String encryptedMessage = encrypt(message);
        super.print(encryptedMessage);
        String decryptedMessage = decrypt(encryptedMessage);
        System.out.println(decryptedMessage);
    }

    public static String encrypt(String input) {
        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            result.append((char) (c + SHIFT));
        }

        return result.toString();
    }

    public static String decrypt(String input) {
        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            result.append((char) (c - SHIFT));
        }

        return result.toString();
    }
}
