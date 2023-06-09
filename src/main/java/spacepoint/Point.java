package spacepoint;

public class Point implements Cloneable{
    private final int x2;
    private final int y2;
    public Point(int x1, int y1) {
        x2 = x1;
        y2 = y1;
    }
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
    public boolean equals(int x1, int y1) {
        return (x2 == x1) && (y2 == y1);
    }
}
