package com.model.news;

/**
 * Created with IntelliJ IDEA.
 * User: 孙燕冰
 * Date: 13-10-31
 * Time: 下午11:19
 * To change this template use File | Settings | File Templates.
 */

public class NewsComment{
    private int newsCommentId;
    private String newsCommentName;
    private String newsCommentContent;
    private int newsCommentNewsId;
    private String newsCommentCreatTime;

    public String getNewsCommentContent() {
        return newsCommentContent;
    }

    public void setNewsCommentContent(String newsCommentContent) {
        this.newsCommentContent = newsCommentContent;
    }

    public String getNewsCommentCreatTime() {
        return newsCommentCreatTime;
    }

    public void setNewsCommentCreatTime(String newsCommentCreatTime) {
        this.newsCommentCreatTime = newsCommentCreatTime;
    }

    public int getNewsCommentId() {
        return newsCommentId;
    }

    public void setNewsCommentId(int newsCommentId) {
        this.newsCommentId = newsCommentId;
    }

    public String getNewsCommentName() {
        return newsCommentName;
    }

    public void setNewsCommentName(String newsCommentName) {
        this.newsCommentName = newsCommentName;
    }

    public int getNewsCommentNewsId() {
        return newsCommentNewsId;
    }

    public void setNewsCommentNewsId(int newsCommentNewsId) {
        this.newsCommentNewsId = newsCommentNewsId;
    }
}


