package structural.adapter;

import structural.adapter.avaFilters.Caramel;

// another adapter solution - using inheritance
// it extends Caramel instead of containing it.
//NOTE: It has a limit - if Filter was an Abstract class, it would not work
//because in Java we cannot have multiple inheritance.

public class CaramelFilterInheritance extends Caramel implements Filter {
  @Override
  public void apply(Image image) {
    init();
    render(image);
  }
}
