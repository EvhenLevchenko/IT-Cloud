package moduleThird.LabworkOne.labwork1;

import java.io.File;

public class PrintFile {
    public static void main(String[] args) {
        File directory = new File("E:/Game2/Progrm/project/It/IT-Cloud/src/moduleThird/labwork1");

        if(directory.isDirectory()){
            File[] listFiles=directory.listFiles();
            System.out.println("Content directory"+directory);
            for(File file : listFiles) System.out.println(file.getName());
        }else {
            System.out.println("Not specified directory ->"+directory);
        }
    }
}
