package com.unique.app.community.loginAndRegister.register;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.TextView;

import com.unique.app.community.R;
import com.unique.app.community.base.Mvp.BaseActivity;
import com.unique.app.community.base.Mvp.IView;
import com.unique.app.community.global.conf;
import com.unique.app.community.loginAndRegister.login.LoginActivity;
import com.unique.app.community.loginAndRegister.utils.Listeners;

import java.util.Locale;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Author: Alexander
 * Email: yifengtang@hustunique.com
 * Since: 16/10/1.
 */

public class RegisterActivity extends BaseActivity<RegisterPresenter>
        implements IView{

    @BindView(R.id.tool_bar_back_button)
    TextView backButton;
    @BindView(R.id.tool_bar_title_text_view)
    TextView titleText;

    @Override
    protected RegisterPresenter getPresenter() {
        return new RegisterPresenter(mContext);
    }

    public static void start(Context context, @Nullable Bundle bundle){
        Intent starter = new Intent(context, RegisterActivity.class);
        context.startActivity(starter, bundle);
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_register;
    }

    @Override
    protected void initEventAndData() {
        initialText();
    }

    @Override
    protected boolean isToolbarEnable() {
        return true;
    }

    public RegisterPresenter getMPresenter(){
        return mPresenter;
    }

    /**
     * Initial listeners
     */

    @OnClick(R.id.tool_bar_back_button)
    void getBack(){
        onBackPressed();
    }

    /**
     * Initial text
     */

    private void initialText(){
        titleText.setText(getResources().getString(R.string.register));
    }
}