package com.lqr.biliblili.mvp.ui.adapter.entity;

import com.chad.library.adapter.base.entity.MultiItemEntity;

/**
 * Created by yanbo on 2017/12/5.
 */

public class InterviewMultiItem implements MultiItemEntity {
    //界面类型
    public static final int TITLE = 1;
    public static final int BODY = 2;
    private int itemType;
    @Override
    public int getItemType() {
        return itemType;
    }
}
