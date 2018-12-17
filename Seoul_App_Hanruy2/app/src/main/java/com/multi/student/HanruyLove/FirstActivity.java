package com.multi.student.HanruyLove;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }
    public void tokpop(View v){
        Intent i = new Intent(this,KpopCategory.class);
        startActivityForResult(i,100);
    }
    public void todrama(View v){
        Intent i = new Intent(this,KdramaCategory.class);
        startActivityForResult(i,100);
    }
    public void toenter(View v){
        Intent i = new Intent(this,KtvshowCategory.class);
        startActivityForResult(i,100);
    }
}
