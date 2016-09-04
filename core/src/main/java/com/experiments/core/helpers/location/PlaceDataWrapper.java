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

package com.experiments.core.helpers.location;

import android.location.Location;
import android.support.annotation.Nullable;

import com.google.android.gms.location.places.Place;

/**
 * Author : Krupal Shah
 * Date : 09-Apr-16
 */
public class PlaceDataWrapper {


    private Location locationData;
    private Place placeData;

    public PlaceDataWrapper() {

    }

    public Location getLocationData() {
        return locationData;
    }

    public void setLocationData(Location locationData) {
        this.locationData = locationData;
    }

    @Nullable
    public Place getPlaceData() {
        return placeData;
    }

    public void setPlaceData(Place placeData) {
        this.placeData = placeData;
    }

    @Override
    public String toString() {
        return "PlaceWrapper{" +
                "locationData=" + locationData +
                ", placeData=" + placeData +
                '}';
    }
}