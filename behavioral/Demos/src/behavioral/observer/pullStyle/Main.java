package behavioral.observer.pullStyle;

//Pull style of communication - there is a coupling between DataSource and Observer implementations:
//The coupling is used for passing the values.

public class Main {
    public static void main(String[] args) {

        var dataSource = new DataSource();

        var sheet1 = new SpreadSheet(dataSource);
        var chart = new Chart(dataSource);

        dataSource.addObserver(sheet1);
        dataSource.addObserver(chart);

        dataSource.setValue(1);

    }
}