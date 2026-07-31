package Design_Patterns.Creational.Factory.Operation_System;

public class MacOS implements OperationSystem {

  @Override
  public void read(){
          System.out.println("MacOS: reading file");
  }

  @Override
  public void save() {
          System.out.println("MacOS: saving file");
  }

  @Override
  public void write() {
          System.out.println("MacOS: writing into file");
  }
}
