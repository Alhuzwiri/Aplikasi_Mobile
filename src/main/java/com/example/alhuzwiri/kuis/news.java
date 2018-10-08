package com.example.alhuzwiri.kuis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class news extends AppCompatActivity implements View.OnClickListener { //pertama tambahkan implements View.OnClickListener ->alt+enter

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        findViewById(R.id.cp).setOnClickListener(this); //kedua ketik in masukan id
        findViewById(R.id.firebase).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {//ketiga buat switch case
        switch (v.getId()){
            case R.id.cp:
                startActivity(new Intent(this, MainActivity.class));
                break;
            case R.id.firebase:
                startActivity(new Intent(this, Firebase.class));
        }

    }
}
