package grp.pkg10;

// **Inheritance**: Abstract class serves as a blueprint for different player types
public abstract class Player {
    private String name; // **Encapsulation**: Private field with controlled access

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Abstract method ensures cohesion by enforcing subclasses to implement specific behavior
    public abstract Card playCard();
}
