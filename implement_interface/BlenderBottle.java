package implement_interface;

public class BlenderBottle implements WaterBottle {
  // we will need to define the methods from the implemented interface
  public void fillUp() {
    System.out.println("filling up blender bottle");
  }
  public int bottleSize() {
    System.out.println("blender bottle size");
    return 0;
  }

}