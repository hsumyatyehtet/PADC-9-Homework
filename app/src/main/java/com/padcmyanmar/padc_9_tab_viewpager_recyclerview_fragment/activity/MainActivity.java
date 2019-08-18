package com.padcmyanmar.padc_9_tab_viewpager_recyclerview_fragment.activity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.padcmyanmar.padc_9_tab_viewpager_recyclerview_fragment.R;
import com.padcmyanmar.padc_9_tab_viewpager_recyclerview_fragment.adapter.TapAdapter;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Drawable drawable = ContextCompat.getDrawable(getApplicationContext(), R.drawable.ic_menu);
        toolbar.setOverflowIcon(drawable);

        ViewPager viewPager = findViewById(R.id.view_pager);
        TabLayout tabLayout = findViewById(R.id.tab_layout);

        TapAdapter adapter = new TapAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.setting:
                Toast.makeText(this, "Setting", Toast.LENGTH_SHORT).show();
            case R.id.privacy_policy:
                Toast.makeText(this, "Privacy policy", Toast.LENGTH_SHORT).show();
            case R.id.feed_back:
                Toast.makeText(this, "Feed back", Toast.LENGTH_SHORT).show();
            case R.id.log_out:
                Toast.makeText(this, "Log out", Toast.LENGTH_SHORT).show();
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
