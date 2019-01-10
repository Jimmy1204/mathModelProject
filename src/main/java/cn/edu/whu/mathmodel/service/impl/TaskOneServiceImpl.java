package cn.edu.whu.mathmodel.service.impl;

import cn.edu.whu.mathmodel.dao.TaskOneDao;
import cn.edu.whu.mathmodel.pojo.TaskOne;
import cn.edu.whu.mathmodel.service.TaskOneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

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

    @Override
    public List<Map<String, Object>> getNKill() {
        return taskOneDao.getNKill();
    }

    @Override
    public List<Map<String, Object>> getWeaponType() {
        return taskOneDao.getWeaponType();
    }

    @Override
    public List<Map<String, Object>> getTargType() {
        return taskOneDao.getTargType();
    }

    @Override
    public List<Map<String, Object>> getNWound() {
        return taskOneDao.getNWound();
    }

    @Override
    public List<Map<String, Object>> getPropExtent() {
        return taskOneDao.getPropExtent();
    }

    @Override
    public int addLevel(String eventID, int level) {
        return taskOneDao.addLevel(eventID,level);
    }

    @Override
    public List<Map<String, Object>> getLevel() {
        return taskOneDao.getLevel();
    }


}
