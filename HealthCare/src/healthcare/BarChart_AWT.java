package healthcare;
import java.util.Random;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

public class BarChart_AWT extends ApplicationFrame {
public static int array1[]=new int[1024];
public static int array2[]=new int[1024];
public static int array3[]=new int[1024];
    public BarChart_AWT(String applicationTitle, String chartTitle) {
        super(applicationTitle);
        JFreeChart barChart = ChartFactory.createBarChart(
                chartTitle,
                "Category",
                "Percentage(%)",
                createDataset(),
                PlotOrientation.VERTICAL,
                true, true, false);

        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new java.awt.Dimension(560, 367));
        setContentPane(chartPanel);
    }

    private CategoryDataset createDataset() {
        final String Acc = "Accuracy";
        final String recall = "Re-Call";
        final String fmeasure = "F-Measure ";
        final String recision = "Precision";
        final String Nb = "NB";
        final String knn = "KNN";
        final String Dt = "DT";
        
           Random rr = new Random();
        int d=0;
        for(int i=0;i<=5;i++)
        {
        int dd=rr.nextInt((20-8)+1)+8;
        int mm=rr.nextInt((10-1)+1)+1;
         int cc=rr.nextInt((25-1)+1)+1;
          
        array1[d]=dd;
        array2[d]=mm;
        array3[d]=cc;
        
        d++;
        }

        final DefaultCategoryDataset dataset =
                new DefaultCategoryDataset();

        dataset.addValue(array1[0], Acc, Nb);
        dataset.addValue(array2[1], Acc, knn);
        dataset.addValue(array3[2], Acc, Dt);


        dataset.addValue(array3[2], recall, Nb);
        dataset.addValue(2.0, recall, knn);
        dataset.addValue(array1[0], recall, Dt);


        dataset.addValue(4.0, fmeasure, Nb);
        dataset.addValue(array2[1], fmeasure, knn);
        dataset.addValue(3.0, fmeasure, Dt);

        dataset.addValue(4.0, recision, Nb);
        dataset.addValue(2.0, recision, knn);
        dataset.addValue(3.0, recision, Dt);


        return dataset;
    }

    public static void main(String[] args) {
        BarChart_AWT chart = new BarChart_AWT("Comparition results",
                "Classification Comparition Results ");
        chart.pack();
        RefineryUtilities.centerFrameOnScreen(chart);
        chart.setVisible(true);
    }
}