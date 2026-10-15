import java.io.*;
import java.util.*;

public class Persister
{
    public static void save(ArrayList<User> users) throws IOException
    {
        File file = new File("users.txt");
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        for (User user : users)
        {
            bw.write(user.getId() + ";" + user.getName());
            bw.newLine();
        }
    }
}
