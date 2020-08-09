package behavioral.mediator.withObserver;

public class Main {
    public static void main(String[] args) {
        var dialogBox = new ArticlesDialogBox();

        //button.isEnabled when we select an item in the listBox and title in the textBox is not empty.
        dialogBox.simulateUserInteraction();
    }
}