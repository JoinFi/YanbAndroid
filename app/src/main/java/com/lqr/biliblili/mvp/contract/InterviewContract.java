package com.lqr.biliblili.mvp.contract;

import com.jess.arms.mvp.IModel;
import com.jess.arms.mvp.IView;
import com.lqr.biliblili.app.data.entity.interview.InterViewListData;
import com.lqr.biliblili.mvp.ui.adapter.InterviewMultiItemAdapter;
import com.lqr.biliblili.mvp.ui.adapter.entity.InterviewMultiItem;

import java.util.List;

/**
 * Created by yanbo on 2017/12/5.
 */

public interface InterviewContract {
    //view层
    interface View extends IView{
        void setRecycleAdapter(InterviewMultiItemAdapter adapter);//初始化recycleview
    }
    //modle层
    interface Model extends IModel{
        List<InterviewMultiItem> getListData();
    }

}
