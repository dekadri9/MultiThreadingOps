# MultiThreading Operations

Multithreading operations is a Java program that parallelize the process of 5 operations, keeping the correct dependencies between them.

## Software requisites

In order to execute the program, at least Java SDK 11 (Java version 11.0.6) must be installed. You can install it here [Java](https://www.oracle.com/java/technologies/downloads/).

## Usage

You can find the executable file at /out/artifacts/MultiThreadingOperations_jar and then execute it with this command line:

```bash
java -jar MultiThreadingOperations.jar

#Output

Performing operation 1 in thread number 12.
Performing operation 5 in thread number 14.
Performing operation 2 in thread number 13.
Operation 1 finished. Thread number 12 released.
Operation 2 finished. Thread number 13 released.
Performing operation 3 in thread number 12.
Operation 3 finished. Thread number 12 released.
Performing operation 4 in thread number 13.
Operation 4 finished. Thread number 13 released.
Operation 5 finished. Thread number 14 released.

```

## Testing
JUnit4 tests have been implemented. In order to correctly run them, it's recommended to use IntelliJ IDE to open the project and then make right click over test directory and finally select "Run 'All tests'".

## Out of scope
A possible upgrade to this solution will be making it more portable and reusable by doing it for a n number of operations and defining their dependencies.

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.
