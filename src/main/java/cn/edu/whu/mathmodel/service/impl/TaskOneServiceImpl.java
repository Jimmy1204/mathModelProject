package cn.edu.whu.mathmodel.service.impl;

import cn.edu.whu.mathmodel.dao.TaskOneDao;
import cn.edu.whu.mathmodel.pojo.TaskOne;
import cn.edu.whu.mathmodel.service.TaskOneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Jimmy
 * @version 2019/1/9
 * 任务一服务实现
 */
@Service
public class TaskOneServiceImpl implements TaskOneService {

    @Autowired
    private TaskOneDao taskOneDao;

    @Override
    public List<TaskOne> getData() {
        return taskOneDao.getData();
    }
}
