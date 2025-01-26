/**
 * Lazy Singleton Design Pattern:
 * - The instance is created only when it is first requested (lazy initialization).
 * - Useful when the object is resource-intensive and may not always be required.
 *
 * When to use:
 * - Suitable for scenarios where object creation is expensive and not always necessary.
 *
 * Drawback:
 * - This implementation is **not thread-safe**.
 * - Multiple threads can enter the `getInstance()` method simultaneously, leading to multiple instances.
 */
public class LazySingleton {

    // The singleton instance, not initialized until requested.
    private static LazySingleton instance;

    // Private constructor to prevent instantiation from outside the class.
    private LazySingleton() {
        System.out.println("LazySingleton instance created.");
    }

    /**
     * Provides a global access point to the singleton instance.
     * Uses lazy initialization, creating the instance only when first accessed.
     *
     * @return The singleton instance
     */
    public static LazySingleton getInstance() {
        // Not thread-safe: multiple threads could enter this block simultaneously.
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
