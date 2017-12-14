package com.lqr.biliblili.mvp.ui.adapter.entity;

import com.chad.library.adapter.base.entity.MultiItemEntity;

/**
 * Created by yanbo on 2017/12/5.
 */

public class InterviewMultiItem implements MultiItemEntity {
    //标示类型
    public static final int TITLE = 1;
    public static final int BODY = 2;
    //一些特性
    private int itemType;

    //TITLE
    private String titleIconSrc;//标题图片
    private String titleContent;//标题内容

    //内容
    private String bodyIconSrc;
    private String bodyContent;

    public String getTitleIconSrc() {
        return titleIconSrc;
    }

    public void setTitleIconSrc(String titleIconSrc) {
        this.titleIconSrc = titleIconSrc;
    }

    public String getTitleContent() {
        return titleContent;
    }

    public void setTitleContent(String titleContent) {
        this.titleContent = titleContent;
    }

    public String getBodyIconSrc() {
        return bodyIconSrc;
    }

    public void setBodyIconSrc(String bodyIconSrc) {
        this.bodyIconSrc = bodyIconSrc;
    }

    public String getBodyContent() {
        return bodyContent;
    }

    public void setBodyContent(String bodyContent) {
        this.bodyContent = bodyContent;
    }

    @Override
    public int getItemType() {
        return itemType;
    }

    //设置当前itemtype
    public void setItemType(int itemType){
        this.itemType = itemType;
    }
}
