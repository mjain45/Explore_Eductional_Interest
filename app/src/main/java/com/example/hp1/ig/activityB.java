package com.example.hp1.ig;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class activityB extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView list;
    String[] memeTitles;
    String[] memeDescriptions;
    int[] images = {R.drawable.eng, R.drawable.image2, R.drawable.med, R.drawable.commerce, R.drawable.mass, R.drawable.design, R.drawable.l};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        Resources res = getResources();
        memeTitles = res.getStringArray(R.array.titles);
        memeDescriptions = res.getStringArray(R.array.description);
        list = (ListView) findViewById(R.id.listView);
        Abc adapter = new Abc(this, memeTitles, images, memeDescriptions);
        list.setAdapter(adapter);
        list.setOnItemClickListener(this);
//        t.show();

    }

    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String cn = memeTitles[position];
        if ((cn.equals("Engineering"))) {
            Intent i = new Intent(this, engineering.class);
            startActivity(i);


        }
        if ((cn.equals("Medical"))) {
            Intent i = new Intent(this, Medical.class);
            startActivity(i);}

    if ((cn.equals("Animation and Fashion Designing"))) {
        Intent i = new Intent(this, Design.class);
        startActivity(i);}

    if ((cn.equals("Arts, Science ,Commerce"))) {
        Intent i = new Intent(this, commerce.class);
        startActivity(i);}
}}

class Abc extends ArrayAdapter<String> {
        Context context;
        int[] images;
        String[] titleArray;
        String[] descriptionArray;

        Abc(Context c, String[] titles, int imgs[], String[] desc) {
            super(c, R.layout.single_row, R.id.textView, titles);
            this.context = c;
            this.images = imgs;
            this.titleArray = titles;
            this.descriptionArray = desc;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = inflater.inflate(R.layout.single_row, parent, false);
            ImageView myImage = (ImageView) row.findViewById(R.id.imageView);
            TextView myTitle = (TextView) row.findViewById(R.id.textView);
            TextView myDescription = (TextView) row.findViewById(R.id.textView2);
            myImage.setImageResource(images[position]);
            myTitle.setText(titleArray[position]);
            myDescription.setText(descriptionArray[position]);

            return row;
        }
    }

