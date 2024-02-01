import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class WriteFile {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("file.txt");
        FileOutputStream fos = new FileOutputStream(f, true);
        PrintStream ps = new PrintStream(fos);
        ps.println("bye!");
    }
}
