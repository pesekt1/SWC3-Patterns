package structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class PointService {
  private PointIconFactory iconFactory;

  public PointService(PointIconFactory iconFactory) {
    this.iconFactory = iconFactory;
  }

  //in real app this would communicate with the database
  //here we are just simulating reading from DB

  public List<Point> getPoints() {
    List<Point> points = new ArrayList<>();
    var point = new Point(1, 2, iconFactory.getPointIcon(PointType.CAFE));
    points.add(point);
    point = new Point(3, 3, iconFactory.getPointIcon(PointType.RESTAURANT));
    points.add(point);
    point = new Point(4, 5, iconFactory.getPointIcon(PointType.RESTAURANT));
    points.add(point);

    return points;
  }
}
