import java.io.File;

import java.io.IOException;
import java.util.Scanner;

public class Text {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\caiom\\Desktop\\Git\\Java\\_12-Trabalhando-com-arquivos\\src\\txt\\in.txt");
        Scanner scan = null;

        try {
            scan = new Scanner(file);
            while (scan.hasNextLine()) {
                System.out.println(scan.nextLine());
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            if (scan != null) {
                scan.close();
            }
        }
    }
}
