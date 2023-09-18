package com.example.fragdemo1;

//import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

import android.widget.TextView;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Fragment1 myFrag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
        myFrag = (Fragment1) fragmentManager.findFragmentById(R.id.f1);
    }

    @Override
    protected void onStart() {
        super.onStart();

        //getView() get the root view for fragments layout
        TextView frag_tv = myFrag.getView().findViewById(R.id.textView1);

        //change the text
        if (frag_tv != null)
            frag_tv.setText("Some text changes");

    }

}
