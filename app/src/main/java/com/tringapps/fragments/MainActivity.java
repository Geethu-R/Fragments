package com.tringapps.fragments;


import android.app.FragmentManager;
//import android.app.Fragment;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("TAG","on create is called");
        setContentView(R.layout.main);
    }

    public void changeFragment(View v) {
//        Fragment fragment;

        if (v == findViewById(R.id.button1))
        {
            FirstFragment fragment = new FirstFragment();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragmentHolder,fragment);
            ft.setCustomAnimations(R.anim.fade_in,R.anim.fade_out);
            ft.commit();

        }
        if (v == findViewById(R.id.button2))
        {
            SecondFragment fragment = new SecondFragment();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragmentHolder,fragment);
            ft.commit();

        }

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TAG","on start method is called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TAG","on resume is created");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TAG","on pause is called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TAG","on stop is called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("TAG","on restart is called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TAG","on destroy is called");
    }
}




