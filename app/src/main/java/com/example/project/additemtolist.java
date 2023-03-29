package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class additemtolist extends AppCompatActivity  implements View.OnClickListener{
    @Override
    public void onCreate(Bundle sp)
    {
        super.onCreate(sp);
        setContentView(R.layout.additemtolist);
        Button btn = findViewById(R.id.button);
        btn.setOnClickListener((View.OnClickListener) this);
    }
    public void onClick (View v)
    {
        //navigate to the browser activity
        Intent switchAct = new Intent(additemtolist.this,MainActivity.class);
        startActivity(switchAct);


    }
}