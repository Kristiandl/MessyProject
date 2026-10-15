import java.util.ArrayList;

public class UserList
{
    public ArrayList<User> users = new ArrayList<User>();

    public void add(User user)
    {
        users.add(user);
        if(user == null)
        {
            return;
        }
    }

    public ArrayList<User> getUser()
    {
        return users;
    }
}
