package cn.edu.whu.mathmodel.constant.kmean;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author Jimmy
 * @version 2019/1/10
 */

public class Kmean {
    int k;
    LinkedList<Wine> all = new LinkedList();
    LinkedList<Wine> center = new LinkedList<>();
    HashMap<Integer, LinkedList<Wine>> result = new HashMap<>();
    boolean stop = false;

    public Kmean(int _k) {
        this.k = _k;
    }

    public void randomCenter() {
        int index = 0;
        Iterator it = all.iterator();
        while (index < k && it.hasNext()) {
            Wine w = (Wine) it.next();
            if (Math.random() > 0.5) {
                center.add(w);
                result.put(w.id, new LinkedList<>());
                index++;
            }
        }
    }


    public void addData(File file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        String s;
        int index = 1;
        while ((s = br.readLine()) != null) {
            String[] c = s.split(",");
            double[] d = new double[13];
            for (int i = 0; i < c.length; i++) {
                if (i != 0) {
                    d[i - 1] = Double.parseDouble(c[i]);
                }
            }
            Wine wine = new Wine(d, index);
            all.add(wine);
            index++;
        }

    }

    public void print() {
        Iterator<Wine> it = center.iterator();
        Wine w;
        Wine w1;
        while (it.hasNext()) {
            w = it.next();
            System.out.print("第" + w.id + "类:");
            Iterator<Wine> its = result.get(w.id).iterator();
            while (its.hasNext()) {
                w1 = its.next();
                System.out.print(w1.id + ",");
            }
            System.out.println();

        }

    }

    public void classifier() {
        Iterator<Wine> it = center.iterator();

        Wine w1;
        while (it.hasNext()) {
            Iterator<Wine> its = all.iterator();
            int centerId = it.next().id;
            while (its.hasNext()) {
                w1 = its.next();
                int allId = w1.center.id;
                if (centerId == allId) {
                    result.get(centerId).add(w1);
                }
            }
        }
    }

    public void cal() {
        Iterator<Wine> it = center.iterator();
        int sum = 0;

        while (it.hasNext()) {
            int index = 0;
            Wine w1 = it.next();
            double[] d = calAvg(result.get(w1.id), result.get(w1.id).size());

            for (int a = 0; a < 13; a++) {
                if (w1.data[a] == d[a]) {
                    index++;
                } else {
                    w1.data[a] = d[a];
                }
            }

            if (index == 13) {
                sum++;
            }
        }

        if (sum == k) {
            stop = true;
        }
    }

    private double[] calAvg(LinkedList<Wine> wines, int a) {
        DecimalFormat df = new DecimalFormat("###0.00");
        Iterator<Wine> it = wines.iterator();
        double[] sum = new double[13];
        while (it.hasNext()) {
            Wine w = it.next();
            for (int i = 0; i < w.data.length; i++) {
                sum[i] += w.data[i];
            }
        }

        double[] avg = new double[13];
        for (int i = 0; i < 13; i++) {
            avg[i] = Double.parseDouble(df.format(((sum[i]) / a)));
        }

        return avg;
    }

    public void calCenter() {

        Iterator<Wine> its = all.iterator();
        Wine ce = null;
        Wine wi;
        double min = 0.0;
        int index = 0;

        while (its.hasNext()) {
            wi = its.next();

            Iterator<Wine> it = center.iterator();
            while (it.hasNext()) {
                double distance = 0.0;
                Wine wine1 = it.next();

                for (int i = 0; i < 13; i++) {
                    double temp = (wi.data[i] - wine1.data[i]) * (wi.data[i] - wine1.data[i]);
                    distance += temp;
                }

                double result = Math.sqrt(distance);

                if (index == 0) {
                    min = result;
                    ce = wine1;
                } else if (result < min) {
                    min = result;
                    ce = wine1;
                }
                index++;
            }
            wi.setCenter(ce);
            index = 0;
        }


    }
}
