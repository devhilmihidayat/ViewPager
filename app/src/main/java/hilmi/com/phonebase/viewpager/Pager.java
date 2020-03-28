package hilmi.com.phonebase.viewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 28/03/2020.
 */

public class Pager extends FragmentStatePagerAdapter {

    //declare
    private final List<Fragment> fragmentList = new ArrayList<>();
    private final List<String> listTitle = new ArrayList<>();

    public Pager(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Override
    public CharSequence getPageTitle(int position){
        return listTitle.get(position);
    }

    //ad to activity
    public void addFragment(Fragment fragment, String Title){
        fragmentList.add(fragment);
        listTitle.add(Title);
        return;
    }
}
