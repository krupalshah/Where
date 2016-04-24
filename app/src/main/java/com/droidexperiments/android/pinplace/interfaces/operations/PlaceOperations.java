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

import com.droidexperiments.android.pinplace.models.Place;

import java.util.List;

/**
 * Author : Krupal Shah
 * Date : 24-Apr-16
 */
public interface PlaceOperations {

    void savePlace(Place place);

    Place getPlace();

    List<Place> getAllPlaces();

    void updatePlace(Place place);

    void deletePlace(Place place);
}
