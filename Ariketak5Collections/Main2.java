package Ariketak5Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main2 {
    private ArrayList<Point> points;
    public Main2(){
        points = new ArrayList<>();
    }
    public Main2(ArrayList<Point> points){
        this.points = points;
    }
    public void mostrar(){
        for (Point point : points){
            System.out.println(point.toString());
        }
    }
    public List<Point> reverse(){
        List<Point> l = new ArrayList<>();
        for (int i = this.points.size()-1;i>=0;i--){
            l.add(this.points.get(i));
        }
        return l;
    }
    public Point firstPointSecondQuadrant(){
        Iterator<Point> it = this.points.iterator();
        boolean aurkitu = false;
        Point aurkituPoint = null;
        while (it.hasNext() && !aurkitu){
            Point p = it.next();
            if (p.getX() <= 0 && p.getY() >= 0){
                aurkitu=true;
                aurkituPoint = p;
            }
        }
        if (!aurkitu){
            System.out.println("Ez dago punturik 2. kuadrantean");
        }
        return aurkituPoint;
    }
    public int zeroZeroPointIndexOf(){
        Point point = new Point(0,0);
        boolean aurkitu = false;
        int i = 0;
        while(i < this.points.size() && !aurkitu){
            if (this.points.get(i).compareTo(point) == 0){
                aurkitu = true;
            }
            i++;
        }
        if (aurkitu){
            return i;
        }
        else {
            System.out.println("Ez dago (0,0) puntua.");
            return -1;
        }
    }
    public void oneOnePointExist(){
        if (this.points.indexOf(new Point(1,1)) < 0 ){

        }
    }
}