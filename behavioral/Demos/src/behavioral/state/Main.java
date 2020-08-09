package behavioral.state;

//state pattern - canvas behaves differently depending to which tool it is using - Polymorphism.
//we have Tool interface implemented by BrushTool and EraserTool, they implement basic methods.
public class Main {
    public static void main(String[] args) {
        Tool brushTool = new BrushTool();
        Tool eraserTool = new EraserTool();

        var canvas = new Canvas();

        canvas.setCurrentTool(brushTool);
        canvas.mouseDown();
        canvas.mouseUp();
        canvas.setCurrentTool(eraserTool);
        canvas.mouseDown();
        canvas.mouseUp();
    }
}