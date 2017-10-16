package java8base64;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;

public class Main {

    public static void main(String[] args) throws IOException {

        //read the binary file in base64 MIME format
        Path path = Paths.get("C:\\mybinaryasbase64mime.txt"); 
        String mybinaryf = new String(Files.readAllBytes(path)); 
     
        //convert from base64MIME to binary
        byte[] asBytes = Base64.getDecoder().decode(mybinaryf); 
        
        //save the binary on FS
        FileOutputStream fos = new FileOutputStream("C:mybinary.bin"); 
        fos.write(asBytes); 
        fos.close();
    }
}

