/**
 * Multi-Threaded Singleton (Thread-Safe with Double-Checked Locking)
 * - Ensures that only a single instance of the class is created, even in a multi-threaded environment.
 * - Double-checked locking improves performance by reducing synchronization overhead.
 *
 * When to use:
 * - When a singleton is required in a multi-threaded environment.
 * - Useful when object creation is resource-intensive and should be controlled.
 *
 * Drawback:
 * - Slightly more complex due to the use of synchronization and double-checking.
 */
public class MultiThreadSingleton {

    // Volatile ensures visibility of changes across threads and prevents instruction reordering.
    private static volatile MultiThreadSingleton instance = null;

    // Private constructor to prevent external instantiation.
    private MultiThreadSingleton() {
        System.out.println("MultiThreadSingleton instance created.");
    }

    /**
     * Provides a global access point for the singleton instance.
     * - Double-Checked Locking is used to ensure thread safety and optimal performance.
     *
     * @return The singleton instance.
     */
    public static MultiThreadSingleton getInstance() {
        // First check (non-synchronized) for better performance.
        if (instance == null) {
            synchronized (MultiThreadSingleton.class) { // T1 acquires lock here.
                // Second check within synchronized block to ensure only one instance creation.
                if (instance == null) {
                    // T1 creates the instance and releases the lock.
                    instance = new MultiThreadSingleton();
                }
                // If T1 creates the instance and exits, T2 will acquire the lock next
                // and find the instance already created, avoiding duplicate creation.
            }
        }
        return instance;
    }
}