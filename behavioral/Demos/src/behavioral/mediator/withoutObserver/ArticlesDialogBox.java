package behavioral.mediator.withoutObserver;

public class ArticlesDialogBox extends DialogBox {
    private final ListBox articlesListBox = new ListBox(this);
    private final TextBox titleTextBox = new TextBox(this);
    private final Button articlesButton = new Button(this);


    @Override
    public void changed(UIControl control) {
        if (control == articlesListBox)
            articleSelected();
        else if (control == titleTextBox)
            titleChanged();
    }

    private void articleSelected() {
        titleTextBox.setContent(articlesListBox.getSelection());
        articlesButton.setEnabled(true);
    }

    private void titleChanged() {
        var content = titleTextBox.getContent();
        var isEmpty = (content == null || content.isEmpty());
        articlesButton.setEnabled(!isEmpty);
    }

    public void simulateUserInteraction(){
        System.out.println("Button enabled: " + articlesButton.isEnabled());
        articlesListBox.setSelection("Article 1");
        System.out.println("TextBox: " + titleTextBox.getContent());
        System.out.println("Button enabled: " + articlesButton.isEnabled());
        titleTextBox.setContent("");
        System.out.println("TextBox: " + titleTextBox.getContent());
        System.out.println("Button enabled: " + articlesButton.isEnabled());

    }
}
