package Design_Patterns.Creational.Factory.Operation_System;

public class Window implements OperationSystem {

  @Override
  public void read(){
          System.out.println("Window: reading file");
  }

  @Override
  public void save() {
          System.out.println("Window: saving file");
  }

  @Override
  public void write() {
          System.out.println("Window: writing into file");
  }
}
