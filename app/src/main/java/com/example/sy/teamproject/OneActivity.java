package com.example.sy.teamproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class OneActivity extends AppCompatActivity {
    static MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 데이터 원본 준비
        ArrayList<MyItem> data = new ArrayList<MyItem>();
        data.add(new MyItem(R.drawable.image11, "OneActivity", "14000원"));
        data.add(new MyItem(R.drawable.image12, "국물닭발", "15000원"));
        data.add(new MyItem(R.drawable.image13, "오돌뼈", "14000원"));
        data.add(new MyItem(R.drawable.image14, "주먹김밥", "2000원 "));
        data.add(new MyItem(R.drawable.image15, "계란찜", "2000원"));

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
