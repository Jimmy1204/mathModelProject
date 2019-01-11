package cn.edu.whu.mathmodel.constant.kmean;

/**
 * @author Jimmy
 * @version 2019/1/11
 */

public class Wine {
    double[] data;
    int id;
    Wine center=null;

    Wine(double[] d,int i){
        data=d;
        id=i;
    }

    public void setCenter(Wine wine){
        center=wine;
    }
}
