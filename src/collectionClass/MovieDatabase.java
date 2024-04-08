package collectionClass;

import java.util.Hashtable;

class Movie {
    String name;
    int year;
    String description;

    Movie(String name, int year, String description) {
        this.name = name;
        this.year = year;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Movie: " + name + ", Year: " + year + ", Description: " + description;
    }
}

public class MovieDatabase {
    public static void main(String[] args) {

        Hashtable<String, Movie> movies = new Hashtable<>();

        // Adding movie details to the Hashtable
        movies.put("The Shawshank Redemption", new Movie("The Shawshank Redemption", 1994, "Two imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency."));
        movies.put("The Godfather", new Movie("The Godfather", 1972, "The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son."));
        movies.put("The Dark Knight", new Movie("The Dark Knight", 2008, "When the menace known as The Joker emerges from his mysterious past, he wreaks havoc and chaos on the people of Gotham."));

        // Printing the movie database
        System.out.println("Movie Database:");
        for (Movie movie : movies.values()) {
            System.out.println(movie);
        }

        // Retrieving a movie by name
        String movieName = "The Godfather";
        System.out.println("\nSearching for movie '" + movieName + "':");
        Movie movie = movies.get(movieName);
        if (movie != null) {
            System.out.println("Movie found: " + movie);
        } else {
            System.out.println("Movie '" + movieName + "' not found.");
        }
    }
}

