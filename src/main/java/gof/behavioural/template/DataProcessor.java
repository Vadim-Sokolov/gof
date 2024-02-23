package gof.behavioural.template;

public abstract class DataProcessor {

    public String processData() {
        openFile();
        var result = writeData();
        closeFile();
        return result;
    }

    public void openFile() {
        System.out.println("Opening file");
    }

    public abstract String writeData();

    public void closeFile() {
        System.out.println("Closing file");
    }
}
