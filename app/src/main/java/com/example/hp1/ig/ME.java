package com.example.hp1.ig;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ME extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_me);
    }
    protected void NX(View view)
    {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://training.plm.automation.siemens.com/courses/iltdescription.cfm?c=tr18010"));
        startActivity(i);

    }
    protected void CATIA(View view)
    {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.3ds.com/training/how-to-get-certified/catia-users/"));
        startActivity(i);

    }
    protected void PLC(View view)
    {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.plctechnician.com/"));
        startActivity(i);

    }
}
