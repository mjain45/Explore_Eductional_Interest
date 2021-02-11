package com.example.hp1.ig;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class EC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ec);
    }

    protected void VLSI(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://chipedge.com/services-2/certificate- courses/"));
        startActivity(i);

    }

    protected void Emb(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sine.ni.com/nips/cds/view/p/lang/en/nid/2114840"));
        startActivity(i);

    }

    protected void CCNA(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.cisco.com/c/en/us/training-events/training-certifications/certifications.html"));
        startActivity(i);

    }
    protected void MATLAB(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.mathworks.com/training-schedule/certifications/show/mathworks-certified-matlab-associate-exam"));
        startActivity(i);

    }
}