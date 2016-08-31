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

package com.experiments.whereapp.db.models;

import android.text.TextUtils;

import com.experiments.common.mvp.models.ModelValidator;
import com.experiments.whereapp.config.DbConfig;
import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

/**
 * Created by Krupal Shah on 26-Jun-16.
 */
@Table(databaseName = DbConfig.NAME)
public class PlaceDetails extends BaseModel implements ModelValidator {

    @Column
    @PrimaryKey
    String placeId;

    @Override
    public String toString() {
        return "PlaceDetails{" +
                "placeId='" + placeId + '\'' +
                '}';
    }

    @Override
    public boolean isValid() {
        return !TextUtils.isEmpty(placeId);
    }
}