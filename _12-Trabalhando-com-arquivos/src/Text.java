import java.io.File;

import java.io.IOException;
import java.util.Scanner;

public class Text {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\caiom\\Desktop\\Git\\Java\\_12-Trabalhando-com-arquivos\\src\\in.txt");
        Scanner sc = null;

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
