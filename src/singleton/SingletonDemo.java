package singleton;

public class SingletonDemo {

    public static void main(String[] args) {
        int id1 = System.identityHashCode(Singleton.getInstance());
        int id2 = System.identityHashCode(Singleton.getInstance());;

        System.out.println("Identity of singleton 1 " + id1);
        System.out.println("Identity of singleton 2 " + id2);

    }
}
