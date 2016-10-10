package ee.ut.cs.grading.hash_table.plotter;

import java.util.List;

public interface Plot {

	/**
	 * Sets the title of the plot.
	 *
	 * @param title of the plot.
	 */
	void setPlotTitle(String title);


	/**
	 * Adds description for X-axis.
	 *
	 * @param desc of x-axis.
	 */
	void setXAxisDescription(String desc);

	/**
	 * Adds description for Y-axis.
	 *
	 * @param desc for y-axis.
	 */

	void setYAxisDescription(String desc);


	/**
	 * Adds the specified line to the graph.
	 *
	 * @param name of the line
	 * @param xCoordinates of all the points that line will be drawn through
	 * @param yCoordinates of all the points that line will be drawn through
	 */
	void addLine(String name, double[] xCoordinates, double[] yCoordinates);

	/**
	 * Adds the specified line to the graph.
	 *
	 * @param name of the line
	 * @param points that make up the line
	 */
	void addLine(String name, List<Point> points);


	/**
	 *
	 * Draws the plot.
	 *
	 */
	void plot();
}
