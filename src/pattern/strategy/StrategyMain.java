package pattern.strategy;

import pattern.strategy.behavior.Behavior;
import pattern.strategy.behavior.SysOutBehavior;

/**
 * @author Ethan.Barbatos
 * @version AWS-G.1.0
 * @date 10/30 19:00
 *
 * <p>
 *      策略模式:
 *          使用组合将策略引入调用类
 * </p>
 */
public class StrategyMain {

    public static void main(String[] args) {
        Behavior behavior = new SysOutBehavior();
        StrategyContainer container = new StrategyContainer(behavior);
        container.serve();
    }
}
