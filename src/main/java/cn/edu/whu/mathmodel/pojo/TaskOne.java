package cn.edu.whu.mathmodel.pojo;

/**
 * @author Jimmy
 * @version 2019/1/9
 * 任务一POJO
 */

public class TaskOne {
    private String eventID;
    private String weaponType;
    private String targType;
    private String nKill;
    private String nWound;
    private String propExtent;

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    private String level;

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    public String getTargType() {
        return targType;
    }

    public void setTargType(String targType) {
        this.targType = targType;
    }

    public String getnKill() {
        return nKill;
    }

    public void setnKill(String nKill) {
        this.nKill = nKill;
    }

    public String getnWound() {
        return nWound;
    }

    public void setnWound(String nWound) {
        this.nWound = nWound;
    }

    public String getPropExtent() {
        return propExtent;
    }

    public void setPropExtent(String propExtent) {
        this.propExtent = propExtent;
    }

    public String getEventID() {
        return eventID;
    }

    public void setEventID(String eventID) {
        this.eventID = eventID;
    }
}
