package hw1;

public class Robot implements Competitable {
    private int jumpHeight;
    private int runlenght;

    public Robot(int jumpHeight, int runlenght) {
        this.jumpHeight = jumpHeight;
        this.runlenght = runlenght;
    }

    @Override
    public void jump(int height) {
        if (height>jumpHeight){
            System.out.println("Я робот, я не смог перепрыгнуть");}
        else {
            System.out.println("Я робот, я смог перепрыгнуть");
        }
    }
    @Override
    public void run(int length) {
        if (length>runlenght) {
            System.out.println("Я робот, я не смог пробежать"); }
        else {
            System.out.println("Я робот, я смог пробежать"); }

    }
}
