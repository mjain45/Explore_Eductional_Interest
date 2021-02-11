package com.example.hp1.ig;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class CSIT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csit);
    }
    protected void IST(View view)
    {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.istqb.org/certification-path-root.html"));
        startActivity(i);

    }
    protected void JC(View view)
    {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://education.oracle.com/pls/web_prod-plq-dad/db_pages.getpage?page_id=458&get_params=p_track_id:OCPJSE7"));
        startActivity(i);

    }
    protected void OC(View view)
    {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://oracle-base.com/misc/ocp-certification"));
        startActivity(i);

    }
    protected void NET(View view)
    {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.microsoft.com/en-in/learning/mcpd-certification.aspx"));
        startActivity(i);

    }


}
