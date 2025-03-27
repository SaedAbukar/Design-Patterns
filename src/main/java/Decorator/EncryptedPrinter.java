package Decorator;

import java.util.Base64;

public class EncryptedPrinter extends PrinterDecorator {
    public EncryptedPrinter(Printer printer) {
        super(printer);
    }

    private String encrypt(String message) {
        return Base64.getEncoder().encodeToString(message.getBytes());
    }

    private String decrypt(String encryptedMessage) {
        return new String(Base64.getDecoder().decode(encryptedMessage));
    }

    @Override
    public void print(String message) {
        String encryptedMessage = encrypt(message);
        System.out.println("Encrypted Message: " + encryptedMessage);
        super.print(encryptedMessage);
    }

    public void printDecrypted(String encryptedMessage) {
        String decryptedMessage = decrypt(encryptedMessage);
        super.print(decryptedMessage);
    }
}
