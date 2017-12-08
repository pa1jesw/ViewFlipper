package com.pa1.viewflipper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ViewFlipper;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener{


    ViewFlipper vff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        vff = (ViewFlipper) findViewById(R.id.vf2);
        vff.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        vff.startFlipping();
        vff.setFlipInterval(1000);
        vff.setAutoStart(true);


    }

}
