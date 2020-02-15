package com.gameapp.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.Toast;

import com.gameapp.R;
import com.gameapp.adapter.ViewPagerAdapter;
import com.gameapp.fragment.OverviewFragment;
import com.gameapp.fragment.RulesFragment;
import com.gameapp.fragment.TeamsFragment;
import com.gameapp.utils.AppUtils;
import com.google.android.material.tabs.TabLayout;

public class TourDetailActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour_detail);

        tabLayout = findViewById(R.id.tabLaout);
        viewPager = findViewById(R.id.viewPager);
        toolbar = findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle(getIntent().getStringExtra("Name"));
        setUpViewPager();
    }

    private void setUpViewPager() {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        adapter.addFrag(new OverviewFragment(), "Overview");
        adapter.addFrag(new TeamsFragment(), "Teams");
        adapter.addFrag(new RulesFragment(), "Rules");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    protected void onResume() {
        if (!AppUtils.isConnectionAvailable(this)) {
            Toast.makeText(this, "Please check your internet connection", Toast.LENGTH_SHORT).show();
        }
        super.onResume();
    }
}
