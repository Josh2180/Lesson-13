
public class Task {

    String name;
    String description;

    public Task(String n, String d) {
        name = n;
        description = d;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return description;
    }   

    public boolean validate() {
        if (name == null || description == null || name.equals("") || description.equals("")) {
            return false;
        } else {
            return true;
        }
    }

    public String toString() {
        return "Name: " + name + "\nDescription: " + description + "\n========\n";
    }
}
