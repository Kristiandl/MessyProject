import java.util.Objects;

public class User
{
    public int id;
    public String name;

    public User(int id, String name){
        this.id = id;
        if(name.length() > 100) // Validating name
        {
            return;
        }
        this.name = name;
    }

    public int getId(){ return id; }

    @Override
    public boolean equals(Object o){
        if(o instanceof User u){
            return Objects.equals(u.name, name);
        }
        return false;
    }
}
