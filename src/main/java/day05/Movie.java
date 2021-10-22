package day05;

public class Movie {
    String title;
    int productionYear;
    double averageRating;
    int ratingNumber = 0;
    int totalRatings = 0;

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
