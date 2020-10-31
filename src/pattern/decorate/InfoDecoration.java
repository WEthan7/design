package pattern.decorate;

import pattern.decorate.component.Wrapper;

/**
 * @author Ethan.Barbatos
 * @version AWS-G.1.0
 * @date 10/31 0:45
 */
public class InfoDecoration extends Decoration {

    public InfoDecoration(Wrapper wrapper) {
        super(wrapper);
    }

    @Override
    public void serve() {
        super.before();
        super.expose().serve();
        super.after();
    }
}
