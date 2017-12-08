package com.pa1.viewflipper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ViewFlipper;

public class Main4Activity extends AppCompatActivity implements View.OnClickListener{

    ViewFlipper vfff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        vfff = (ViewFlipper) findViewById(R.id.vf3);
        vfff.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        vfff.startFlipping();
        vfff.setFlipInterval(1000);
        vfff.setAutoStart(true);

    }
}
