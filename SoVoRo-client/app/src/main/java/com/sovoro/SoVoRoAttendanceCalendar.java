package com.sovoro;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;

public class SoVoRoAttendanceCalendar extends AppCompatActivity {
    // 툴바 관련 객체
    private Toolbar toolbar;
    private DrawerLayout drawer;
    private ActionBarDrawerToggle toggle;
    private NavigationView navigationView;

    private FragmentManager fragmentManager;
    private SoVoRoCalendarContent sovoroCalendarContent;
    private FragmentTransaction transaction;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //return super.onCreateOptionsMenu(menu);
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.sovoro_toolbar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:{ // 왼쪽 상단 버튼 눌렀을 때
                drawer.openDrawer(GravityCompat.START);
                return true;
            }
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sovoro_attendance_calendar);

        /**툴바 관련 코드**/
        toolbar = (Toolbar) findViewById(R.id.sovoro_calendar_toolbar);
        setSupportActionBar(toolbar);
        // 왼쪽 메뉴바 삽입
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.menu);
        // 타이틀 제거
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        drawer=findViewById(R.id.sovoro_calendar_drawer);

        /**네비게이션뷰 관련 코드**/
        navigationView=findViewById(R.id.sovoro_calendar_drawer_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                menuItem.setChecked(true);
                drawer.closeDrawers();
                Intent intent;
                int id = menuItem.getItemId();
                String title = menuItem.getTitle().toString();
                switch (menuItem.getItemId()) {
                    case R.id.sovoro_word_view:
                        intent = new Intent(getApplicationContext(), SoVoRoMain.class);
                        startActivity(intent);
                        break;
                    case R.id.sovoro_word_test:
                        intent = new Intent(getApplicationContext(), SoVoRoTest.class);
                        startActivity(intent);
                        break;
                    case R.id.sovoro_calendar:
                        intent = new Intent(getApplicationContext(), SoVoRoAttendanceCalendar.class);
                        startActivity(intent);
                        break;
                    case R.id.sovoro_word_comment:
                        intent = new Intent(getApplicationContext(), SoVoRoComment.class);
                        startActivity(intent);
                        break;
                }
                return true;
            }
        });


        MaterialCalendarView calendarView=findViewById(R.id.sovoro_calendar);
        fragmentManager = getSupportFragmentManager();

        sovoroCalendarContent = new SoVoRoCalendarContent();

        transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.sovoro_calendar_contnent, sovoroCalendarContent).commitAllowingStateLoss();
    }
}