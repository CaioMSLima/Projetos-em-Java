import java.io.File;
import java.util.Scanner;

public class ManipuleteFolders {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strPath = scan.nextLine();

        File path = new File(strPath);

        System.out.println();
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS: ");

        for (File folder: folders){

            System.out.println(folder);
        }

        System.out.println();
        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES: ");
        for (File file: files){


            System.out.println(file);
        }

        boolean sucecess = new File(strPath + "\\subdir").mkdir();
        System.out.println("Directory created successfully: " + sucecess);
    }
}
