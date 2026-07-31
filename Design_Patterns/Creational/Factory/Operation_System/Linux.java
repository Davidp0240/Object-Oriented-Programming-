package Design_Patterns.Creational.Factory.Operation_System;

public class Linux implements OperationSystem {
  @Override
  public void read() {
    System.out.println("Linux: reading file");
  }

  @Override
  public void save() {
    System.out.println("Linux: saving file");
  }

  @Override
  public void write() {
    System.out.println("Linux: writing into file");
  }
}
