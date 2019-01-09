package cn.edu.whu.mathmodel.service;


import cn.edu.whu.mathmodel.pojo.TaskTwo;

import java.util.List;

/**
 * @author Jimmy
 * @version 2019/1/9
 * 任务二服务接口
 */

public interface TaskTwoService {
    /**
     * 获取任务二所需数据
     * @return 数据
     */
    List<TaskTwo> getData();
}
