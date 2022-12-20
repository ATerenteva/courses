package ru.courses.geometry;

class Point3 extends Point{
    int z;
    public Point3(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
    public String toString(){
        String points = "{"+x+";"+y+";"+z+"}";
        return points;
    }
}