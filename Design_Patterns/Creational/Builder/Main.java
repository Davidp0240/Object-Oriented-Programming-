package Design_Patterns.Creational.Builder;

public class Main {
  public static void main(String[] arg){
    Computer computer = new Computer.Builder("I5-12400f", "RTX3060").build();
    computer.setRam(32);

    System.out.println(computer);
  }
}
