package pattern.strategy;

import pattern.strategy.behavior.Behavior;

/**
 * @author Ethan.Barbatos
 * @version AWS-G.1.0
 * @date 10/30 18:59
 */
public class StrategyContainer {
    private Behavior behavior;

    public StrategyContainer(Behavior behavior) {
        this.behavior = behavior;
    }

    public void serve() {
        this.behavior.serve();
    }
}
