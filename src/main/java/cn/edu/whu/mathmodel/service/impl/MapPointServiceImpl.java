package cn.edu.whu.mathmodel.service.impl;

import cn.edu.whu.mathmodel.dao.MapPointDao;
import cn.edu.whu.mathmodel.pojo.MapPoint;
import cn.edu.whu.mathmodel.service.MapPointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Jimmy
 * @version 2019/1/9
 * 地图点位服务实现
 */

@Service
public class MapPointServiceImpl implements MapPointService {

    @Autowired
    private MapPointDao mapPointDao;

    @Override
    public List<MapPoint> getMapPoints() {
        return mapPointDao.getMapPoints();
    }
}
