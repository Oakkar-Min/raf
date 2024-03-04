import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Scanner;

 class Movie {
    int MovieId;
    String Title;
    ArrayList<String> Actors = new ArrayList<>();
    int ActorSize;
    float Budget;
    String[] Genes= {"Action","Comedy","Drama","Animation","Thriller"};
    String genre;

    public Movie() {
        this(0, null, (float) 0.0);
    }

    public Movie(int id, String title, float budget) {
        this.MovieId = id;
        this.Title = title;
        this.Budget = (float) budget;
    }

    public Movie(int id,String title,ArrayList<String> actors,int actor_size,float budget, String genre){
        this.MovieId=id;
        this.Title=title;
        this.Actors= actors;
        this.ActorSize= actor_size;
        this.Budget= (float)budget;
        this.genre= genre;
    }

    public int addActor(String name) {
        Actors.add(name);
        ActorSize++;
        return ActorSize;
    }

    public void writeMovieToFile() throws IOException, FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        String filename = "movie.dat";
        RandomAccessFile raf = new RandomAccessFile(filename, "rw");

        raf.writeInt(MovieId);

        byte[] movie_title = new byte[30];
        movie_title = Title.concat(" ".repeat(30)).getBytes();
        raf.write(movie_title, 0, 30);

        for (String each : Actors) {
            byte[] movie_actor = new byte[50]; // actor's name cannot be more than 50 characters
            movie_actor = each.concat(" ".repeat(50)).getBytes();
            raf.write(movie_actor, 0, 50);
        }

        raf.writeInt(ActorSize);
        raf.writeFloat(Budget);

        byte[] movie_genre = new byte[9];
        movie_genre = genre.concat(" ".repeat(9)).getBytes();
        raf.write(movie_genre);

        raf.close();
        sc.close();
    }

    public void readMovieFromFile() throws IOException, FileNotFoundException {
       
        RandomAccessFile raf= new RandomAccessFile("movie.dat", "rw");

        System.out.println(raf.readInt());

        byte[] movietitle= new byte[30];
        raf.read(movietitle,0,30);
        String movie_t= new String(movietitle).trim();
        System.out.println(movie_t);

        for (int i = 0; i < ActorSize  ; i++) {
            byte[] actor = new byte[50];
            raf.read(actor,0,50);
            String actors= new String(actor).trim();
            System.out.println(actors);
        }

        // raf.seek(raf.getFilePointer()+4);

        System.out.println(raf.readInt());
        System.out.println(raf.readFloat());

        byte[] moviegenre = new byte[9];
        raf.read(moviegenre,0,9);
        String movie_g= new String (moviegenre).trim();
        System.out.println(movie_g);

        
    }

}

public class RandomAccFile {
    public static void main(String[] args) throws IOException, FileNotFoundException{
        ArrayList<String> actors = new ArrayList<>();
        actors.add("HanWinAung");
        actors.add("Badee");
        Movie m_1= new Movie(77, "Musakuuduuu", actors, 2, (float)89.22, "Comedy");
        m_1.writeMovieToFile();
        m_1.readMovieFromFile();
    }

    
}
