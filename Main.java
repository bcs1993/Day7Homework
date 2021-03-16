import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cast = new ArrayList<>();
    cast.add("Karl Urban");
    cast.add("Jack Quaid");
    cast.add("Anthony Starr");
    cast.add("Erin Morarity");

    TVEpisode theBoys = new TVEpisode("The Name Of The Game", 60, "Dan Trachtenberg", cast);
        System.out.println(theBoys);
        System.out.println(cast);

    }
}
