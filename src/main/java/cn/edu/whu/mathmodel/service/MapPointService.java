package cn.edu.whu.mathmodel.service;

import cn.edu.whu.mathmodel.pojo.MapPoint;

import java.util.List;

/**
 * @author Jimmy
 * @version 2019/1/9
 * 地图点位服务接口
 */

public interface MapPointService {
    /**
     * 获取地图点
     * @return 地图点列表
     */
    List<MapPoint> getMapPoints();
}
