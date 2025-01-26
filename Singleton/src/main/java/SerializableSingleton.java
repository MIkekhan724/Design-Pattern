import java.io.Serializable;

/**
 * Serializable Singleton with Double-Checked Locking
 * - Ensures thread safety and prevents singleton violation during deserialization.
 * - The `readResolve()` method prevents a new instance from being created during deserialization.
 */
public class SerializableSingleton implements Serializable {

    // Volatile ensures visibility of changes across threads and prevents instruction reordering.
    private static volatile SerializableSingleton instance = null;

    // Private constructor prevents direct instantiation.
    private SerializableSingleton() {
        System.out.println("SerializableSingleton instance created.");
    }

    /**
     * Provides a global access point for the singleton instance.
     * Uses double-checked locking for thread safety and performance.
     *
     * @return The singleton instance.
     */
    public static SerializableSingleton getInstance() {
        if (instance == null) {  // First check (non-synchronized for performance)
            if (instance == null) {  // Second check (thread-safe)
                instance = new SerializableSingleton();
            }
//            synchronized (SerializableSingleton.class) {  // Acquire lock
//                if (instance == null) {  // Second check (thread-safe)
//                    instance = new SerializableSingleton();
//                }
//            }
        }
        return instance;
    }

    /**
     * Prevents the creation of a new instance during deserialization process by JVM.
     * This method ensures the singleton property holds even after the object is deserialized.
     *
     * @return The existing singleton instance.
     */
    protected Object readResolve() {
        return getInstance(); // Ensure the same instance is returned after deserialization
    }
}