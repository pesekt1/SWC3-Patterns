package behavioral.chainOfResponsibility;

public class Encryptor extends Handler {
  public Encryptor(Handler next) {
    super(next);
  }

  @Override
  public boolean doHandle(HttpRequest request) {
    System.out.println("Encryption");
    return false; //pass to next handler
  }
}
