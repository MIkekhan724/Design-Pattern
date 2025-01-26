/**
 * Eager Singleton Design Pattern:
 * - An instance of the class is created at the time of class loading (JVM startup).
 * - The object is created whether it is accessed by the application or not.
 *
 * When to use:
 * - Suitable for scenarios where a static resource (like a cache or configuration)
 *   needs to be available immediately when the application starts.
 *
 * Drawback:
 * - It consumes resources even if the object is never used during the application's lifecycle.
 * - Not suitable for scenarios where object creation is resource-intensive and rarely used.
 */
public class EagerSingleton {

    // Eager initialization of the singleton instance at the time of class loading.
    private static final EagerSingleton instance = new EagerSingleton();

    // Private constructor prevents instantiation from outside the class.
    private EagerSingleton() {
        System.out.println("EagerSingleton instance created.");
    }

    /**
     * Provides a global access point to the singleton instance.
     * The method is static to allow access without creating an object of the class.
     *
     * @return the singleton instance
     */
    public static EagerSingleton getInstance() {
        return instance;
    }
}
