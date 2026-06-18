package b08a4;
import java.io.IOException;

public class RationalAusdruckTest {
    static void main(String[] args) throws IOException {
        try {
            RationalAusdruck.dialog();
        } catch ( IOException e) {
            System.out.println("Fehler: " + e.getMessage());
        }
    }
}
