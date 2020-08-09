package behavioral.template;

public class Main {
    public static void main(String[] args) {
        var taskTransfer = new TransferMoneyTask();
        taskTransfer.execute(); //template method

        var taskGenerate = new GenerateReportTask();
        taskGenerate.execute(); //template method
    }
}