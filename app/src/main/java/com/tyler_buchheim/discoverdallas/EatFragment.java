package com.tyler_buchheim.discoverdallas;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of dining locations.
 */
public class EatFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create a list of locations
        ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.drawable.pappas, R.string.eat_pappas_name,
                R.string.eat_pappas_address, R.string.eat_pappas_details));
        locations.add(new Location(R.drawable.trulucks, R.string.eat_trulucks_name,
                R.string.eat_trulucks_address, R.string.eat_trulucks_details));
        locations.add(new Location(R.drawable.ranch, R.string.eat_ranch_name,
                R.string.eat_ranch_address, R.string.eat_ranch_details));
        locations.add(new Location(R.drawable.perrys, R.string.eat_perrys_name,
                R.string.eat_perrys_address, R.string.eat_perrys_details));
        locations.add(new Location(R.drawable.biernats, R.string.eat_biernats_name,
                R.string.eat_biernats_address, R.string.eat_biernats_details));
        locations.add(new Location(R.drawable.capital, R.string.eat_capital_name,
                R.string.eat_capital_address, R.string.eat_capital_details));
        locations.add(new Location(R.drawable.fearings, R.string.eat_fearings_name,
                R.string.eat_fearings_address, R.string.eat_fearings_details));
        locations.add(new Location(R.drawable.ocean, R.string.eat_ocean_name,
                R.string.eat_ocean_address, R.string.eat_ocean_details));

        // Create a LocationAdapter and set it to fetched ListView
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.topic_eat);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
