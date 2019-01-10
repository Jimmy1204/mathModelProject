package cn.edu.whu.mathmodel.controller;

import cn.edu.whu.mathmodel.pojo.TaskOne;
import cn.edu.whu.mathmodel.service.TaskOneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Jimmy
 * @version 2019/1/9
 * 任务一控制器
 */
@RestController
@RequestMapping("/task1")
public class TaskOneController {

    @Autowired
    private TaskOneService taskOneService;

    @RequestMapping("/getData")
    public Map<String,Object> getData(){
        Map<String,Object> map = new HashMap<>(2);
        List<TaskOne> list = taskOneService.getData();
        map.put("data",list);
        map.put("count",list.size());
        return map;
    }

    @RequestMapping("/getWeaponType")
    public Map<String,Object> getWeaponType(){
        Map<String,Object> map = new HashMap<>(2);
        List<Map<String,Object>> list = taskOneService.getWeaponType();
        map.put("data",list);
        map.put("count",list.size());
        return map;
    }

    @RequestMapping("/getTargType")
    public Map<String,Object> getTargType(){
        Map<String,Object> map = new HashMap<>(2);
        List<Map<String,Object>> list = taskOneService.getTargType();
        map.put("data",list);
        map.put("count",list.size());
        return map;
    }

    @RequestMapping("/getNKill")
    public Map<String,Object> getNKill(){
        Map<String,Object> map = new HashMap<>(2);
        List<Map<String,Object>> list = taskOneService.getNKill();
        map.put("data",list);
        map.put("count",list.size());
        return map;
    }

    @RequestMapping("/getNWound")
    public Map<String,Object> getNWound(){
        Map<String,Object> map = new HashMap<>(2);
        List<Map<String,Object>> list = taskOneService.getNWound();
        map.put("data",list);
        map.put("count",list.size());
        return map;
    }

    @RequestMapping("/getPropExtent")
    public Map<String,Object> getPropExtent(){
        Map<String,Object> map = new HashMap<>(2);
        List<Map<String,Object>> list = taskOneService.getPropExtent();
        map.put("data",list);
        map.put("count",list.size());
        return map;
    }

    @RequestMapping("/getLevel")
    public Map<String,Object> getLevel(){
        Map<String,Object> map = new HashMap<>(2);
        List<Map<String,Object>> list = taskOneService.getLevel();
        map.put("data",list);
        map.put("count",list.size());
        return map;
    }

    @RequestMapping("/getLevelByID")
    public Map<String,Object> getLevelByID(String eventID){
        Map<String,Object> map = new HashMap<>(2);
        int level = taskOneService.getLevelByID(eventID);
        map.put("level",level);
        return map;
    }

    @RequestMapping("/addLevel")
    public int addLevel(){
        return taskOneService.addLevel();
    }

}
