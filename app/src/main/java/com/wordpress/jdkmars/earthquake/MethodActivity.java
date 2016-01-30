package com.wordpress.jdkmars.earthquake;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MethodActivity extends Activity {

    Button b1,b2,b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earth_quake);

        b1 = (Button)findViewById(R.id.buttonMethod1);
        b2 = (Button)findViewById(R.id.buttonMethod2);
        b3 = (Button)findViewById(R.id.buttonMethod3);
        b4 = (Button)findViewById(R.id.buttonMethod4);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(MethodActivity.this,DetailsActivity.class);
                startActivity(i1);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(MethodActivity.this,Details_2Activity.class);
                startActivity(i2);
            }
        });


        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(MethodActivity.this,DetailsActivity.class);
                startActivity(i3);
            }
        });


        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4 = new Intent(MethodActivity.this,DetailsActivity.class);
                startActivity(i4);
            }
        });
    }

}
