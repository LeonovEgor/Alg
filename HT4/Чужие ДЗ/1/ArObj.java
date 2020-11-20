package hw4;

class ArObj {
    private int x, y;

    public ArObj(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void print() {
        System.out.println("X: " + x + "; Y: " + y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

