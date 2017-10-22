package com.tyler_buchheim.discoverdallas;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * {@link TopicAdapter} is a {@link FragmentPagerAdapter} that can provide the layout for
 * each list item based on a data source which is a list of {@link Location} objects.
 */
public class TopicAdapter extends FragmentPagerAdapter {

    /** Context of the app */
    private Context mContext;

    /**
     * Create a new {@link TopicAdapter} object.
     *
     * @param context is the context of the app
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */
    public TopicAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new EatFragment();
        } else if (position == 1) {
            return new DrinkFragment();
        } else if (position == 2) {
            return new RelaxFragment();
        } else {
            return new EnjoyFragment();
        }
    }

    /**
     * Return the {@link CharSequence} that should be displayed for the given page number.
     */
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.topic_eat);
        } else if (position == 1) {
            return mContext.getString(R.string.topic_drink);
        } else if (position == 2) {
            return mContext.getString(R.string.topic_relax);
        } else {
            return mContext.getString(R.string.topic_enjoy);
        }
    }

    /**
     * Return the total number of pages.
     */
    public int getCount() {
        return 4;
    }

}
