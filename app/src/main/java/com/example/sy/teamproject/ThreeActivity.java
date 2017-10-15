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

public class ThreeActivity extends AppCompatActivity{
    static MyAdapter adapter;
    static String menu31= "신전떡볶이";
    static String menu32 = "치즈떡볶이";
    static String menu33 = "오뎅튀김";
    static String menu34 = "신전김밥";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 데이터 원본 준비
        ArrayList<MyItem> data = new ArrayList<MyItem>();
        data.add(new MyItem(R.drawable.image31, "신전떡볶이", "1인분 2500원 "));
        data.add(new MyItem(R.drawable.image32, "치즈떡볶이", "1인분 3500원"));
        data.add(new MyItem(R.drawable.image33, "오뎅튀김", "6개 1500원"));
        data.add(new MyItem(R.drawable.image34, "신전김밥", "2000원 "));


        adapter = new MyAdapter(this, R.layout.item, data);

        //어댑터 연결
        ListView listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View vClicked,
                                    int position, long id) {

                String name = ((MyItem)adapter.getItem(position)).nName;
                if(menu31 == name){
                    Intent intent = new Intent(getApplicationContext(), threeByoneActivity.class);
                    startActivity(intent);
                }
                else if(menu32 == name){
                    Intent intent = new Intent(getApplicationContext(), threeBytwoActivity.class);
                    startActivity(intent);
                }
                else if (menu33 == name){
                    Intent intent = new Intent(getApplicationContext(), threeBythreeActivity.class);
                    startActivity(intent);
                }

                else {
                    Intent intent = new Intent(getApplicationContext(), threeByfourActivity.class);
                    startActivity(intent);
                }


            }
        });

    }
}
