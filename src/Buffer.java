import java.io.*;

public class Buffer {


    public static String Load() throws IOException
    {
        StringBuilder loadString = new StringBuilder();
        String fileName = "data.txt";
        BufferedReader load = new BufferedReader(new FileReader(fileName));

        while ((fileName = load.readLine()) != null)
        {
            loadString.append('\n').append(fileName);
        }
        load.close();
        return loadString.toString();
    }
}
