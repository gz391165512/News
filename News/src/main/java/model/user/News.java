package model.user;

/**
 * Created with IntelliJ IDEA.
 * User: 孙燕冰
 * Date: 13-10-31
 * Time: 下午11:19
 * To change this template use File | Settings | File Templates.
 */

public class News{
    private int newsId  ;
    private String newsTitle;
    private String newsContent;
    private String newsCoverPath;
    private int newsNewsCategoryId;
    private int newsAuditStatus;
    private String newsCreatTime;

    public int getNewsAuditStatus() {
        return newsAuditStatus;
    }

    public void setNewsAuditStatus(int newsAuditStatus) {
        this.newsAuditStatus = newsAuditStatus;
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }

    public String getNewsCoverPath() {
        return newsCoverPath;
    }

    public void setNewsCoverPath(String newsCoverPath) {
        this.newsCoverPath = newsCoverPath;
    }

    public String getNewsCreatTime() {
        return newsCreatTime;
    }

    public void setNewsCreatTime(String newsCreatTime) {
        this.newsCreatTime = newsCreatTime;
    }

    public int getNewsId() {
        return newsId;
    }

    public void setNewsId(int newsId) {
        this.newsId = newsId;
    }

    public int getNewsNewsCategoryId() {
        return newsNewsCategoryId;
    }

    public void setNewsNewsCategoryId(int newsNewsCategoryId) {
        this.newsNewsCategoryId = newsNewsCategoryId;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }
}


