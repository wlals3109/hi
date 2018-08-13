package com.example.list2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Data data1 = new Data("전자회로","이시우");
        Data data2 = new Data("네트워크 보안","왕한호");
        Data data3 = new Data("dsp설계","장영범");
        Data data4 = new Data("전공과 창업","유현중");



        ArrayList<Data> userlist = new ArrayList<>();
        userlist.add(data1);
        userlist.add(data2);
        userlist.add(data3);
        userlist.add(data4);

        MajorAdapter adapter = new MajorAdapter(userlist,this);
        ListView listView = findViewById(R.id.MajorCatalog);
        listView.setAdapter(adapter);
    }
}
