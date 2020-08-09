package structural.composite;

public class Main {
    public static void main(String[] args) {
        var group1 = new Group();
        group1.add(new Shape()); // rectangle1
        group1.add(new Shape()); //rectangle2

        var shape1 = new Shape(); //circle1

        var group = new Group();
        group.add(group1);
        group.add(shape1);

        group.render();
        group.move();
    }
}