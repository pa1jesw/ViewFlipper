package com.pa1.viewflipper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ViewFlipper;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{


    ViewFlipper vf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        vf = (ViewFlipper) findViewById(R.id.vf1);
        vf.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        vf.startFlipping();
        vf.setFlipInterval(1000);
       // vf.setAutoStart(true);

    }
}
