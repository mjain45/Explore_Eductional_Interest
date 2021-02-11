package com.example.hp1.ig;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Medical extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical);
    }

    protected void med1(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://coggno.com/onlinetraining/health/hipaa/hipaa-for-health-care-providers-course-1"));
        startActivity(i);

    }

    protected void med2(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.aclscertification.com/"));
        startActivity(i);

    }

    protected void med3(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.redcross.org/take-a-class/bls"));
        startActivity(i);

    }
}


