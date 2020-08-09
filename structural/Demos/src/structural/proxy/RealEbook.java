package structural.proxy;

public class RealEbook implements Ebook {
  private String fileName;

  public RealEbook(String fileName) {
    this.fileName = fileName;
    load(); // book content loading from the database
  }

  private void load() {
    System.out.println("Loading the ebook " + fileName);
  }

  @Override
  public void show() {
    System.out.println("Showing the ebook " + fileName);
  }

  @Override
  public String getFileName() {
    return fileName;
  }
}