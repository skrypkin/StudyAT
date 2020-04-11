package vectors;

public class Vector3d extends AbstractVector3d{

    private double x;
    private double y;
    private double z;

    public Vector3d(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    @Override
    public double sumVector3d() {
        return 0;
    }

    @Override
    public double subVector3d() {
        return 0;
    }

    @Override
    public double multiplyVector3d() {
        return 0;
    }

    @Override
    public double scalarVector3d() {
        return 0;
    }
}

