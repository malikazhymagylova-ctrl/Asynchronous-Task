import java.time.Year;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<ContentItem> items = new ArrayList<>();

        items.add(new VideoLecture("Java OOP", 2024, 90, "HD"));
        items.add(new VideoLecture("Data Structures", 2022, 120, "4K"));
        items.add(new PodcastEpisode("Tech Talk", 2023, 45, "Alice"));
        items.add(new PodcastEpisode("History Hour", 2020, 60, "Bob"));

        int currentYear = Year.now().getValue();

        for (ContentItem item : items) {
            System.out.println(item +
                    " | licenseCost=" + item.getLicenseCost(currentYear));

            if (item instanceof Downloadable d) {
                d.download();
                System.out.println("Max downloads/day: " +
                        d.getMaxDownloadsPerDay());
            }

            System.out.println();
        }
    }
}