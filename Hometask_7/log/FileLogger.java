package log;

import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements Logger {

    private String filePath;

    public FileLogger(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void log(String message) {
        try {
            FileWriter writer = new FileWriter(filePath, true);
            writer.write(message + System.lineSeparator());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
