package behavioral.observer.pushStyle;

//Push style of communication: We are passing the value via the interface.
//There is no coupling between the source and observer implementations.

public class Main {
    public static void main(String[] args) {

        var dataSource = new DataSource();
        var sheet1 = new SpreadSheet();
        var sheet2= new SpreadSheet();
        var chart = new Chart();

        dataSource.addObserver(sheet1);
        dataSource.addObserver(sheet2);
        dataSource.addObserver(chart);

        dataSource.setValue(1);




    }
}