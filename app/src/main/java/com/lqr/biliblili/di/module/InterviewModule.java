package com.lqr.biliblili.di.module;

import com.jess.arms.di.scope.FragmentScope;
import com.lqr.biliblili.mvp.contract.InterviewContract;
import com.lqr.biliblili.mvp.contract.LiveContract;
import com.lqr.biliblili.mvp.model.InterviewModel;
import com.lqr.biliblili.mvp.model.LiveModel;

import dagger.Module;
import dagger.Provides;


@Module
public class InterviewModule {

    private InterviewContract.View view;
    public InterviewModule(InterviewContract.View view) {
        this.view = view;
    }

    //下面每个方法就是一个提供方
    @FragmentScope
    @Provides
    public InterviewContract.View provideView() {
        return view;
    }

    @FragmentScope
    @Provides
    public InterviewContract.Model provideModel(InterviewModel model) {
        return model;
    }
}
