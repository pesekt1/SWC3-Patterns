package behavioral.chainOfResponsibility;

// abstract Handler:
// contains next, handle() method and doHandle() method - this has to be implemented
public abstract class Handler {
  private Handler next;

  public Handler(Handler next) {
    this.next = next;
  }

  public void handle(HttpRequest request) {
    if (doHandle(request))
      return; //terminate the process

    if (next != null)
      next.handle(request); //pass to next handler
  }

  public abstract boolean doHandle(HttpRequest request);
}
