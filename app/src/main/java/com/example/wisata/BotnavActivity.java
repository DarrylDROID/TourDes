package com.example.wisata;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BotnavActivity extends AppCompatActivity {

    private BottomNavigationView botnav_botnavbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_botnav);
        initView();
        setBottomNavBar();
        getSupportActionBar().hide();
    }

    private void setBottomNavBar() {
        botnav_botnavbar.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = null;

                if (item.getItemId() == R.id.menu_page1) {
                    selectedFragment = new NatureFragment();
                }else if (item.getItemId() == R.id.menu_page2) {
                    selectedFragment = new EducationFragment();
                }else if (item.getItemId() == R.id.menu_page3) {
                    selectedFragment = new ReligionFragment();
                }else if (item.getItemId() == R.id.menu_page4) {
                    selectedFragment = new CulinaryFragment();
                }else if (item.getItemId() == R.id.menu_page5) {
                    selectedFragment = new AboutFragment();
                }

                getSupportFragmentManager().beginTransaction().
                        replace(R.id.botnav_framelayout, selectedFragment).commit();

                return true;
            }
        });
    }

    private void initView() {
        botnav_botnavbar = findViewById(R.id.botnav_botnavbar);
        getSupportFragmentManager().beginTransaction().
                replace(R.id.botnav_framelayout, new NatureFragment()).commit();
    }
}