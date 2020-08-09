package structural.flyweight;

public class Main {
    public static void main(String[] args) {
        var pointService = new PointService(new PointIconFactory());
        var points = pointService.getPoints();
        //simulation of drawing points on the map
        for (var point: points) {
            point.draw();
            System.out.println();
        }
    }
}