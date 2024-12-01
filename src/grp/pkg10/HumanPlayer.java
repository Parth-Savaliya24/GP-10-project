package grp.pkg10;

public class HumanPlayer extends Player {

    public HumanPlayer(String name) {
        super(name, new HumanMoveStrategy());
    }
}
