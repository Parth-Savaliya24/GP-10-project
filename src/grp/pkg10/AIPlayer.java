package grp.pkg10;

public class AIPlayer extends Player {

    public AIPlayer(String name) {
        super(name, new AIMoveStrategy());
    }
}
