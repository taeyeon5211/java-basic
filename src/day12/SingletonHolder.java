package day12;

public class SingletonHolder {

    private SingletonHolder() {

    }

    private static class SingletonInstanceHolder {
        private static final SingletonHolder INSTANCE = new SingletonHolder();
    }

    public static SingletonHolder getInstance() {
        return SingletonInstanceHolder.INSTANCE;
    }
}
