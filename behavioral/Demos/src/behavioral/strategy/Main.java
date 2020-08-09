package behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        //fixed strategy object - we define the strategy only once - via constructor:
        var imageStorage2 = new ImageStorage2(new JpegCompressor(), new BlackAndWhiteFilter());
        imageStorage2.store("file1");
        imageStorage2.store("file2");

        //flexible strategy object - method dependency injection:
        var imageStorage = new ImageStorage();
        imageStorage.store("file1", new JpegCompressor(), new BlackAndWhiteFilter());
        imageStorage.store("file1", new PngCompressor(), new BlackAndWhiteFilter());
    }
}