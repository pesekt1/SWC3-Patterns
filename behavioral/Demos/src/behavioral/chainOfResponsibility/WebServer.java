package behavioral.chainOfResponsibility;

//webServer has a reference to the first handler in the chain - but only via interface (abstract class)
public class WebServer {
  private Handler handler; //interface - abstract class, web server does not know implementation

  public WebServer(Handler handler) {
    this.handler = handler;
  }

  public void handle(HttpRequest request) {
    handler.handle(request);
  }
}
