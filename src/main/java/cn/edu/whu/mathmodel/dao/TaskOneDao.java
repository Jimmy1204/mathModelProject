package cn.edu.whu.mathmodel.dao;

import cn.edu.whu.mathmodel.pojo.TaskOne;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Jimmy
 * @version 2019/1/9
 */
@Repository
public interface TaskOneDao {
    /**
     * 获取任务一所需数据
     * @return 数据
     */
    List<TaskOne> getData();
}
