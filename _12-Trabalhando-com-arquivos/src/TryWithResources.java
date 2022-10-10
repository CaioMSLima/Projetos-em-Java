import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class TryWithResources {

    public static void main(String[] args) {

        String path = "C:\\Users\\caiom\\Desktop\\Git\\Java\\_12-Trabalhando-com-arquivos\\src\\txt\\in.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();

            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }

        }
        catch (IOException e){
            System.out.println("Erro: " + e.getMessage());

        }

    }
}
