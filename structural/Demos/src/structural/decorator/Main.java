package structural.decorator;

public class Main {
    public static void main(String[] args) {
        Stream stream = new CloudStream();
        storeCreditCard(stream);

        stream = new EncryptedCloudStream(new CloudStream());
        storeCreditCard(stream);

        stream = new EncryptedCloudStream(new CompressedCloudStream(new CloudStream()));
        storeCreditCard(stream);
    }

    public static void storeCreditCard(Stream stream){
        stream.write("1234-1234-1234-1234");
    }
}