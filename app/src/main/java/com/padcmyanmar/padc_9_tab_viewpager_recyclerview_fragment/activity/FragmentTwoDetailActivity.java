package com.padcmyanmar.padc_9_tab_viewpager_recyclerview_fragment.activity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.ViewPager;

import com.padcmyanmar.padc_9_tab_viewpager_recyclerview_fragment.R;
import com.padcmyanmar.padc_9_tab_viewpager_recyclerview_fragment.adapter.FragmentTwoViewpagerAdapter;

public class FragmentTwoDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.fragment_two_activity_detail);

        Toolbar toolbar = findViewById(R.id.tb_fragment_two);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        Drawable drawable = ContextCompat.getDrawable(getApplicationContext(), R.drawable.ic_detail_menu);
        toolbar.setOverflowIcon(drawable);

        ViewPager viewPager=findViewById(R.id.vp_fragment_two);
        FragmentTwoViewpagerAdapter adapter=new FragmentTwoViewpagerAdapter();
        viewPager.setAdapter(adapter);
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
            case android.R.id.home:
                onBackPressed();
                return true;
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

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        if (item.getItemId() == android.R.id.home) {
//            onBackPressed();
//            return true;
//        }
//        return false;
//    }
}
