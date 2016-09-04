/*
 *
 *  Copyright  (c) 2016 Krupal Shah, Harsh Bhavsar
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

package com.experiments.core.mvp.views;

import android.support.annotation.StringRes;

/**
 * Created by Krupal Shah on 28-Aug-16.
 */
public interface BaseView extends BaseMvpView {

    /**
     * shows generic message
     *
     * @param msgResId message string resource id
     */
    void showMessage(@StringRes int msgResId);

    /**
     * shows error message
     *
     * @param msgResId message string resource id
     */
    void showError(@StringRes int msgResId);


}
