package hw_7.geometry;

public final class Edge {
    private final int startPoint;
    private final int endPoint;
    public Edge(int startPoint, int endPoint){
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }
    public Edge(){
        this(0,0);
    }

    public int getStartPoint() {
        return startPoint;
    }

    public int getEndPoint() {
        return endPoint;
    }

}
