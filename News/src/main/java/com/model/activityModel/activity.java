package com.model.activityModel;

/**
 * Created with IntelliJ IDEA.
 * User: 周方
 * Date: 13-10-31
 * Time: 下午9:14
 * To change this template use File | Settings | File Templates.
 */
class activity {
    private int avyId;
    private String avyTitle;
    private int avyContent;
    private String avyCoverPath;
    private String avyAuditStatus;
    private String avyCreateTime;

    int getAvyId() {
        return avyId;
    }

    void setAvyId(int avyId) {
        this.avyId = avyId;
    }

    String getAvyTitle() {
        return avyTitle;
    }

    void setAvyTitle(String avyTitle) {
        this.avyTitle = avyTitle;
    }

    int getAvyContent() {
        return avyContent;
    }

    void setAvyContent(int avyContent) {
        this.avyContent = avyContent;
    }

    String getAvyCoverPath() {
        return avyCoverPath;
    }

    void setAvyCoverPath(String avyCoverPath) {
        this.avyCoverPath = avyCoverPath;
    }

    String getAvyAuditStatus() {
        return avyAuditStatus;
    }

    void setAvyAuditStatus(String avyAuditStatus) {
        this.avyAuditStatus = avyAuditStatus;
    }

    String getAvyCreateTime() {
        return avyCreateTime;
    }

    void setAvyCreateTime(String avyCreateTime) {
        this.avyCreateTime = avyCreateTime;
    }
}
