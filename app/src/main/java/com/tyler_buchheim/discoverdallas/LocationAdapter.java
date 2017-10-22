package com.tyler_buchheim.discoverdallas;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link LocationAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Location} objects.
 */
public class LocationAdapter extends ArrayAdapter<Location> {

    /** Resource ID for the background color of the list */
    private int mBackgroundColorResourceId;

    /**
     * Create a new {@link LocationAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param locations is the list of {@link Location}s to be displayed.
     * @param backgroundColorResourceId is the resource ID for the background color for this list of words
     */
    public LocationAdapter(Activity context, ArrayList<Location> locations,
                           int backgroundColorResourceId) {
        super(context, 0, locations);
        mBackgroundColorResourceId = backgroundColorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check for reusable view and inflate if none exists
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,
                    parent, false);
        }
        // Set background color for topic list
        listItemView.setBackgroundResource(mBackgroundColorResourceId);

        // Fetch the {@link Location} object at the given position
        Location location = getItem(position);

        // Find text and image views and set to corresponding location values
        TextView nameView = listItemView.findViewById(R.id.name);
        nameView.setText(location.getName());

        TextView addressView = listItemView.findViewById(R.id.address);
        addressView.setText(location.getAddress());

        TextView descriptionView = listItemView.findViewById(R.id.details);
        descriptionView.setText(location.getDetails());

        ImageView imageView = listItemView.findViewById(R.id.image);
        imageView.setImageResource(location.getImageResourceId());

        // Return list item layout with 3 TextViews and 1 ImageView
        return listItemView;
    }

}
