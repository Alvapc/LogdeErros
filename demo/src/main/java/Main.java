import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        try {
            // Código que pode lançar uma exceção
            int result = 10 / 0;
        } catch (Exception e) {
            logger.error("Um erro ocorreu: ", e);
        }
    }
}
