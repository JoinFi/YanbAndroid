package com.lqr.biliblili.mvp.ui.fragment.main.home;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jess.arms.di.component.AppComponent;
import com.lqr.biliblili.R;
import com.lqr.biliblili.app.base.MySupportFragment;
import com.lqr.biliblili.di.component.DaggerInterviewComponent;
import com.lqr.biliblili.di.component.DaggerLiveComponent;
import com.lqr.biliblili.di.module.InterviewModule;
import com.lqr.biliblili.di.module.LiveModule;
import com.lqr.biliblili.mvp.contract.InterviewContract;
import com.lqr.biliblili.mvp.presenter.InterviewPresenter;
import com.lqr.biliblili.mvp.ui.adapter.InterviewMultiItemAdapter;

import butterknife.BindView;

/**
 * @创建者 严博
 * @描述 面试
 */
public class InterviewFragment extends MySupportFragment<InterviewPresenter> implements InterviewContract.View {


    @BindView(R.id.recyclerview)
    RecyclerView mRecycleView;

    private View mRootView;
    public static InterviewFragment newInstance() {
        return new InterviewFragment();
    }

    @Override
    public void setupFragmentComponent(AppComponent appComponent) {
        DaggerInterviewComponent.builder()
                .interviewModule(new InterviewModule(this))
                .appComponent(appComponent)
                .build()
                .inject(this);
    }

    @Override
    public View initView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (mRootView == null)
            mRootView = inflater.inflate(R.layout.fragment_m_h_interview, container, false);
        return mRootView;
    }

    @Override
    public void initData(Bundle savedInstanceState) {
        mPresenter.loadData();
    }

    @Override
    public void setData(Object data) {

    }



    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showMessage(String message) {

    }

    @Override
    public void launchActivity(Intent intent) {

    }

    @Override
    public void killMyself() {

    }

    @Override
    public void setRecycleAdapter(InterviewMultiItemAdapter adapter) {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(_mActivity, 2);
        mRecycleView.setLayoutManager(gridLayoutManager);
        mRecycleView.setAdapter(adapter);
    }
}
