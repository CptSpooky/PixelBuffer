package pixelengine.math;

public class Vec2d {

	private final double x;
	private final double y;

	public static final Vec2d GRAVITY = new Vec2d(0, 0.05);

	public Vec2d() {
		this.x = 0;
		this.y = 0;
	}

	public Vec2d(double x, double y){
		this.x = x;
		this.y = y;
	}

	public static Vec2d fromDegrees(double angle, double len) {
		double x = Math.cos(Math.toRadians(angle)) * len;
		double y = Math.sin(Math.toRadians(angle)) * len;
		return new Vec2d(x, y);
	}

	public Vec2i toI() {
		return new Vec2i((int)Math.floor(x), (int)Math.floor(y) );
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public Vec2d setX(double x) {
		return new Vec2d(x, y);
	}

	public Vec2d setY(double y) {
		return new Vec2d(x, y);
	}

	public Vec2d add(Vec2d v){
		return new Vec2d(x + v.x, y + v.y);
	}

	public Vec2d scale(double scalar){
		return new Vec2d(x * scalar, y * scalar);
	}

	public double length() {
		return Math.sqrt(x * x + y * y);
	}

	public Vec2d norm() {
		double length = length();
		if(length > 0) {
			return new Vec2d(x / length, y / length);
		}
		return new Vec2d();
	}

	@Override
	public String toString() {
		return "VectorD{" +
				"x=" + x +
				", y=" + y +
				'}';
	}
}
