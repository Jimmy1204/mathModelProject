package cn.edu.whu.mathmodel.dao;

import cn.edu.whu.mathmodel.pojo.MapPoint;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Jimmy
 * @version 2019/1/9
 * 地图点Dao
 */
@Repository
public interface MapPointDao {
    /**
     * 获取所有点位
     * @return 点位列表
     */
    List<MapPoint> getMapPoints();
}
