package Ariketak5Collections.Ariketa3;

import java.util.ArrayList;

public class Cinema {
    private String name;
    private ArrayList<Movie> movies;
    private int showroom;
    private Movie[] occupiedRooms;
    public Cinema(String name, int nRooms){
        this.name = name;
        this.showroom = nRooms;
        this.movies = new ArrayList<Movie>();
        this.occupiedRooms = new Movie[nRooms];
    }
    public int roomOfMovie(String name, double duration, int year){
        for (int i = 0; i < occupiedRooms.length; i++){
            Movie actual = occupiedRooms[i];
            if (occupiedRooms[i] != null){
                if (actual.isEqual(new Movie(name,duration,year))){
                    return i;
                }
            }
        }
        return -1;
    }
    public void addMovie(Movie movie){
        for (int i = 0; i < movies.size();i++){
            if (movies.get(i) != null){
                movies.add(i, movie);
            }
            else if(movies.get(i) != null){
                System.out.println("The showroom is full");
            }
            else if(movies.get(i).isEqual(movie)){
                System.out.println("That movie already exists");
            }
        }
    }
    public void addMovie(Movie movie, int room){
        if(movies.get(room) == null){
            movies.add(room, movie);
        }
        else{
            System.out.println("The showroom is full");
        }
        if (movies.get(room).isEqual(movie)){
            System.out.println("That movie already exists in that showroom.");
        }
    }
    public void display(){
       
    }

}
