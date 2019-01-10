package cn.edu.whu.mathmodel.service.impl;

import cn.edu.whu.mathmodel.dao.TaskOneDao;
import cn.edu.whu.mathmodel.pojo.TaskOne;
import cn.edu.whu.mathmodel.service.TaskOneService;
import cn.edu.whu.mathmodel.utils.LevelUtil;
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
    public int addLevel() {
        List<TaskOne> list = taskOneDao.getData();
        list.forEach(data -> {
                    int level = LevelUtil.getLevel(data);
                    taskOneDao.addLevel(data.getEventID(), level);
                }
        );
        return 0;
    }

    @Override
    public List<Map<String, Object>> getLevel() {
        return taskOneDao.getLevel();
    }

    @Override
    public int getLevelByID(String eventID) {
        return taskOneDao.getLevelByID(eventID);
    }


}
