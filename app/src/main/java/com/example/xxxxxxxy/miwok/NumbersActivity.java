package com.example.xxxxxxxy.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("one","一"));
        words.add(new Word("two","二"));
        words.add(new Word("three","三"));
        words.add(new Word("four","四"));
        words.add(new Word("five","五"));
        words.add(new Word("six","六"));
        words.add(new Word("seven","七"));
        words.add(new Word("eight","八"));
        words.add(new Word("nine","九"));
        words.add(new Word("ten","十"));

        WordAdapter adapter =
                new WordAdapter(this,words);
        ListView listView = (ListView)findViewById(R.id.listview);
        listView.setAdapter(adapter);
    }
}
