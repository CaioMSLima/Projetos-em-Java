import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderr {

    public static void main(String[] args) {

        String path = "C:\\Users\\caiom\\Desktop\\Git\\Java\\_12-Trabalhando-com-arquivos\\src\\in.txt";
        BufferedReader br = null;
        FileReader fr = null;

        try{

            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String line = br.readLine();

            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }

        }
        catch (IOException e){
            System.out.println("Erro: " + e.getMessage());

        }
        finally {
            try {
                if (br != null){
                    br.close();
                }
                if (fr != null){
                    fr.close();

                }
            }
            catch (IOException e ){
                e.printStackTrace();
            }
        }
    }
}
