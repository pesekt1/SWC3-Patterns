package structural.flyweight;

public class Point {
  private int x;  // 4 bytes
  private int y;  // 4 bytes
  private PointIcon icon;

  public Point(int x, int y, PointIcon icon) {
    this.x = x;
    this.y = y;
    this.icon = icon;
  }

  public void draw() {
    //this represents drawing on the map
    System.out.printf("%s at (%d, %d)", icon.getType(), x, y);
  }
}
