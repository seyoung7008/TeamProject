package com.example.sy.teamproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by SY on 2017-10-13.
 */

public class FourActivity extends AppCompatActivity {
    static MyAdapter adapter;
    static String menu41= "떡볶이(소)";
    static String menu42 = "떡볶이(중)";
    static String menu43 = "모듬튀김";
    static String menu44 = "사이드메뉴";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 데이터 원본 준비
        ArrayList<MyItem> data = new ArrayList<MyItem>();
        data.add(new MyItem(R.drawable.image41, "떡볶이(소)", "2인분 8000원 "));
        data.add(new MyItem(R.drawable.image44, "떡볶이(중)", "3~4인분 14000원"));
        data.add(new MyItem(R.drawable.image42, "모듬튀김", "4000원"));
        data.add(new MyItem(R.drawable.image43, "사이드메뉴", "1000원~3000원 "));


        adapter = new MyAdapter(this, R.layout.item, data);

        //어댑터 연결
        ListView listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View vClicked,
                                    int position, long id) {

                String name = ((MyItem)adapter.getItem(position)).nName;
                if(menu41 == name){
                    Intent intent = new Intent(getApplicationContext(), fourByoneActivity.class);
                    startActivity(intent);
                }
                else if(menu42 == name){
                    Intent intent = new Intent(getApplicationContext(), fourBytwoActivity.class);
                    startActivity(intent);
                }
                else if (menu43 == name){
                    Intent intent = new Intent(getApplicationContext(), fourBythreeActivity.class);
                    startActivity(intent);
                }

                else {
                    Intent intent = new Intent(getApplicationContext(), fourByfourActivity.class);
                    startActivity(intent);
                }


            }
        });
    }
}
