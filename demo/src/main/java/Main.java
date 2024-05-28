import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Código que pode lançar uma exceção
            int result = 10 / 0;
        } catch (Exception e) {
            // Escrever a mensagem de erro em um arquivo
            writeToLogFile("Um erro ocorreu: " + e.getMessage());
        }
    }

    private static void writeToLogFile(String message) {
        FileWriter fileWriter = null;
        try {
            File logFile = new File("error.log");
            fileWriter = new FileWriter(logFile, true);
            fileWriter.write(message + "\n");
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo de log: " + e.getMessage());
        } finally {
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                System.err.println("Erro ao fechar o FileWriter: " + e.getMessage());
            }
        }
    }
}
