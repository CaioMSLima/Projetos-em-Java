import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterr {

    public static void main(String[] args) {

        String[] lines = new String[]{"Good morning","Good afternoon", "Good night"};

        String path = "C:\\Users\\caiom\\Desktop\\Git\\Java\\_12-Trabalhando-com-arquivos\\src\\txt\\out.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))){
            for (String line : lines){
                bw.write(line);
                bw.newLine();
            }

        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
