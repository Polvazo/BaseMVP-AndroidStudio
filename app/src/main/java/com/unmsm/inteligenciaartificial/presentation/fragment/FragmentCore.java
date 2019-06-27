package com.unmsm.inteligenciaartificial.presentation.fragment;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.unmsm.inteligenciaartificial.R;
import com.unmsm.inteligenciaartificial.core.BaseFragment;
import com.unmsm.inteligenciaartificial.presentation.contract.ContractCore;

import static android.support.v4.util.Preconditions.checkNotNull;


/**
 * Created by USUARIO on 23/11/2017.
 */
public class FragmentCore extends BaseFragment implements ContractCore.View {

    private ProgressDialog dialog;
    private ContractCore.Presenter mPresenter;
    boolean isLoading = false;

    public static FragmentCore newInstance() {
        return new FragmentCore();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_core, container, false);
        return root;
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onResume() {
        super.onResume();
        mPresenter.start();
    }


    @Override
    public void setLoadingIndicator(boolean active) {
        if(!active){
            dialog.dismiss();
            isLoading = false;
        }else if(active){
            isLoading = true;
            dialog.show();
        }
    }

    @Override
    public void setMessageError(String error) {

    }

    @Override
    public void setDialogMessage(String message) {


    }


    @Override
    public boolean isActive() {
        return true;
    }

    @SuppressLint("RestrictedApi")
    @Override
    public void setPresenter(ContractCore.Presenter presenter) {
        mPresenter = checkNotNull(presenter);
    }


}
