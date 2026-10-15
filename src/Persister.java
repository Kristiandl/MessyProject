import java.io.*;
import java.util.*;

public class Persister
{
    public static void save(ArrayList<User> u) throws IOException
    {
        File file = new File("users.txt");
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        for(int x=0; x < u.size() - 1; x++)
        {
            bw.write(u.get(x).name);
            bw.write(u.get(x).getId());
        }
    }
}
