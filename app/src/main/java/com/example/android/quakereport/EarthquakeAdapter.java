package com.example.android.quakereport;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class EarthquakeAdapter extends ArrayAdapter<Paramters> {

//    private static final String LOG_TAG = WordAdapter.class.getSimpleName();
    private static final String LOG_TAG = EarthquakeAdapter.class.getSimpleName();

    public EarthquakeAdapter(Activity context, ArrayList<Paramters> wordsList) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, wordsList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
//        return super.getView(position, convertView, parent);

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquake_activity, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Paramters currentParameter = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView mag = (TextView) listItemView.findViewById(R.id.mag);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        mag.setText(currentParameter.geteMageId());

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView loc = (TextView) listItemView.findViewById(R.id.loc);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        loc.setText(currentParameter.getElocationId());

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView date = (TextView) listItemView.findViewById(R.id.date);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        date.setText(currentParameter.getEdaraId());

        return listItemView;
    }
}