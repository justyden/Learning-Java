package FileOperations;

import java.io.File;
import java.io.RandomAccessFile;

public class FileCommands {
    public static void createFile() {
        String basePath = "C:\\Program Files\\Coding Applications\\Visual Studio Code Programs\\Java Programs\\Test School Program";
        FileList fileList = new FileList(basePath);

        try {
            fileList.createFile("newfile.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void writeFile() {
        String basePath = "C:\\Program Files\\Coding Applications\\Visual Studio Code Programs\\Java Programs\\Test School Program";
        FileList fileList = new FileList(basePath);

        try {
            fileList.writeFile("newfile.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
