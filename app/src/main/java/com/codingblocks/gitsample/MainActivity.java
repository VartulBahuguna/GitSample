package com.codingblocks.gitsample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        System.out.println("Second Commit");
        System.out.println("Master branch commit 5");
        System.out.println("Master branch merge 2");

        System.out.println("Temp commit 2");

        System.out.println("Master commit 7");
        System.out.println("Master commit 8");

    }
}