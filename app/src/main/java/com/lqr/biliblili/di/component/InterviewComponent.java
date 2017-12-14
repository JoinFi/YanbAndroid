package com.lqr.biliblili.di.component;

import com.jess.arms.di.component.AppComponent;
import com.jess.arms.di.scope.FragmentScope;
import com.lqr.biliblili.di.module.InterviewModule;
import com.lqr.biliblili.mvp.ui.fragment.main.home.InterviewFragment;

import dagger.Component;

/**
 * Created by yanbo on 2017/12/13.
 */
@FragmentScope
@Component(modules = InterviewModule.class,dependencies = AppComponent.class)
public interface InterviewComponent {
    void inject(InterviewFragment fragment);
}
