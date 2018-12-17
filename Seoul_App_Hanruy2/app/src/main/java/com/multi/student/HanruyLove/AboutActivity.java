package com.multi.student.HanruyLove;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;

import static com.multi.student.HanruyLove.AddAdapter.newname;

public class AboutActivity extends AppCompatActivity {
    TextView name, about, address, tel, textaddress;
    SQLiteDatabase db;
    static String title;
    String str;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        name = (TextView) findViewById(R.id.name);
        about = (TextView) findViewById(R.id.about);
        address = (TextView) findViewById(R.id.address);
        tel = (TextView) findViewById(R.id.tel);
        textaddress = (TextView) findViewById(R.id.textaddress);
        Intent intent = getIntent();
        name.setText(intent.getStringExtra("name"));
        title=name.getText().toString();

        textaddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse(str));
                startActivity(i);

            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        createDB();
//        createTable();
//        insertData();
        selectData();
    }

    public void createDB() {
        db = openOrCreateDatabase
                ("member.db", Context.MODE_PRIVATE, null);
    }

    public void selectData() {
        String q = "select *from " +newname +" where _name='"+title+"' ";
        Cursor cursor = db.rawQuery(q, null);
        if (cursor != null) {
//            실제데이터를 가르킴
            while (cursor.moveToNext()/*다음 투플로 넘어감*/) {
//                table에서 각 어트리뷰트에 넣음


                String name = cursor.getString(1);
                about.setText(cursor.getString(2));
                address.setText(cursor.getString(3));
                tel.setText(cursor.getString(4));
                str=cursor.getString(5);
                textaddress.setText(cursor.getString(5));



            }
        }
    }


}
