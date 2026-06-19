// Taking input by BuferedReader()

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class InputByBufferedReader  {

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = 
                new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Name : ");
        String name = br.readLine();

        System.out.println("Hello " + name + "!!");
    }        
}
