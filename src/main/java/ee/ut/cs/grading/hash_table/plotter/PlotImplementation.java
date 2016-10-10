package ee.ut.cs.grading.hash_table.plotter;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.DefaultXYDataset;
import org.jfree.data.xy.XYDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

import java.util.List;
import java.util.stream.Collectors;

@SuppressWarnings("serial")
public class PlotImplementation extends ApplicationFrame implements Plot {

	private final DefaultXYDataset data;
	private String plotTitle;
	private String xAxisDesc;
	private String yAxisDesc;

	public PlotImplementation() {
		super("Default title");
		data = new DefaultXYDataset();
	}

	public PlotImplementation(String title ){
		super(title);
		data = new DefaultXYDataset();
	}

	@Override
	public void setPlotTitle(String title) {
		this.plotTitle = title;
	}

	@Override
	public void setXAxisDescription(String desc) {
		this.xAxisDesc = desc;
	}

	@Override
	public void setYAxisDescription(String desc) {
		this.yAxisDesc = desc;
	}

	@Override
	public void addLine(String name,double[] xCoordinates, double[] yCoordinates) {
		data.addSeries(name,new double[][]{xCoordinates,yCoordinates});
	}

	@Override
	public void addLine(String name,List<Point> points) {
		double[] xCoordinates = new double[points.size()];
		double[] yCoordinates = new double[points.size()];
		int i = 0;
		for (Point p : points){
			xCoordinates[i] = p.x;
			yCoordinates[i] = p.y;
			i++;
		}
		data.addSeries(name,new double[][]{xCoordinates,yCoordinates});
	}


	@Override
	public void plot() {
		JFreeChart lineChart = ChartFactory.createXYLineChart(
				plotTitle,
				xAxisDesc, yAxisDesc,
				data,
				PlotOrientation.VERTICAL,
				true,true,false);

		ChartPanel chartPanel = new ChartPanel(lineChart);
		chartPanel.setPreferredSize( new java.awt.Dimension(560 ,367));
		setContentPane(chartPanel);

		pack();
		RefineryUtilities.centerFrameOnScreen(this);
		setVisible(true);
	}



}
