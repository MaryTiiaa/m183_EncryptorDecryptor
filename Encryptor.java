import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

public class Encryptor {
    public static void main(String[] args) {
        // Prüft, ob alle benötigten Argumente vorhanden sind
        if (args.length != 3) {
            System.err.println("Usage: Encryptor <text to encrypt> <symmetric key> <public key file path>");
            System.exit(1);
        }

        String textToEncrypt = args[0];
        String symmetricKeyString = args[1];
        String publicKeyFilePath = args[2];

        try {
            // Lädt den öffentlichen Schlüssel des Empfängers
            byte[] publicKeyBytes = Files.readAllBytes(Paths.get(publicKeyFilePath));
            // Todo: Konvertiert den öffentlichen Schlüssel-String in ein PublicKey-Objekt

            // Konvertiert den symmetrischen Schlüssel-String in ein SecretKey-Objekt
            byte[] decodedKey = Base64.getDecoder().decode(symmetricKeyString);
            SecretKeySpec symmetricKey = new SecretKeySpec(decodedKey, 0, decodedKey.length, "AES");

            // Rest der Verschlüsselungslogik...
            // ...

        } catch (Exception e) {
            e.printStackTrace();
            System.exit(2);
        }
    }
}
