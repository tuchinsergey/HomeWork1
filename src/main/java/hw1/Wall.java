package hw1;

public class Wall implements overcomable {
    private int heght;

    public Wall(int heght) {
        this.heght = heght;
    }
    public void overcome (Competitable competitable) {competitable.jump(heght);}

}
