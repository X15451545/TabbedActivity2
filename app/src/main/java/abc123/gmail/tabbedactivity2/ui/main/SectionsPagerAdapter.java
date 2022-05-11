package abc123.gmail.tabbedactivity2.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import abc123.gmail.tabbedactivity2.R;
import abc123.gmail.tabbedactivity2.fragment.Fragment1;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.Tab1, R.string.Tab2, R.string.Tab3, R.string.Tab4};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

//    @Override
//    public Fragment getItem(int position) {
//        return PlaceholderFragment.newInstance(position + 1);
//    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = new Fragment1();
                break;
            case 1:
                fragment = PlaceholderFragment.newInstance(position + 1);
                break;
            case 2:
                fragment = PlaceholderFragment.newInstance(position + 1);
                break;
            case 3:
                fragment = PlaceholderFragment.newInstance(position + 1);
                break;
        }
        return fragment;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show 4 total pages.
        return 4;
    }
}