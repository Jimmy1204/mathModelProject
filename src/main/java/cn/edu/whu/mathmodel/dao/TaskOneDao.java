package cn.edu.whu.mathmodel.dao;

import cn.edu.whu.mathmodel.pojo.TaskOne;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author Jimmy
 * @version 2019/1/9
 */
@Repository
public interface TaskOneDao {
    /**
     * 获取任务一所需数据
     *
     * @return 数据
     */
    List<TaskOne> getData();

    /**
     * 获取死亡人数
     * @return 死亡人数
     */
    List<Map<String,Object>> getNKill();

    /**
     * 获取杀伤性武器类型
     * @return 杀伤性武器类型
     */
    List<Map<String,Object>> getWeaponType();

    /**
     * 获取目标类型
     * @return 目标类型
     */
    List<Map<String,Object>> getTargType();

    /**
     * 获取受伤人数
     * @return 受伤人数
     */
    List<Map<String,Object>> getNWound();

    /**
     * 获取财产损失
     * @return 财产损失
     */
    List<Map<String,Object>> getPropExtent();

    /**
     * 插入级别
     * @param eventID 事件ID
     * @param level 级别
     * @return 影响条数
     */
    int addLevel(@Param("eventID") String eventID, @Param("level")int level);

    /**
     * 获取级别
     * @return 级别
     */
    List<Map<String,Object>> getLevel();
}
