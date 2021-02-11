package com.example.hp1.ig;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class commerce extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commerce);
    }
    protected void CCRA(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("nism.ac.in/certification/...certification1/certified-credit-research-analyst-certification"));
        startActivity(i);

    }

    protected void NCCMP(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("www.elearnmarkets.com/packages/index/online-nccmp-course"));
        startActivity(i);

    }

    protected void IT(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("www.iata.org/training/subject-areas/pages/travel-tourism-courses.aspx"));
        startActivity(i);

    }
}
