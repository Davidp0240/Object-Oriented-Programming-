# Factory Pattern - Operation System Example

This is a example of the Factory design pattern.

The idea is that instead of creating the object directly in `Main`, I let
`SystemFactory` decide which operating system object to create.

So instead of writing something like:
```java
OperationSystem system = new MacOS();
```
I can write:
```java
OperationSystem system = SystemFactory.yourSystem(SystemType.MACOS);
```

That means `Main` does not need to know the exact class it is creating. It just
asks the factory for the system it wants.

## What The Code Does
The program creates one operating system object and then calls three methods on
it:

```java
system.read();
system.write();
system.save();
```

Right now, `Main` asks for `MACOS`, so the output is:

MacOS: reading file
MacOS: writing into file
MacOS: saving file


If I change this line in `Main.java`:

```java
OperationSystem system = SystemFactory.yourSystem(SystemType.MACOS);
```

to:

```java
OperationSystem system = SystemFactory.yourSystem(SystemType.LINUX);
```

then the factory will create a `Linux` object instead.

## File Breakdown

`OperationSystem.java`

This is the interface. It says every operating system class must have:

```java
read();
write();
save();
```

`MacOS.java`, `Linux.java`, and `Window.java`

These classes implement the `OperationSystem` interface. Each one has its own
version of `read`, `write`, and `save`.

`SystemType.java`

This is an enum. It stores the possible system types:

```java
WINDOW, MACOS, LINUX
```

`SystemFactory.java`

This is the factory class. It takes a `SystemType` and returns the correct
object.

`Main.java`

This is where the program starts. It asks the factory for an operating system,
then uses it.

## How To Compile And Run

Run these commands from the root of the repository:

```bash
cd /Users/davidpan/Documents/Object-Oriented-Programming-
```

Compile the code:

```bash
javac -d out Design_Patterns/Creational/Factory/Operation_System/*.java
```

Run the program:

```bash
java -cp out Design_Patterns.Creational.Factory.Operation_System.Main
```

## Why Use `-d out`?

This keeps the compiled `.class` files inside the `out` folder instead of
putting them beside the `.java` files.

So the source folder stays cleaner.

## Why Use `-cp out`?

`-cp` means classpath.

It tells Java where to look for the compiled `.class` files. Since I compiled
the code into `out`, I also need to run it from `out`.

## Important Note

Because the files use this package:

```java
package Design_Patterns.Creational.Factory.Operation_System;
```

I need to run the program using the full class name:

```bash
java -cp out Design_Patterns.Creational.Factory.Operation_System.Main
```

If I only run:

```bash
java Main
```

Java will not find it properly because `Main` belongs to that package.
