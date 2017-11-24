package com.example.xxxxxxxy.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("red","红"));
        words.add(new Word("green","绿"));
        words.add(new Word("blue","蓝"));
        words.add(new Word("yellow","黄"));
        words.add(new Word("brown","棕"));
        words.add(new Word("gray","灰"));
        words.add(new Word("black","黑"));
        words.add(new Word("white","白"));
        words.add(new Word("orange","橙"));


        WordAdapter adapter =
                new WordAdapter(this,words);
        ListView listView = (ListView)findViewById(R.id.listview);
        listView.setAdapter(adapter);
    }
}
