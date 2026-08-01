# Factory Pattern Map

This is the structure of my factory pattern example in UML diagram.

```mermaid
classDiagram
    direction TB

    class OperationSystem {
        <<interface>>
        +read()
        +write()
        +save()
    }

    class MacOS {
        +read()
        +write()
        +save()
    }

    class Linux {
        +read()
        +write()
        +save()
    }

    class Window {
        +read()
        +write()
        +save()
    }

    class SystemType {
        <<enum>>
        WINDOW
        MACOS
        LINUX
    }

    class SystemFactory {
        +yourSystem(SystemType system) OperationSystem
    }

    class Main {
        +main(String[] args)
    }

    OperationSystem <|.. MacOS : implements
    OperationSystem <|.. Linux : implements
    OperationSystem <|.. Window : implements

    SystemFactory ..> SystemType : checks type
    SystemFactory --> OperationSystem : returns
    SystemFactory --> MacOS : creates
    SystemFactory --> Linux : creates
    SystemFactory --> Window : creates

    Main ..> SystemFactory : uses
    Main ..> SystemType : chooses MACOS
```

## Simple Flow

```mermaid
flowchart TD
    Main["Main.java<br/>program starts here"]
    Type["SystemType.MACOS<br/>the option I choose"]
    Factory["SystemFactory<br/>decides which class to create"]
    Interface["OperationSystem<br/>common interface"]
    Mac["MacOS"]
    Lin["Linux"]
    Win["Window"]
    Methods["read()<br/>write()<br/>save()"]

    Main --> Type
    Main --> Factory
    Type --> Factory
    Factory --> Mac
    Factory --> Lin
    Factory --> Win
    Mac -. implements .-> Interface
    Lin -. implements .-> Interface
    Win -. implements .-> Interface
    Interface --> Methods
```

The main idea is:

```text
Main chooses a SystemType
SystemFactory creates the matching class
All system classes follow the OperationSystem interface
Main can use read, write, and save without caring which exact class was created
```
