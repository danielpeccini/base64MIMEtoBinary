package java8base64;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;

public class Main {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("C:\\mybynaryasbase64mime.txt"); //binary file in base64 MIME format
        String mybinaryf = new String(Files.readAllBytes(path)); //read the base64MIME file
     
        byte[] asBytes = Base64.getDecoder().decode(mybinaryf); //convert from base64MIME to binary
        FileOutputStream fos = new FileOutputStream("C:mybynary.bin"); //save the binary on FS
        fos.write(asBytes);
        fos.close();
    }
}

