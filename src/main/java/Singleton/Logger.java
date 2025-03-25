package Singleton;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    private static Logger instance;
    private BufferedWriter writer;
    private String fileName;

    private Logger() {
        this.fileName = "default_name.txt";
        this.writer = null;
    }

    public synchronized void setFileName(String fileName) {
        try {
            if (writer != null) {
                writer.close();
            }

            this.fileName = fileName;

            File file = new File(fileName);
            this.writer = new BufferedWriter(new FileWriter(file, true));
        } catch (IOException e) {
            System.err.println("Error while setting file name: " + e.getMessage());
        }
    }

    public synchronized void write(String message) {
        try {
            if (writer != null) {
                writer.write(message);
                writer.newLine();
                writer.flush();
            } else {
                System.err.println("Error: Log file not initialized.");
            }
        } catch (IOException e) {
            System.err.println("Error while writing to the log file: " + e.getMessage());
        }
    }

    public synchronized void close() {
        try {
            if (writer != null) {
                writer.close();
            }
        } catch (IOException e) {
            System.err.println("Error while closing the log file: " + e.getMessage());
        }
    }

    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
}
