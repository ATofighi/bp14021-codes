import java.io.*;
import java.util.Scanner;

public class ReadAndWrite {
    public static void main(String[] args) {
        File f = new File("f.txt");
        if (f.exists()) {
            try {
                FileInputStream fis = new FileInputStream(f);
                Scanner sc = new Scanner(fis);
                while(sc.hasNextLine()) {
                    System.out.println(sc.nextLine());
                }
            } catch (FileNotFoundException e){
                e.printStackTrace();
            }
        }
        try {
            FileOutputStream fos = new FileOutputStream(f, true);
            PrintStream ps = new PrintStream(fos);
            Scanner sc = new Scanner(System.in);
            while(sc.hasNextLine()) {
                ps.println(sc.nextLine());
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
