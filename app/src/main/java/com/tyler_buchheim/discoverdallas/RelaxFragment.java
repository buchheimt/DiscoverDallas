package com.tyler_buchheim.discoverdallas;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of golfing locations.
 */
public class RelaxFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create a list of locations
        ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.drawable.tenison, R.string.relax_tenison_name,
                R.string.relax_tenison_address, R.string.relax_tenison_details));
        locations.add(new Location(R.drawable.verde, R.string.relax_verde_name,
                R.string.relax_verde_address, R.string.relax_verde_details));
        locations.add(new Location(R.drawable.cowboys, R.string.relax_cowboys_name,
                R.string.relax_cowboys_address, R.string.relax_cowboys_details));
        locations.add(new Location(R.drawable.tangle, R.string.relax_tangle_name,
                R.string.relax_tangle_address, R.string.relax_tangle_details));
        locations.add(new Location(R.drawable.horse, R.string.relax_horse_name,
                R.string.relax_horse_address, R.string.relax_horse_details));
        locations.add(new Location(R.drawable.bridges, R.string.relax_horse_name,
                R.string.relax_bridges_address, R.string.relax_bridges_details));
        locations.add(new Location(R.drawable.star, R.string.relax_star_name,
                R.string.relax_star_address, R.string.relax_star_details));
        locations.add(new Location(R.drawable.tribute, R.string.relax_tribute_name,
                R.string.relax_tribute_address, R.string.relax_tribute_details));

        // Create a LocationAdapter and set it to fetched ListView
        LocationAdapter adapter = new LocationAdapter(getActivity(),
                locations, R.color.topic_relax);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
