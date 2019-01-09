package cn.edu.whu.mathmodel.dao;

import cn.edu.whu.mathmodel.pojo.TaskTwo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Jimmy
 * @version 2019/1/9
 */
@Repository
public interface TaskTwoDao {
    /**
     * 获取任务二所需数据
     * @return 数据
     */
    List<TaskTwo> getData();
}
