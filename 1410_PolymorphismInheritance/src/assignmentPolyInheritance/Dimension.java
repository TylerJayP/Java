package assignmentPolyInheritance;


/**
 * getting height, depth, width and creating format with toString
 * 
 * @author tyler
 *
 */
public class Dimension {

	private double height;
	private double width;
	private double depth;

	public Dimension(double height, double width, double depth) {

		this.height = height;
		this.width = width;
		this.depth = depth;

		if (height <= 0 || width <= 0 || depth <= 0) {
			throw new IllegalArgumentException("The height, width, and depth of a dimension needs to be positive.");
		}

	}

	/**
	 * Returns the height
	 * 
	 * @return the height
	 */
	public double getHeight() {

		return height;

	}

	/**
	 * Returns the width
	 * 
	 * @return the width
	 */
	public double getWidth() {

		return width;

	}

	/**
	 * Returns the depth
	 * 
	 * @return the depth
	 */
	public double getDepth() {

		return depth;

	}

	@Override
	public String toString() {

		return String.format("(%.1f x %.1f x %.1f)", height, width, depth);

	}
}
