package com.lqr.biliblili.app.data.entity.interview;

import java.util.List;

/**
 * Created by yanbo on 2017/12/5.
 */

public class InterViewListData {
    private String mTitle;//标题
    private int mTitleId;//标题的图标
    private List<ContentDataBean> mContentDataBeanList;

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public int getTitleId() {
        return mTitleId;
    }

    public void setTitleId(int titleId) {
        mTitleId = titleId;
    }

    public List<ContentDataBean> getContentDataBeanList() {
        return mContentDataBeanList;
    }

    public void setContentDataBeanList(List<ContentDataBean> contentDataBeanList) {
        mContentDataBeanList = contentDataBeanList;
    }

    public static class ContentDataBean{
        private int mContentId;
        private String mDescribe;//描述

        public int getContentId() {
            return mContentId;
        }

        public void setContentId(int contentId) {
            mContentId = contentId;
        }

        public String getDescribe() {
            return mDescribe;
        }

        public void setDescribe(String describe) {
            mDescribe = describe;
        }
    }

}
