package vectors;

public class Vector2d extends AbstractVector2d {

    private double x;
    private double y;

    public Vector2d(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public double sumVector2d() {
        return this.getX() + ;
    }

    @Override
    public double subVector2d() {
        return 0;
    }

    @Override
    public double multiplyVector2d() {
        return 0;
    }

    @Override
    public double scalarVector2d() {
        return 0;
    }
}
