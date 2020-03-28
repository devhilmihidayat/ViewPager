package hilmi.com.phonebase.viewpager;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Index extends AppCompatActivity {


    private TabLayout tabLayout;
    private ViewPager viewPager;
    private Pager pAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tabLayout = (TabLayout) findViewById(R.id.tablayout);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        pAdapter = new Pager(getSupportFragmentManager());
        viewPager.setAdapter(pAdapter);

        //
        pAdapter.addFragment(new Fragment1(), getResources().getString(R.string.fragmnet1));
        pAdapter.addFragment(new Fragment2(), getResources().getString(R.string.fragmnet2));
        pAdapter.addFragment(new Fragment3(), getResources().getString(R.string.fragmnet3));




        //view pager set
        viewPager.setAdapter(pAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
