package Design_Patterns.Creational.Builder;

public class Computer {
  private final String cpu; // mandatory
  private final String gpu; // mandatory
  private int ram; // optional
  private final int storage; // optional
  private final boolean wifi; // optional
  private final boolean bluetooth; // optional

  // private — only the inner Builder may instantiate Pizza
  private Computer(Builder builder) {
    this.cpu = builder.cpu;
    this.gpu = builder.gpu;
    this.ram = builder.ram;
    this.storage = builder.storage;
    this.wifi = builder.wifi;
    this.bluetooth = builder.bluetooth;
  }

  public static class Builder {
    private String cpu; // mandatory
    private String gpu; // mandatory
    private int ram = 0; // optional
    private int storage = 0; // optional
    private boolean wifi = false; // optional
    private boolean bluetooth = false; // optional

    public Builder(String cpu, String gpu) {
      this.cpu = cpu;
      this.gpu = gpu;
    }

    public Builder setRam(int ram) {
      this.ram = ram;
      return this;
    }

    public Builder setStorage(int storage) {
      this.storage = storage;
      return this;
    }

    public Builder setWifi(boolean wifi) {
      this.wifi = true;
      return this;
    }

    public Builder setBluetooth(boolean bluetooth) {
      this.bluetooth = true;
      return this;
    }

    public Computer build() {
      return new Computer(this);
    }
  }

  @Override
  public String toString() {
    return cpu + " | " + gpu + " | " + ram + "GB RAM | " + storage + "GB SSD";
  }

  public void setRam(int ram) {
    this.ram = ram;
  }

}