package hw1;

public class Road implements overcomable {
    private int length;

    public Road(int length) {
        this.length = length;
    }
    public void overcome (Competitable competitable) {competitable.run(length);}

}
