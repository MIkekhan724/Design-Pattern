Instruction to revisit and revise.
1. Lazy Loading:
    The Lazy Loading Singleton design pattern is used when an object needs to be created only once and reused throughout the program's lifecycle.
    Use Case: Commonly used for database connections where a DriverManager instance and connection string need to be created and reused.
    Drawback: It may lead to memory leaks if the object persists for extended periods without proper management.
2. Eager Loading:
    Eager Loading involves creating an object as soon as the JVM starts, regardless of whether the object is accessed by the application.
    Use Case: Suitable for scenarios where the application requires a static cache to be preloaded during startup.
    Drawback: It consumes system resources even if the object is not utilized, potentially leading to inefficiency.

Note: Both Lazy Loading and Eager Loading patterns are not thread-safe by default.
    They may fail in multithreaded environments where multiple threads attempt to create an instance simultaneously, leading to multiple object creation due to race conditions.