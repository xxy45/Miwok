package com.example.xxxxxxxy.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("father","爸爸"));
        words.add(new Word("mother","妈妈"));
        words.add(new Word("brother","兄弟"));
        words.add(new Word("sister","姐妹"));
        words.add(new Word("uncle","叔叔"));
        words.add(new Word("auntie","阿姨"));
        words.add(new Word("grandfather","祖父/外祖父"));
        words.add(new Word("grandmother","祖母/外祖母"));
        words.add(new Word("son","儿子"));
        words.add(new Word("daughter","女儿"));

        WordAdapter adapter =
                new WordAdapter(this,words);
        ListView listView = (ListView)findViewById(R.id.listview);
        listView.setAdapter(adapter);
    }
}
