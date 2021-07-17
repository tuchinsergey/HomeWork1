package hw1;

public class Main{
    public static void main(String[] args) {
        Competitable[] Competitors = {new Cat(1, 21), new humen(5, 4),
                new Robot(518, 6)
        };
        overcomable[] overcomables = {new Wall(12), new Road(4)};

        for (Competitable competitable : Competitors) {
            for (overcomable overcomable : overcomables) {
                overcomable.overcome(competitable);
            }
        }
    }
}
