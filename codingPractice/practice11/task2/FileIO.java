import java.io.*;
public class FileIO
{
 // This method opens file s,
 // reads and outputs to screen its contents
 void fileRead(String s) throws IOException
 {
 System.out.println("fileRead in the base class reached ");
 }
 // This method opens file s
 // and writes array a to it
 void fileWrite(String s, String[] a) throws IOException
 {
 System.out.println("fileWrite in the base class reached ");
 }
}
