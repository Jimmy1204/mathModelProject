package cn.edu.whu.mathmodel.controller;

import cn.edu.whu.mathmodel.pojo.MapPoint;
import cn.edu.whu.mathmodel.service.MapPointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Jimmy
 * @version 2019/1/9
 * 地图点位控制器
 */
@RestController
@RequestMapping("/map")
public class MapPointController {

    @Autowired
    private MapPointService mapPointService;

    @RequestMapping("/getMapPoints")
    public Map<String, Object> getMapPoints() {
        Map<String, Object> map = new HashMap<>(2);
        List<MapPoint> list = mapPointService.getMapPoints();
        map.put("points", list);
        map.put("count", list.size());
        return map;
    }

}
