package day05;

public class Movie {
    private String title;
    private int productionYear;
    private double averageRating;
    private int ratingNumber = 0;
    private int totalRatings = 0;

    public Movie(String title, int productionYear) {
        this.title = title;
        this.productionYear = productionYear;
    }

    public double rateMovie(int rating) {
        ratingNumber++;
        totalRatings += rating;
        averageRating = (double) totalRatings / ratingNumber;
        return averageRating;
    }
}
