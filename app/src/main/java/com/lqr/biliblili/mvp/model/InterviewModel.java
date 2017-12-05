package com.lqr.biliblili.mvp.model;

import com.jess.arms.integration.IRepositoryManager;
import com.jess.arms.mvp.BaseModel;
import com.lqr.biliblili.app.data.entity.interview.InterViewListData;
import com.lqr.biliblili.mvp.contract.InterviewContract;

import java.util.List;

import javax.inject.Inject;

/**
 * Created by Administrator on 2017/12/5.
 *
 */


public class InterviewModel extends BaseModel implements InterviewContract.Model {


    @Inject
    public InterviewModel(IRepositoryManager repositoryManager) {
        super(repositoryManager);
    }

    @Override
    public List<InterViewListData> getListData() {
        return null;
    }
}
