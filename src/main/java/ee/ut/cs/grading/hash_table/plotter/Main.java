package ee.ut.cs.grading.hash_table.plotter;

import java.util.Arrays;

public class Main {

    public static void main (String[] args){
        Plot tp = new PlotImplementation();
        tp.setPlotTitle("Testing this plot");
        tp.setXAxisDescription("Some random things");
        tp.setYAxisDescription("More things");
        tp.addLine("Test",Arrays.asList(new Point(1, 1), new Point(2, 4), new Point(3, 9), new Point(4, 16)));
        tp.addLine("This",new double[]{16,9,4,1}, new double[]{4,3,2,1});
        tp.plot();

    }
}
