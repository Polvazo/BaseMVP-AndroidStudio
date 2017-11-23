package com.unmsm.inteligenciaartificial.presentation.activity;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.unmsm.inteligenciaartificial.R;
import com.unmsm.inteligenciaartificial.core.BaseActivity;
import com.unmsm.inteligenciaartificial.presentation.fragment.FragmentCore;
import com.unmsm.inteligenciaartificial.presentation.presenter.PresenterCore;
import com.unmsm.inteligenciaartificial.presentation.utils.ActivityUtils;

public class CoreActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clean);
        FragmentCore fragmentCore = (FragmentCore) getSupportFragmentManager().findFragmentById(R.id.body);
        if (fragmentCore == null) {
            fragmentCore = FragmentCore.newInstance();
            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(), fragmentCore, R.id.body);
        }

        new PresenterCore(fragmentCore, this);
    }

    public void showMessageError(String message) {
        super.showMessage(message);
    }


    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

}
