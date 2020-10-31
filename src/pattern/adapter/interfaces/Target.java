package pattern.adapter.interfaces;

/**
 * @author Ethan.Barbatos
 * @version AWS-G.1.0
 * @date 10/31 18:11
 *
 * <p>
 *     暴露在外的接口, 被指定的接口, 单不实际执行
 * </p>
 */
public interface Target {
    void serve();
}
