package algorithm.shared;

public class Pair<I> {
    private I x;
    private I y;

    public Pair(I x, I y) {
        this.x = x;
        this.y = y;
    }

    public I getX() {
        return x;
    }

    public void setX(I x) {
        this.x = x;
    }

    public I getY() {
        return y;
    }

    public void setY(I y) {
        this.y = y;
    }
}
