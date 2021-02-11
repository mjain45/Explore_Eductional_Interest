package com.example.hp1.ig;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class engineering extends AppCompatActivity implements AdapterView.OnItemClickListener{
    ListView l;
    String[] BE = {"Computer Science and Engineering", "Information Technology", "Mechanical Engineering", "Electronics and Communication"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_engineering);
        l = (ListView) findViewById(R.id.listView2);
        ArrayAdapter<String> adap = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, BE);

        l.setAdapter(adap);
        l.setOnItemClickListener(this);
        /*
        Toast t = Toast.makeText(this, "", Toast.LENGTH_LONG);

        t.show();*/

    }

    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        TextView t = (TextView) view;
        if ((t.getText().toString()).equals("Computer Science and Engineering") || (t.getText().toString()).equals("Information Technology")) {
            Intent it = new Intent(this, CSIT.class);
            startActivity(it);
            finish();
        }
        if ((t.getText().toString()).equals("Mechanical Engineering")) {
            Intent it = new Intent(this, ME.class);
            startActivity(it);
            finish();}
        if ((t.getText().toString()).equals("Electronics and Communication")) {
            Intent it = new Intent(this, EC.class);
            startActivity(it);
            finish();
        }


    }
}
