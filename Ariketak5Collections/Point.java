package Ariketak5Collections;

import java.util.Objects;

public class Point implements Comparable<Point> {
    private int x;
    private int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString(){
        return x + y + "";
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if (this.x == o.getX() && this.y == o.getX()){
            return 0;
        }
        else if (this.x > o.getX() && this.y > getY()){
            return 1;
        }
        else {
            return -1;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o instanceof Point){
            Point p = (Point) o;
            return (this.x == p.getX() && this.y == p.getY());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
