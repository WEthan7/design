package pattern.singleton;

/**
 * @author Ethan.Barbatos
 * @version AWS-G.1.0
 * @date 10/31 13:19
 *
 * <p>
 *     单例模式:
 *          为了并发安全, 有时需要单例模式, 因为单例是不变的
 *          方式:
 *              饿汉式, 直接 static new
 *              懒汉式:
 *                  双重校验锁
 *                  类加载
 * </p>
 */
public class Singleton {
    private volatile static Singleton unique;

    private Singleton() {}

    /**
     * 双重校验锁
     * @return 唯一
     */
    public static Singleton doubleCheck() {
        if (unique == null) {
            synchronized (Singleton.class) {
                if (unique == null) {
                    unique = new Singleton();
                }
            }
        }
        return unique;
    }


    /**
     * 静态加载:
     *      因为加载Singleton时还不会加载InnerHelper, 内部类加载较晚
     *      所以只需要返回InnerHelper里的单例即可
     * @return 唯一
     */
    public static Singleton staticLoad() {
        return InnerHelper.unique;
    }

    static class InnerHelper {
       private static Singleton unique = new Singleton();
    }
}
