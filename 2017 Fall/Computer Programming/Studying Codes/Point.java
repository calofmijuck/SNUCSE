class Point {
    private double x, y, z;

    Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    Point(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    double getX() {
        return x;
    }

    double getY(){
        return y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    double distance(Point P){
        return Math.sqrt(Math.pow(P.x - x, 2) + Math.pow(P.y - y, 2));
    }

    double distanceFromOrigin(){
        Point O = new Point(0, 0);
        return this.distance(O);
    }

    Point midPoint(Point P){
        return new Point(0.5 * (x + P.x), 0.5 * (y + P.y));
    }

    void setLocation(double x, double y){
        this.x = x;
        this.y = y;
    }

    void translate(double x, double y){
        this.x += x;
        this.y += y;
    }

    public boolean equals(Object o){
        if(o instanceof Point) {
            Point P = (Point) o;
            if (P.x == x && P.y == y) return true;
            else return false;
        } else return false;
    }



}
