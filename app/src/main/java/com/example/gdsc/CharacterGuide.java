package com.example.gdsc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CharacterGuide extends AppCompatActivity {
    public static String url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        url = getIntent().getStringExtra(url);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_guide);
        ListView listView = findViewById(R.id.characterlist);
        ArrayAdapter<String> adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.characterlist));
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String finalurl = url.concat("/").concat(getResources().getStringArray(R.array.characterlist)[i]);
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(finalurl));
                startActivity(intent);
            }
        });
    }
}