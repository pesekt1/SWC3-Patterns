package behavioral.mediator.withoutObserver;

public class Main {
    public static void main(String[] args) {
        var articlesDialogBox = new ArticlesDialogBox();

        //button.isEnabled when we select an item in the listBox and title in the textBox is not empty.
        articlesDialogBox.simulateUserInteraction();
    }
}