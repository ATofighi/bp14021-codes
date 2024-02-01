import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        File f = new File(inputScanner.next());
        try {
            FileInputStream fis = new FileInputStream(f);
            Scanner sc = new Scanner(fis);
            while(sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found!");
        }
    }
}
