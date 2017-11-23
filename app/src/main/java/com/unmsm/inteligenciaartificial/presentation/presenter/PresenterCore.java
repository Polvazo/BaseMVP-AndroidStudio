package com.unmsm.inteligenciaartificial.presentation.presenter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;

import com.unmsm.inteligenciaartificial.presentation.contract.ContractCore;

import java.util.ArrayList;

/**
 * Created by USUARIO on 23/11/2017.
 */

public class PresenterCore implements ContractCore.Presenter {
    private final ContractCore.View mCoreView;
    private Context context;

    public PresenterCore(ContractCore.View mLoginView, @NonNull Context context) {
        this.mCoreView = mLoginView;
        this.context = context;
        this.mCoreView.setPresenter(this);
    }

    @Override
    public void start() {

    }
}
