import java.io.Serializable;

public class LazySingletonWithSerialization implements Serializable {

    private static LazySingletonWithSerialization instance;

    private LazySingletonWithSerialization() {
        System.out.println("LazySingleton With Serialization instance created.");
    }

    public static LazySingletonWithSerialization getInstance() {

        if (instance == null) {
            instance = new LazySingletonWithSerialization();
        }
        return instance;
    }
}
