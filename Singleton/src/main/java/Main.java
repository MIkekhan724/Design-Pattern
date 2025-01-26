import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // Lazy Loading Singleton Test
        LazySingleton obj1 = LazySingleton.getInstance();
        LazySingleton obj2 = LazySingleton.getInstance();
        System.out.println("Lazy Singleton Instances:");
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println("Are both instances equal? " + (obj1 == obj2)); // Should print true

        // Eager Loading Singleton Test
        EagerSingleton obj3 = EagerSingleton.getInstance();
        EagerSingleton obj4 = EagerSingleton.getInstance();
        System.out.println("\nEager Singleton Instances:");
        System.out.println(obj3);
        System.out.println(obj4);
        System.out.println("Are both instances equal? " + (obj3 == obj4)); // Should print true

        // MultiThreaded Singleton Test
        MultiThreadSingleton obj5 = MultiThreadSingleton.getInstance();
        MultiThreadSingleton obj6 = MultiThreadSingleton.getInstance();
        System.out.println("\nMultiThreaded Singleton Instances:");
        System.out.println(obj5);
        System.out.println(obj6);
        System.out.println("Are both instances equal? " + (obj5 == obj6)); // Should print true

        // Serialization Test with LazySingletonWithSerialization
        LazySingletonWithSerialization lazySingletonWithSerialization = LazySingletonWithSerialization.getInstance();

        // Serialize the instance to a file
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("LazySingleton.obj"));
        objectOutputStream.writeObject(lazySingletonWithSerialization);

        // Deserialize the instance from the file
        LazySingletonWithSerialization deserializedLazySingletonWithSerialization;
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("LazySingleton.obj"));
        deserializedLazySingletonWithSerialization = (LazySingletonWithSerialization) objectInputStream.readObject();


        // Display the results for LazySingletonWithSerialization
        System.out.println("\nSerialization Test for LazySingletonWithSerialization:");
        System.out.println("Original Instance HashCode: " + lazySingletonWithSerialization.hashCode());
        System.out.println("Deserialized Instance HashCode: " + deserializedLazySingletonWithSerialization.hashCode());
        System.out.println("Are both instances equal? " + (lazySingletonWithSerialization == deserializedLazySingletonWithSerialization));
        // Should print false unless readResolve() is correctly implemented

        // Serialization Test with SerializableSingleton
        SerializableSingleton serializableSingleton = SerializableSingleton.getInstance();

        // Serialize the instance to a file
        ObjectOutputStream serializableObjectOutputStream = new ObjectOutputStream(new FileOutputStream("SerializableSingleton.obj"));
        serializableObjectOutputStream.writeObject(serializableSingleton);


        // Deserialize the instance from the file
        SerializableSingleton deserializedSerializableSingleton;
        ObjectInputStream deserializeObjectInputStream = new ObjectInputStream(new FileInputStream("SerializableSingleton.obj"));
        deserializedSerializableSingleton = (SerializableSingleton) deserializeObjectInputStream.readObject();


        // Display the results for SerializableSingleton
        System.out.println("\nSerialization Test for SerializableSingleton:");
        System.out.println("Original Instance HashCode: " + serializableSingleton.hashCode());
        System.out.println("Deserialized Instance HashCode: " + deserializedSerializableSingleton.hashCode());
        System.out.println("Are both instances equal? " + (serializableSingleton == deserializedSerializableSingleton));
        // Should print true if readResolve() is correctly implemented
    }
}
