package assignments.assignment5.singleton;

import java.io.BufferedWriter;

public class Logger {
    private static Logger instance;
    private BufferedWriter writer;
    private String fileName;

    private Logger() {
        this.fileName = "log.txt";
        try {
            writer = new BufferedWriter(new java.io.FileWriter(fileName));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void setFileName(String fileName) {
        try {
            if (writer != null) {
                writer.close();
            }
            this.fileName = fileName;
            writer = new BufferedWriter(new java.io.FileWriter(this.fileName));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void write(String text) {
        try {
            writer.write(text);
            writer.newLine();
            writer.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void close() {
        try {
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
