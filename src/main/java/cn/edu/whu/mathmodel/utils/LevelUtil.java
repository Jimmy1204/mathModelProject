package cn.edu.whu.mathmodel.utils;

import cn.edu.whu.mathmodel.pojo.TaskOne;

/**
 * @author Jimmy
 * @version 2019/1/10
 * 分级工具类
 */

public class LevelUtil {
    /**
     * 死亡分级标准
     */
    private static final int KILL1 = 2;
    private static final int KILL2 = 20;
    private static final int KILL3 = 200;
    /**
     * 受伤分级标准
     */
    private static final int WOUND1 = 3;
    private static final int WOUND2 = 30;
    private static final int WOUND3 = 300;

    /**
     * 获取分级
     *
     * @param data 数据
     * @return 分级
     */
    public static int getLevel(TaskOne data) {
        int kill = "".equals(data.getnKill()) ? 0 : Integer.parseInt(data.getnKill());
        double wound = "".equals(data.getnWound()) ? 0.0 : Double.parseDouble(data.getnWound());
        String prop = data.getPropExtent();
        String tar = data.getTargType();
        String wea = data.getWeaponType();
        boolean flag5 = "1".equals(wea) || "4".equals(wea) || "2".equals(wea) || "3".equals(wea) ||
                "6".equals(tar) || "1".equals(prop) || kill > KILL3 || wound > WOUND3;
        boolean flag4 = "7".equals(tar) || "2".equals(prop) || kill <= KILL3 && kill > KILL2 || wound <= WOUND3 && wound > WOUND2;
        boolean flag3 = "2".equals(tar) || "3".equals(tar) || "4".equals(tar) || "3".equals(prop) || kill <= KILL2 && kill > KILL1 || wound <= WOUND2 && wound > WOUND1;
        boolean flag2 = "4".equals(prop) || kill <= KILL1 && kill > 0 || wound <= WOUND1 && wound > 0;

        if (flag5) {
            return 5;
        } else if (flag4) {
            return 4;
        } else if (flag3) {
            return 3;
        } else if (flag2) {
            return 2;
        } else {
            return 1;
        }
    }

}
