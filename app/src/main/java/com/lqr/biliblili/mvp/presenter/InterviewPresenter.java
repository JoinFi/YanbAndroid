package com.lqr.biliblili.mvp.presenter;

import android.app.Application;

import com.jess.arms.di.scope.FragmentScope;
import com.jess.arms.http.imageloader.ImageLoader;
import com.jess.arms.integration.AppManager;
import com.jess.arms.mvp.BasePresenter;
import com.jess.arms.utils.ArmsUtils;
import com.lqr.biliblili.mvp.contract.InterviewContract;
import com.lqr.biliblili.mvp.contract.LiveContract;

import javax.inject.Inject;

import me.jessyan.rxerrorhandler.core.RxErrorHandler;

/**
 * Created by yanbo on 2017/12/5.
 * 面试P层
 */
@FragmentScope
public class InterviewPresenter extends BasePresenter<InterviewContract.Model,InterviewContract.View>{
    private RxErrorHandler mErrorHandler;
    private Application mApplication;
    private ImageLoader mImageLoader;
    private AppManager mAppManager;
    @Inject
    public InterviewPresenter(InterviewContract.Model model, InterviewContract.View rootView, RxErrorHandler errorHandler, Application application, ImageLoader imageLoader, AppManager appManager) {
        super(model, rootView);
        mErrorHandler = errorHandler;
        mApplication = application;
        mImageLoader = imageLoader;
        mAppManager = appManager;
    }

    //获取数据
    public void loadData(){

    }

}
