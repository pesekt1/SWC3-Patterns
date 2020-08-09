package behavioral.mediator.withoutObserver;

// Mediator - Every time any UIControl changed its state, it will call its dialogBox (owner)
// after the notification, mediator should figure out what to do - via implementation of changed() method
public abstract class DialogBox {
    public abstract void changed(UIControl control);
}
