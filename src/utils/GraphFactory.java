package utils;

public class GraphFactory {
    private static GraphFactory ourInstance = new GraphFactory();

    public static GraphFactory getInstance() {
        return ourInstance;
    }

    private GraphFactory() {
    }
}
