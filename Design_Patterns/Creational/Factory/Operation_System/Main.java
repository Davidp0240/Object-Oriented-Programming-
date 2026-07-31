package Design_Patterns.Creational.Factory.Operation_System;

public class Main {
  public static void main(String[] args){
    OperationSystem system = SystemFactory.yourSystem(SystemType.MACOS);
    system.read();
    system.write();
    system.save();
  }
  
}
