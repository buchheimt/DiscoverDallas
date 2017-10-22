package com.tyler_buchheim.discoverdallas;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find view pager and connect the adapter
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        TopicAdapter adapter = new TopicAdapter(this, getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        // Find the tabLayout and connect it to the view pager
        TabLayout tableLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tableLayout.setupWithViewPager(viewPager);
    }
}
