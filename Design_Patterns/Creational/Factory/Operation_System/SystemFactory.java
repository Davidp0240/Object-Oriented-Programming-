package Design_Patterns.Creational.Factory.Operation_System;

public class SystemFactory {

  public static OperationSystem yourSystem(SystemType system){
    switch (system){
      case WINDOW: return new Window();
      case MACOS: return new MacOS();
      case LINUX: return new Linux();
      default: 
      throw new IllegalArgumentException("Unknown operation system: " + system);
    }
  }
}
