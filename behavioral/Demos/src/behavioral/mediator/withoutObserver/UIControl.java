package behavioral.mediator.withoutObserver;

public abstract class UIControl {
  protected DialogBox owner; // we use protected to allow inheritance for the child classes

  public UIControl(DialogBox owner){
    this.owner = owner;
  }

}
