package com.example.sy.teamproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class OneActivity extends AppCompatActivity {
    static MyAdapter adapter;
    static String menu1= "엽기떡볶이";
    static String menu2 = "국물닭발";
    static String menu3 = "오돌뼈";
    static String menu4 = "주먹김밥";
    static String menu5 = "계란찜";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        // 데이터 원본 준비
        ArrayList<MyItem> data = new ArrayList<MyItem>();
        data.add(new MyItem(R.drawable.image11, "엽기떡볶이", "14000원"));
        data.add(new MyItem(R.drawable.image12, "국물닭발", "15000원"));
        data.add(new MyItem(R.drawable.image13, "오돌뼈", "14000원"));
        data.add(new MyItem(R.drawable.image14, "주먹김밥", "2000원 "));
        data.add(new MyItem(R.drawable.image15, "계란찜", "2000원"));

        adapter = new MyAdapter(this, R.layout.item, data);
        Button btn = (Button)findViewById(R.id.buttonDialActivity);

        btn.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {

                Intent implicit_intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:114"));

                startActivity(implicit_intent);

            }

        });

        //어댑터 연결
        ListView listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View vClicked,
                                    int position, long id) {
                String name = ((MyItem)adapter.getItem(position)).nName;
                if(menu1 == name){
                    Intent intent = new Intent(getApplicationContext(), oneByoneActivity.class);
                    startActivity(intent);
                }
                else if(menu2 == name){
                    Intent intent = new Intent(getApplicationContext(), oneBytwoActivity.class);
                    startActivity(intent);
                }
                else if (menu3 == name){
                    Intent intent = new Intent(getApplicationContext(), oneBythreeActivity.class);
                    startActivity(intent);
                }

                else if(menu4==name){
                    Intent intent = new Intent(getApplicationContext(), oneByfourActivity.class);
                    startActivity(intent);
                }
                else {
                    Intent intent = new Intent(getApplicationContext(), oneByfiveActivity.class);
                    startActivity(intent);
                }


            }
        });

    }
    }

