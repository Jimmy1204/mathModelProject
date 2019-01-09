package cn.edu.whu.mathmodel.controller;

import cn.edu.whu.mathmodel.pojo.TaskTwo;
import cn.edu.whu.mathmodel.service.TaskTwoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Jimmy
 * @version 2019/1/9
 * 任务二控制器
 */
@RestController
@RequestMapping("/task2")
public class TaskTwoController {

    @Autowired
    private TaskTwoService taskTwoService;

    @RequestMapping("/getData")
    public Map<String,Object> getData(){
        Map<String,Object> map = new HashMap<>(2);
        List<TaskTwo> list = taskTwoService.getData();
        map.put("data",list);
        map.put("count",list.size());
        return map;
    }

}
