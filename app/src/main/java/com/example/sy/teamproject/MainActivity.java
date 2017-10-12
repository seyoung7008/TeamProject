package com.example.sy.teamproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
 static MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 데이터 원본 준비
        ArrayList<MyItem> data = new ArrayList<MyItem>();
        data.add(new MyItem(R.drawable.image1, "엽기떡볶이", "031-979-8592"));
        data.add(new MyItem(R.drawable.image2, "죠스떡볶이", "031-973-1033"));
        data.add(new MyItem(R.drawable.image3, "신전떡볶이", "031-967-2600"));
        data.add(new MyItem(R.drawable.image3, "오빠네떡볶이", "031-908-7749"));

       adapter = new MyAdapter(this, R.layout.item, data);

        //어댑터 연결
        ListView listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View vClicked,
                                    int position, long id) {
                String name = ((MyItem)adapter.getItem(position)).nName;
                Toast.makeText(MainActivity.this, name + " selected",
                        Toast.LENGTH_SHORT).show();

                    //Intent intent = new Intent(getApplicationContext(), ㅜActivity.class);
                  //  startActivity(intent);

            }
        });

    }
}
