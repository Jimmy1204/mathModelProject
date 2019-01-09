package cn.edu.whu.mathmodel.service.impl;

import cn.edu.whu.mathmodel.dao.TaskTwoDao;
import cn.edu.whu.mathmodel.pojo.TaskTwo;
import cn.edu.whu.mathmodel.service.TaskTwoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Jimmy
 * @version 2019/1/9
 * 任务二服务实现
 */
@Service
public class TaskTwoServiceImpl implements TaskTwoService {

    @Autowired
    private TaskTwoDao taskTwoDao;

    @Override
    public List<TaskTwo> getData() {
        return taskTwoDao.getData();
    }
}
