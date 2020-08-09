package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class PointIconFactory {

  //HashMap is storing icons that were already instantiated
  // so that there is only 1 instance of each type
  private Map<PointType, PointIcon> icons = new HashMap<>();

  public PointIcon getPointIcon(PointType type) {
    if (!icons.containsKey(type)) {
      var icon = new PointIcon(type, null); //icon instantiating
      icons.put(type, icon);
    }

    return icons.get(type);
  }
}
