import java.io.File;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
//        file1.getAbsolutePath()

//        System.out.println(file1.exists());
//        System.out.println(file2.exists());
//        System.out.println(mainJava.exists());
        File currentProject = new File("./");
        File file2 = new File("folder1/folder2/hi.txt");
        File file3 = new File("../../21/Main.java");
        File src = new File("src");
        File windowsFolder = new File("C:\\Windows\\");
        File mainJava = new File("src/Main.java");
//        System.out.println(src.isDirectory());
//        System.out.println(mainJava.isDirectory());
//
//        System.out.println(src.isFile());
//        System.out.println(mainJava.isFile());
//        File[] files = windowsFolder.listFiles();
//        for(File file: files) {
//            System.out.println(file.getName());
//
//        }

//        boolean result = (new File("test/emptyFolder/")).delete();
//
//        System.out.println(result);

        File source = new File("test/file2.txt");
        File destination = new File("test/d2.txt");
        System.out.println(source.renameTo(destination));

    }
}