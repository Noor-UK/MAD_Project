package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {


    ImageButton  addbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addbtn= findViewById(R.id.addbtn);
        addbtn.setOnClickListener((View.OnClickListener) this);
    }

    public void onClick (View v)
    {


        //navigate to the browser activity
        Intent switchAct = new Intent(MainActivity.this,additemtolist.class);
        startActivity(switchAct);


    }
}