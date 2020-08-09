package behavioral.strategy;

public class ImageStorage2 {
    private Compressor compressor;
    private Filter filter;

    public ImageStorage2(Compressor compressor, Filter filter) {
        this.compressor = compressor;
        this.filter = filter;
    }

    public void store(String filename){
        compressor.compress(filename);
        filter.apply(filename);
    }
}
