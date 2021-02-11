package com.example.hp1.ig;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Design extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_design);
    }

    protected void CCD(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://ocw.mit.edu/courses/music-and-theater-arts/21m-715-the-craft-of-costume-design-fall-2009/"));
        startActivity(i);

    }

    protected void DS(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.uen.org/core/core.do?courseNum=200301"));
        startActivity(i);

    }

    protected void ANIM(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.aionline.edu/3d-animation-certificate/"));
        startActivity(i);

    }

    protected void VFX(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.image.edu.in/certificate-visual-effects-course.asp"));
        startActivity(i);

    }
}