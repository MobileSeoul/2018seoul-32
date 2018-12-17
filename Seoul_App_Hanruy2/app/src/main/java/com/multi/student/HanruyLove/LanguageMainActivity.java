package com.multi.student.HanruyLove;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LanguageMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language_main);
    }
    public void tokorea(View v){
        Intent i = new Intent(this,FirstActivity.class);
        startActivityForResult(i,100);
    }
    public void tojapan(View v){
        Intent i = new Intent(this,FirstActivityJpn.class);
        startActivityForResult(i,100);
    }
    public void tochinese(View v){
        Intent i = new Intent(this,FirstActivityCn.class);
        startActivityForResult(i,100);
    }
    public void toenglish(View v){
        Intent i = new Intent(this,FirstActivityEng.class);
        startActivityForResult(i,100);
    }
}
