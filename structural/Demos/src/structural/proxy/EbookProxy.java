package structural.proxy;

public class EbookProxy implements Ebook {
  private String fileName;
  private RealEbook ebook; //only reference

  public EbookProxy(String fileName) {
    this.fileName = fileName;
    // no book content loading here, only the name
  }

  @Override
  public void show() {
    if (ebook == null)
      ebook = new RealEbook(fileName); //lazy initialization: instantiating only once and only when needed

    ebook.show();
  }

  @Override
  public String getFileName() {
    return fileName;
  }
}
