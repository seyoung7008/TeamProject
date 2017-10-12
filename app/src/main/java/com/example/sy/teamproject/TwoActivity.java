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

public class TwoActivity extends AppCompatActivity {
    static MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 데이터 원본 준비
        ArrayList<MyItem> data = new ArrayList<MyItem>();
        data.add(new MyItem(R.drawable.image21, "매운떡볶이", "1인분 3000원 "));
        data.add(new MyItem(R.drawable.image22, "치즈떡볶이", "1인분 4500원"));
        data.add(new MyItem(R.drawable.image23, "수제튀김", "5개 3000원"));
        data.add(new MyItem(R.drawable.image24, "진짜찰순대", "3500원 "));
        data.add(new MyItem(R.drawable.image25, "수제/부산어묵", "3개 2000원"));

        adapter = new MyAdapter(this, R.layout.item, data);

        //어댑터 연결
        ListView listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View vClicked,
                                    int position, long id) {

                Intent intent = new Intent(getApplicationContext(), OneActivity.class);
                startActivity(intent);

            }
        });

    }
}
