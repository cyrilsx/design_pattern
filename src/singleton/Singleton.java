package singleton;

public class Singleton {

    private static volatile Singleton INSTANCE;

    private Singleton() {
        if (INSTANCE != null) {
            throw new IllegalStateException("Can't have two instances");
        }
    }

    public static Singleton getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton();
                }
            }
        }

        return INSTANCE;
    }
}
