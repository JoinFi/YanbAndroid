package com.lqr.biliblili.mvp.ui.adapter;

import android.widget.BaseAdapter;

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.lqr.biliblili.R;
import com.lqr.biliblili.mvp.ui.adapter.entity.InterviewMultiItem;

import java.util.List;

/**
 * Created by yanbo on 2017/12/5.
 * 面试页面的适配器
 */

public class InterviewMultiItemAdapter extends BaseMultiItemQuickAdapter<InterviewMultiItem,BaseViewHolder>{
    /**
     * Same as QuickAdapter#QuickAdapter(Context,int) but with
     * some initialization data.
     *
     * @param data A new list is created out of this one to avoid mutable list
     */
    public InterviewMultiItemAdapter(List<InterviewMultiItem> data) {
        super(data);
        addItemType(InterviewMultiItem.BODY, R.layout.item_m_h_interview_body);
        addItemType(InterviewMultiItem.BODY, R.layout.item_m_h_interview_title);
    }

    @Override
    protected void convert(BaseViewHolder helper, InterviewMultiItem item) {

    }
}
