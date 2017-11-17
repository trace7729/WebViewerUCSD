package com.example.hole1.webviewerucsd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

   Button buttonAmazon, buttonUCSD;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonAmazon = (Button) findViewById(R.id.buttonAmazon);
        buttonAmazon.setOnClickListener(this);
        buttonUCSD = (Button) findViewById(R.id.buttonUCSD);
        buttonUCSD.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.buttonAmazon:
                Intent a;
                a = new Intent(this, AmazonActivity.class);
                startActivity(a);
                break;
            case R.id.buttonUCSD:
                Intent u;
                u = new Intent(this,UCSDActivity.class);
                startActivity(u);
                break;
        }
    }
}
