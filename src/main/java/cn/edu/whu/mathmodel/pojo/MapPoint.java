package cn.edu.whu.mathmodel.pojo;

/**
 * @author Jimmy
 * @version 2019/1/9
 * 地图显示点
 */

public class MapPoint {
    private String eventID;
    private String latitude;
    private String longitude;

    public String getEventID() {
        return eventID;
    }

    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
}
