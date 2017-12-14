package com.lqr.biliblili.mvp.ui.adapter;

import android.widget.BaseAdapter;

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.http.imageloader.glide.ImageConfigImpl;
import com.jess.arms.utils.ArmsUtils;
import com.lqr.biliblili.R;
import com.lqr.biliblili.mvp.ui.adapter.entity.InterviewMultiItem;

import java.util.List;

/**
 * Created by yanbo on 2017/12/5.
 * 面试页面的适配器
 */

public class InterviewMultiItemAdapter extends BaseMultiItemQuickAdapter<InterviewMultiItem,BaseViewHolder>{
    private AppComponent mAppComponent;
    public InterviewMultiItemAdapter(List<InterviewMultiItem> data) {
        super(data);
        addItemType(InterviewMultiItem.TITLE, R.layout.item_m_h_interview_title);
        addItemType(InterviewMultiItem.BODY, R.layout.item_m_h_interview_body);
    }

    @Override
    protected void convert(BaseViewHolder helper, InterviewMultiItem item) {
        if (mAppComponent == null){
            mAppComponent = ArmsUtils.obtainAppComponentFromContext(mContext);
        }
        switch (item.getItemType()){
            case InterviewMultiItem.TITLE:
                mAppComponent
                        .imageLoader()
                        .loadImage(mContext, ImageConfigImpl
                                .builder()
                                .imageView(helper.getView(R.id.item_interview_title_img))
                                .url("https://www.baidu.com/img/bd_logo1.png")
                                .build());
                helper.setText(R.id.item_interview_title_tv, item.getTitleContent());
                break;
            case InterviewMultiItem.BODY:
                mAppComponent
                        .imageLoader()
                        .loadImage(mContext, ImageConfigImpl
                                .builder()
                                .imageView(helper.getView(R.id.item_interview_body_img))
                                .url("https://www.baidu.com/img/bd_logo1.png")
                                .build());
                helper.setText(R.id.item_interview_body_tv, item.getTitleContent());
                break;
            default:
                break;
        }
    }
}
