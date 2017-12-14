package com.lqr.biliblili.mvp.model;

import android.app.Application;
import android.content.Context;

import com.jess.arms.di.scope.FragmentScope;
import com.jess.arms.integration.AppManager;
import com.jess.arms.integration.IRepositoryManager;
import com.jess.arms.mvp.BaseModel;
import com.jess.arms.utils.ArmsUtils;
import com.lqr.biliblili.R;
import com.lqr.biliblili.app.data.entity.interview.InterViewListData;
import com.lqr.biliblili.mvp.contract.InterviewContract;
import com.lqr.biliblili.mvp.ui.adapter.entity.InterviewMultiItem;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

/**
 * Created by Administrator on 2017/12/5.
 *
 */

@FragmentScope
public class InterviewModel extends BaseModel implements InterviewContract.Model {

    private Application mApplication;
    private AppManager mAppManager;
    @Inject
    public InterviewModel(IRepositoryManager repositoryManager,AppManager appManager,Application application) {
        super(repositoryManager);
        mAppManager = appManager;
        mApplication = application;
    }

    @Override
    public List<InterviewMultiItem> getListData() {
        List<InterviewMultiItem> mList = new ArrayList<>();
        String[] stringArray = ArmsUtils.getResources(getContext()).getStringArray(R.array.string_arr_interview_item);
        for (int i = 0; i < stringArray.length; i++) {
            InterviewMultiItem data = new InterviewMultiItem();
            data.setItemType(2);
            data.setTitleContent(stringArray[i]);
            data.setBodyContent(stringArray[i]);
            mList.add(data);
        }
        return mList;
    }
    //获取当前context
    private Context getContext() {
        return mAppManager.getTopActivity() == null ?
                mApplication : mAppManager.getTopActivity();
    }
}
