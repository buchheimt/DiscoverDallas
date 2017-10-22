package com.tyler_buchheim.discoverdallas;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of nightlife locations.
 */
public class DrinkFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create a list of locations
        ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.drawable.parliament, R.string.drink_parliament_name,
                R.string.drink_parliament_address, R.string.drink_parliament_details));
        locations.add(new Location(R.drawable.atwater, R.string.drink_atwater_name,
                R.string.drink_atwater_address, R.string.drink_atwater_details));
        locations.add(new Location(R.drawable.swan, R.string.drink_swan_name,
                R.string.drink_swan_address, R.string.drink_swan_details));
        locations.add(new Location(R.drawable.rambler, R.string.drink_rambler_name,
                R.string.drink_rambler_address, R.string.drink_rambler_details));
        locations.add(new Location(R.drawable.industry, R.string.drink_industry_name,
                R.string.drink_industry_address, R.string.drink_industry_details));
        locations.add(new Location(R.drawable.hide, R.string.drink_hide_name,
                R.string.drink_hide_address, R.string.drink_hide_details));
        locations.add(new Location(R.drawable.library, R.string.drink_library_name,
                R.string.drink_library_address, R.string.drink_library_details));
        locations.add(new Location(R.drawable.stand, R.string.drink_stand_name,
                R.string.drink_stand_address, R.string.drink_stand_details));

        // Create a LocationAdapter and set it to fetched ListView
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations,
                R.color.topic_drink);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
