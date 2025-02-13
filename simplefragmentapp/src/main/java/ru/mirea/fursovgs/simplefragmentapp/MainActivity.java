package ru.mirea.fursovgs.simplefragmentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

        Fragment fragment1, fragment2;
        FragmentManager fragmentManager;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            fragment1 = new FirstFragment();
            fragment2 = new SecondFragment();
        }

        public void onClick(View view) {
            fragmentManager = getSupportFragmentManager();
            if (view.getId() == R.id.btnFragment1) {
                fragmentManager.beginTransaction().replace(R.id.fragmentContainer, fragment1).commit();
            } else if (view.getId() == R.id.btnFragment2) {
                fragmentManager.beginTransaction().replace(R.id.fragmentContainer, fragment2).commit();
            }
        }
}