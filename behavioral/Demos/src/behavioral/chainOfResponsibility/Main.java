package behavioral.chainOfResponsibility;

//we create a chain of responsibility:
//authenticator -> logger -> compressor (it is like a LinkedList, each node contains the next node)
//webServer handles the request through this pipeline.

public class Main {
    public static void main(String[] args) {
        var compressor = new Compressor(null); //last in the chain
        var logger = new Logger(compressor);
        var authenticator = new Authenticator(logger);
        var server = new WebServer(authenticator);

        var request = new HttpRequest("admin", "1234");
        server.handle(request);
    }
}