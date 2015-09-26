package Practice1;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Created by Tatsuki on 2015/09/09.
 */
public class Practice2 {
    private static int[] ints = new int[7];
    private static double[] doubles = new double[7];
    public static void main(String[] args) {
//        System.out.printf("%d"+System.getProperty(""),(1<<30+1<<30));
        System.out.printf("%d", (1 << 30));
        System.out.println(ints);
        System.out.println(new ArrayList<>());
        System.out.println(doubles);
        ArrayList<P> list = new ArrayList<>(Arrays.asList(new P(),new P(),new P(),new P(),new P(),new P()));
        System.out.println(list);
        JComponent jComponent = new JTextArea();
        BorderLayout a;
        Container b;
    }
    private static class P {
        int a;
    }
}
