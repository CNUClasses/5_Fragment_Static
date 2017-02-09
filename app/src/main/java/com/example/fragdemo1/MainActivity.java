package com.example.fragdemo1;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    Fragment1 myFrag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get ref to fragment
        myFrag = (Fragment1) getFragmentManager().findFragmentById(R.id.fragment1);

    }

    @Override
    protected void onStart() {
        super.onStart();

        //getView() get the root view for fragments layout
        View frag1View = myFrag.getView();
        TextView myTextView = (TextView) frag1View.findViewById(R.id.textView1);
        myTextView.setText("A modified string");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
