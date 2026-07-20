import java.util.ArrayList;
import java.util.Scanner;

class Video {
    private String name;
    private boolean checkedOut;
    private int rating;

    public Video(String name) {
        this.name = name;
        this.checkedOut = false;
        this.rating = 0;
    }

    public String getName() {
        return name;
    }

    public void checkOut() {
        if (!checkedOut) {
            checkedOut = true;
            System.out.println("Video checked out");
        } else {
            System.out.println("Already checked out");
        }
    }

    public void returnVideo() {
        if (checkedOut) {
            checkedOut = false;
            System.out.println("Video returned");
        } else {
            System.out.println("Video was not checked out");
        }
    }

    public void receiveRating(int rating) {
        this.rating = rating;
        System.out.println("Rating updated");
    }

    public String getDetails() {
        return name + " | Checked Out: " + checkedOut + " | Rating: " + rating;
    }
}

class VideoStore {
    private ArrayList<Video> videos = new ArrayList<>();

    public void addVideo(String name) {
        videos.add(new Video(name));
        System.out.println("Video added");
    }

    public Video findVideo(String name) {
        for (Video v : videos) {
            if (v.getName().equalsIgnoreCase(name)) {
                return v;
            }
        }
        return null;
    }

    public void checkOut(String name) {
        Video v = findVideo(name);
        if (v != null) v.checkOut();
        else System.out.println("Video not found");
    }

    public void returnVideo(String name) {
        Video v = findVideo(name);
        if (v != null) v.returnVideo();
        else System.out.println("Video not found");
    }

    public void receiveRating(String name, int rating) {
        Video v = findVideo(name);
        if (v != null) v.receiveRating(rating);
        else System.out.println("Video not found");
    }

    public void listInventory() {
        for (Video v : videos) {
            System.out.println(v.getDetails());
        }
    }
}

public class VideoStoreApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VideoStore store = new VideoStore();

        while (true) {
            System.out.println("\n1. Add Video");
            System.out.println("2. Check Out");
            System.out.println("3. Return Video");
            System.out.println("4. Rate Video");
            System.out.println("5. List Inventory");
            System.out.println("6. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter video name: ");
                    store.addVideo(sc.nextLine());
                    break;
                case 2:
                    System.out.print("Enter video name: ");
                    store.checkOut(sc.nextLine());
                    break;
                case 3:
                    System.out.print("Enter video name: ");
                    store.returnVideo(sc.nextLine());
                    break;
                case 4:
                    System.out.print("Enter video name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter rating: ");
                    int rating = sc.nextInt();
                    store.receiveRating(name, rating);
                    break;
                case 5:
                    store.listInventory();
                    break;
                case 6:
                    System.exit(0);
            }
        }
    }
}
