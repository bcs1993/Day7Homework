import java.util.ArrayList;

public class TVEpisode {
    private String title;
    private int length;
    private String director;
    private ArrayList<String> cast;


    public TVEpisode(ArrayList<String> cast) {
        this.cast = cast;
    }

    public ArrayList<String> getCast() {
        return cast;
    }

    public void setCast(ArrayList<String> cast) {
        this.cast = cast;
    }

    public TVEpisode(String title, int length, String director, ArrayList<String> cast) {
        this.title = title;
        this.length = length;
        this.director = director;
        this.cast = cast;


    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }


}
