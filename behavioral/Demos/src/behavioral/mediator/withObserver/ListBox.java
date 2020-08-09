package behavioral.mediator.withObserver;

public class ListBox extends UIControl {
  private String selection; //for simplicity we dont use a list

  public String getSelection() {
    return selection;
  }

  public void setSelection(String selection) {
    this.selection = selection;
    notifyEventHandlers();
  }
}
