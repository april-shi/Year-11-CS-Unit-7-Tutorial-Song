import java.util.ArrayList;

public class Song {

    private String title;
    private String artist;

    private ArrayList<String> people = new ArrayList<>();

    public Song(String title, String artist) {

        this.title = title;
        this.artist = artist;

    }

    public String getArtist() {

        return artist;

    }

    public String getTitle() {

        return title;

    }

    public int howMany(ArrayList<String> names) {

        int count = 0;

        for (String name: names) {

            name = name.toLowerCase();

            boolean hasRepeat = false;

            for (String newName: people) {

                if (name.equals(newName)) {

                    hasRepeat = true;

                }

            }

            if (!hasRepeat) {

                count++;
                people.add(name);

            }

        }

        return count;

    }
}
