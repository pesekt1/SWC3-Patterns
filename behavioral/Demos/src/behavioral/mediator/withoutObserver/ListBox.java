package behavioral.mediator.withoutObserver;

public class ListBox extends UIControl {
  private String selection; //for simplicity we dont use a list

  public ListBox(DialogBox owner) {
    super(owner);
  }

  public String getSelection() {
    return selection;
  }

  public void setSelection(String selection) {
    this.selection = selection;
    owner.changed(this); // Hey owner, I am changed!
  }
}
