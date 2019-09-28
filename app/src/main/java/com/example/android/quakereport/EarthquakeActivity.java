/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.quakereport;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class EarthquakeActivity extends AppCompatActivity {

    public static final String LOG_TAG = EarthquakeActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity);
        // Create a fake list of earthquake locations.
        ArrayList<Paramters> earthquakes = new ArrayList<>();
        earthquakes.add(new Paramters(R.string.mag1, R.string.loc1, R.string.date1));
        earthquakes.add(new Paramters(R.string.mag2, R.string.loc2, R.string.date2));
        earthquakes.add(new Paramters(R.string.mag3, R.string.loc3, R.string.date3));
        earthquakes.add(new Paramters(R.string.mag4, R.string.loc4, R.string.date4));
        earthquakes.add(new Paramters(R.string.mag5, R.string.loc5, R.string.date5));
        earthquakes.add(new Paramters(R.string.mag6, R.string.loc6, R.string.date6));
        earthquakes.add(new Paramters(R.string.mag7, R.string.loc7, R.string.date7));

        // Create a new {@link ArrayAdapter} of earthquakes
        EarthquakeAdapter adapter = new EarthquakeAdapter(this, earthquakes);


        // Find a reference to the {@link ListView} in the layout
        ListView earthquakeListView = (ListView) findViewById(R.id.list);

        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        earthquakeListView.setAdapter(adapter);
    }
}