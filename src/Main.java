import java.io.*;
import java.util.*;

class wordFilter implements FilenameFilter {
      Scanner scan = new Scanner(System.in);
      String inputName = scan.next();

         public boolean accept(File dir, String name) {
             return name.toLowerCase().startsWith(inputName);
         }

    public static void main(String[] args)
    {
     



        File wf = new File("C:\\Users\\RuDD\\Desktop\\javafile");
        while(1<5){
        System.out.println("შეიყვანეთ საძიებო სიტყვა : ");
        for (String fileName : wf.list(new wordFilter())) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("მოიძებნა " + fileName);
        }
        }
    }
}