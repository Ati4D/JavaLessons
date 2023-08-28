package project.Models;

public class Street {
    private String name;

    public Street() {
        this("");
    }

    public Street(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
