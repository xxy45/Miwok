package com.example.xxxxxxxy.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Have you eaten?","吃了么"));
        words.add(new Word("Are you hungry?","饿了么"));
        words.add(new Word("Go to the restaurant","去餐厅"));
        words.add(new Word("Eat a big meal","大吃一顿"));
        words.add(new Word("I eat, you pay","我吃饭，你买单"));
        words.add(new Word("Have fun","玩的开心"));


        WordAdapter adapter =
                new WordAdapter(this,words);
        ListView listView = (ListView)findViewById(R.id.listview);
        listView.setAdapter(adapter);
    }
}
