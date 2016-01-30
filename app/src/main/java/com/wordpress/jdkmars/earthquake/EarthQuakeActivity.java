package com.wordpress.jdkmars.earthquake;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;


public class EarthQuakeActivity extends Activity {

    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earth_quake);

        b = (Button)findViewById(R.id.buttonOne);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(EarthQuakeActivity.this,MethodActivity.class);
                startActivity(i);
            }
        });
    }
}
