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

}
