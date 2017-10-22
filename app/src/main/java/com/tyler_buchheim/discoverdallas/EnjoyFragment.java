package com.tyler_buchheim.discoverdallas;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of attraction locations.
 */
public class EnjoyFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create a list of locations
        ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.drawable.sixth, R.string.enjoy_sixth_name,
                R.string.enjoy_sixth_address, R.string.enjoy_sixth_details));
        locations.add(new Location(R.drawable.arboretum, R.string.enjoy_arboretum_name,
                R.string.enjoy_arboretum_address, R.string.enjoy_arboretum_details));
        locations.add(new Location(R.drawable.bush, R.string.enjoy_bush_name,
                R.string.enjoy_bush_address, R.string.enjoy_bush_details));
        locations.add(new Location(R.drawable.perot, R.string.enjoy_perot_name,
                R.string.enjoy_perot_address, R.string.enjoy_perot_details));
        locations.add(new Location(R.drawable.aquarium, R.string.enjoy_aquarium_name,
                R.string.enjoy_aquarium_address, R.string.enjoy_aquarium_details));
        locations.add(new Location(R.drawable.zoo, R.string.enjoy_zoo_name,
                R.string.enjoy_zoo_address, R.string.enjoy_zoo_details));
        locations.add(new Location(R.drawable.art, R.string.enjoy_art_name,
                R.string.enjoy_art_address, R.string.enjoy_art_details));
        locations.add(new Location(R.drawable.symphony, R.string.enjoy_symphony_name,
                R.string.enjoy_symphony_address, R.string.enjoy_symphony_details));

        // Create a LocationAdapter and set it to fetched ListView
        LocationAdapter adapter = new LocationAdapter(getActivity(),
                locations, R.color.topic_enjoy);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
