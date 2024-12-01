package grp.pkg10;

// **Inheritance**: Abstract class serves as a blueprint for different player types
// Player.java
public abstract class Player {
    protected String name;
    protected MoveStrategy moveStrategy;

    public Player(String name, MoveStrategy moveStrategy) {
        this.name = name;
        this.moveStrategy = moveStrategy;
    }

    public String getName() {
        return name;
    }

    public void makeMove() {
        moveStrategy.makeMove(name);
    }
}
