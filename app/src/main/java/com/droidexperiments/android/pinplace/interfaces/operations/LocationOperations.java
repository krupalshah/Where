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

package com.droidexperiments.android.pinplace.interfaces.operations;

import android.support.annotation.NonNull;

import com.droidexperiments.android.pinplace.interfaces.callbacks.GetPlaceCallback;
import com.droidexperiments.android.pinplace.interfaces.listeners.PlaceUpdatesListener;

/**
 * Author : Krupal Shah
 * Date : 17-Apr-16
 */
public interface LocationOperations {

    void registerPlaceListener(PlaceUpdatesListener placeUpdatesListener);

    void startLocationUpdates();

    void getCurrentPlace(boolean needsUpdatedAddress, @NonNull GetPlaceCallback callback);

    void stopLocationUpdates();

    void unregisterPlaceListener();
}
