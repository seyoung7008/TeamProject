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

public class oneByoneActivity extends AppCompatActivity{
    static MyAdapter adapter;
    static String onemenu = "엽기떡볶이";
    static String twomenu = "죠스떡볶이";
    static String threemenu = "신전떡볶이";
    static String fourmenu = "오빠네떡볶이";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);

    }

}
