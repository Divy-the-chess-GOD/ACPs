import java.util.Random;
import java.util.Scanner;

public class MovieRatingAI {

    public static void main(String[] args) {

        // List of 20 movies
        String[] movies = {
            "Inception",
            "Interstellar",
            "Avengers Endgame",
            "The Dark Knight",
            "Titanic",
            "Avatar",
            "Joker",
            "The Matrix",
            "Gladiator",
            "Jurassic Park",
            "Spider-Man No Way Home",
            "Harry Potter",
            "Doctor Strange",
            "Black Panther",
            "Kung Fu Panda",
            "Frozen",
            "The Lion King",
            "John Wick",
            "Transformers",
            "Mission Impossible"
        };

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        // Pick a random movie
        int movieIndex = random.nextInt(movies.length);
        String selectedMovie = movies[movieIndex];

        // Display movie
        System.out.println("🎬 Your Random Movie is: " + selectedMovie);

        // Ask user for rating
        System.out.print("Enter your rating for the movie: ");
        int rating = sc.nextInt();

        // AI Rating System
        System.out.println("\n🤖 AI Movie Review System");

        if (rating > 75000) {
            System.out.println("OUT OF THE WORLD 🌟🚀");
        }
        else if (rating > 45000 && rating < 70000) {
            System.out.println("BEST 🔥");
        }
        else if (rating > 25000) {
            System.out.println("BETTER 👍");
        }
        else if (rating > 5000) {
            System.out.println("GOOD 🙂");
        }
        else {
            System.out.println("Needs Improvement 😅");
        }

        sc.close();
    }
}
