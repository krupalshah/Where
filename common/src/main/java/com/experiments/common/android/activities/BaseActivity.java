/*
 *   Copyright  (c) 2016 Krupal Shah, Harsh Bhavsar
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package com.experiments.common.android.activities;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.experiments.common.mvp.views.BaseView;

/**
 * Author : Krupal Shah
 * Date : 02-Apr-16
 * <p>
 * base class for all activities in app
 */
public abstract class BaseActivity extends AppCompatActivity implements BaseView {

    //flag to manage if activity's onDestroy() has been called or not (since not available for minSDK < 17)
    private boolean isDestroyed;


    @CallSuper
    @Override
    protected void onDestroy() {
        isDestroyed = true;
        super.onDestroy();
    }

    /**
     * initialize required components here
     */
    protected abstract void initComponents();

    @Override
    public void showToast(@NonNull String msg) {
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showToast(@StringRes int msgResId) {
        showToast(getString(msgResId));
    }

    @Override
    public void showSnakeBar(@NonNull String msg, @StringRes int action, View.OnClickListener actionListener) {
        final Snackbar snackbar = Snackbar.make(findViewById(android.R.id.content), msg, Snackbar.LENGTH_INDEFINITE);
        if (actionListener != null) {
            snackbar.setAction(action, actionListener);
        } else {
            snackbar.setAction(action, view -> snackbar.dismiss());
        }
        snackbar.show();
    }

    @Override
    public void showSnakeBar(@StringRes int msg, @StringRes int action, @Nullable View.OnClickListener actionListener) {
        showSnakeBar(getString(msg), action, actionListener);
    }

    @Override
    public void showDialog(Dialog dialog) {
        if (dialog == null || dialog.isShowing()) return;
        dialog.show();
    }

    @Override
    public void dismissDialogs(Dialog... dialogs) {
        for (Dialog dialog : dialogs) {
            if (dialog == null || !dialog.isShowing()) continue;
            dialog.dismiss();
        }
    }

    @Override
    public Context getContext() {
        return this;
    }

    @Override
    public boolean isDestroyed() {
        return isDestroyed;
    }

}
