package com.model.news;

/**
 * Created with IntelliJ IDEA.
 * User:  孙燕冰
 * Date: 13-10-31
 * Time: 下午11:19
 * To change this template use File | Settings | File Templates.
 */

public class NewsCategory{
    private int newsCategoryCateId;
    private String newsCategoryName;
    private String newsCategoryOrderIndex;

    public int getNewsCategoryCateId() {
        return newsCategoryCateId;
    }

    public void setNewsCategoryCateId(int newsCategoryCateId) {
        this.newsCategoryCateId = newsCategoryCateId;
    }

    public String getNewsCategoryName() {
        return newsCategoryName;
    }

    public void setNewsCategoryName(String newsCategoryName) {
        this.newsCategoryName = newsCategoryName;
    }

    public String getNewsCategoryOrderIndex() {
        return newsCategoryOrderIndex;
    }

    public void setNewsCategoryOrderIndex(String newsCategoryOrderIndex) {
        this.newsCategoryOrderIndex = newsCategoryOrderIndex;
    }

}


