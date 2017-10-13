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
    static String onemenu = "엽기떡볶이";
    static String twomenu = "국물닭발";
    static String threemenu = "오돌뼈";
    static String fourmenu = "주먹김밥";
    static String fivemenu = "계란찜";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 데이터 원본 준비
        ArrayList<MyItem> data = new ArrayList<MyItem>();
        data.add(new MyItem(R.drawable.image11, "엽기떡볶이", "14000원"));
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
                String name = ((MyItem)adapter.getItem(position)).nName;
                if(onemenu == name){
                    Intent intent = new Intent(getApplicationContext(), oneByoneActivity.class);
                    startActivity(intent);
                }
                else if(twomenu == name){
                    Intent intent = new Intent(getApplicationContext(), TwoActivity.class);
                    startActivity(intent);
                }
                else if (threemenu == name){
                    Intent intent = new Intent(getApplicationContext(), ThreeActivity.class);
                    startActivity(intent);
                }

                else{
                    Intent intent = new Intent(getApplicationContext(), FourActivity.class);
                    startActivity(intent);
                }


            }
        });

    }
    }

