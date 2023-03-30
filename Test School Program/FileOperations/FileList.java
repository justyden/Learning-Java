package FileOperations;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;

public class FileList {
    String basePath;

    public FileList(String path) {
        this.basePath = path;
    }

    public void fileOP(String fileName) {

    }

    public void createFile(String fileName) throws Exception {
        String path = basePath + File.separator + fileName;
        File file = new File(path);

        try {
            file.createNewFile();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void deleteFile(String fileName) throws Exception {
        String path = basePath + File.separator + fileName;
        File file = new File(path);

        try {
            file.delete();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void writeFile(String fileName) throws Exception {
        String path = this.basePath + File.separator + fileName;
        File file = new File(path);
        if (!file.exists()) {
            file.createNewFile();
        }

        RandomAccessFile raf = new RandomAccessFile(file, "rw");

        try {
            String word1 = "Yes";
            raf.writeBytes(word1);
            raf.writeBytes(System.lineSeparator());
            String word2 = "More";
            raf.writeBytes(word2);
            raf.writeBytes(System.lineSeparator());
            String word3 = "Great";
            raf.writeBytes(word3);

            System.out.println("Words were added.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            raf.close();
        }

    }

    public void readFile(String fileName) throws Exception {
        String path = basePath + File.separator + fileName;
        File file = new File(path);

        if (!file.exists()) {
            file.createNewFile();
        }

        RandomAccessFile raf = new RandomAccessFile(file, "rw");

        try {
            while (raf.getFilePointer() < raf.length()) {
                String word = raf.readLine();
                System.out.println("The word is " + word);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        raf.close();
    }
}
