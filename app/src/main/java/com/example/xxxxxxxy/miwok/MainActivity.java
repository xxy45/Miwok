package com.example.xxxxxxxy.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView numbers_view = (TextView)findViewById(R.id.numbers);
        //匿名类
        numbers_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent number_intent = new Intent(MainActivity.this,NumbersActivity.class );
                startActivity(number_intent);
            }
        });

        TextView family_view = (TextView)findViewById(R.id.family);
        //匿名类
        family_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent family_intent = new Intent(MainActivity.this,FamilyActivity.class );
                startActivity(family_intent);
            }
        });

        TextView colors_view = (TextView)findViewById(R.id.colors);
        //匿名类
        colors_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent colors_intent = new Intent(MainActivity.this,ColorsActivity.class );
                startActivity(colors_intent);
            }
        });

        TextView phrases_view = (TextView)findViewById(R.id.phrases);
        //匿名类
        phrases_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phrases_intent = new Intent(MainActivity.this,PhrasesActivity.class );
                startActivity(phrases_intent);
            }
        });
    }


}
