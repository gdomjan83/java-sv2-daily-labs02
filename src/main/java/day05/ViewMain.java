package day05;

public class ViewMain {
    public static void main(String[] args) {
        Movie movie = new Movie("Joe Black", 1998);
        Viewer viewer = new Viewer();

        System.out.println("Adott értékelés: 5 - átlagos értékelés: " + viewer.watchMovie(movie, 5));
        System.out.println("Adott értékelés: 4 - átlagos értékelés: " + viewer.watchMovie(movie, 4));
        System.out.println("Adott értékelés: 3 - átlagos értékelés: " + viewer.watchMovie(movie, 3));
        System.out.println("Adott értékelés: 5 - átlagos értékelés: " + viewer.watchMovie(movie, 5));
        System.out.println("Adott értékelés: 2 - átlagos értékelés: " + viewer.watchMovie(movie, 2));
    }
}
