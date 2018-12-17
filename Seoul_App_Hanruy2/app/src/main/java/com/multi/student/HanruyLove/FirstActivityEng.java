package com.multi.student.HanruyLove;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class FirstActivityEng extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firsteng);
    }
    public void tokpop(View v){
        Intent i = new Intent(this,KpopCategoryEng.class);
        startActivityForResult(i,100);
    }
    public void todrama(View v){
        Intent i = new Intent(this,KdramaCategoryEng.class);
        startActivityForResult(i,100);
    }
    public void toenter(View v){
        Intent i = new Intent(this,KtvshowCategoryEng.class);
        startActivityForResult(i,100);
    }
}
