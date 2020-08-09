package behavioral.mediator.withObserver;

public class ArticlesDialogBox {
  private ListBox articlesListBox = new ListBox();
  private TextBox titleTextBox = new TextBox();
  private Button saveButton = new Button();

  public ArticlesDialogBox() {
    articlesListBox.addEventHandler(this::articleSelected); // attach observer
    titleTextBox.addEventHandler(this::titleChanged); // attach observer
  }

  public void simulateUserInteraction() {
    articlesListBox.setSelection("Article 1");
    titleTextBox.setContent("");
    //titleTextBox.setContent("Article 2");
    System.out.println("TextBox: " + titleTextBox.getContent());
    System.out.println("Button: " + saveButton.isEnabled());
  }

  //implementation of handle() method - used for TextBox
  private void titleChanged() {
    var content = titleTextBox.getContent();
    var isEmpty = (content == null || content.isEmpty());
    saveButton.setEnabled(!isEmpty);
  }

  //implementation of handle() method - used for ListBox
  private void articleSelected() {
    titleTextBox.setContent(articlesListBox.getSelection());
    saveButton.setEnabled(true);
  }
}
