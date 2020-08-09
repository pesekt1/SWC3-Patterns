package structural.adapter;

import structural.adapter.avaFilters.Caramel;

// adapter solution - using composition
// adapter contains Caramel object so it has access to its implementation detail.

public class CaramelFilter implements Filter {
  private Caramel caramel;

  public CaramelFilter(Caramel caramel) {
    this.caramel = caramel;
  }

  @Override
  public void apply(Image image) {
    caramel.init(); //calling the internal implementation
    caramel.render(image); //calling the internal implementation
  }
}
