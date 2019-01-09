package cn.edu.whu.mathmodel.service;

import cn.edu.whu.mathmodel.pojo.TaskOne;

import java.util.List;

/**
 * @author Jimmy
 * @version 2019/1/9
 * 任务一服务接口
 */

public interface TaskOneService {
    /**
     * 获取任务一所需数据
     * @return 数据
     */
    List<TaskOne> getData();
}
