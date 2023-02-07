package Ariketak5Collections.Ariketa3;

public class Movie {
    private String title;
    private double minutes;
    private int year;
    public Movie(String titulo, double minutes, int year){
        this.minutes =minutes;
        this.title = titulo;
        this.year = year;
    }
    @Override
    public String toString(){
        return title + minutes + year + "";
    }
    public boolean isEqual(Movie m){
        if(this.title == m.title && this.year == m.year && this.minutes - m.minutes <= 5){
            return true;
        }
        return false;
    }
    public String getTitle() {
        return title;
    }

    public double getMinutes() {
        return minutes;
    }

    public int getYear() {
        return year;
    }
    public void setTitle(String titulo) {
        this.title = titulo;
    }

    public void setMinutes(double minutes) {
        this.minutes = minutes;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
