/*
 *   Copyright 2016 Krupal Shah, Harsh Bhavsar
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */

package com.droidexperiments.android.pinplace.impl.presenters;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.StringRes;
import android.text.TextUtils;
import android.widget.Toast;

import com.droidexperiments.android.pinplace.interfaces.presenters.base.BasePresenter;

/**
 * Author : Krupal Shah
 * Date : 10-Apr-16
 */
public abstract class BasePresenterImpl implements BasePresenter {

    private final Context mAppContext;

    public BasePresenterImpl(Context context) {
        mAppContext = context.getApplicationContext();
    }

    @Override
    public final void showToast(@StringRes int msgResId) {
        Toast.makeText(mAppContext, mAppContext.getString(msgResId), Toast.LENGTH_SHORT).show();
    }

    @Override
    public final void showToast(String msg) {
        if (TextUtils.isEmpty(msg)) return;
        Toast.makeText(mAppContext, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showDialog(Dialog dialog) {
        if (dialog != null && !dialog.isShowing()) dialog.show();
    }

    public final void dismissDialogs(Dialog... dialogs) {
        for (Dialog dialog : dialogs) {
            if (dialog == null || !dialog.isShowing()) continue;
            dialog.dismiss();
        }
    }
}
