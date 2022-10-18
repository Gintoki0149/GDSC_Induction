package com.example.gdsc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView = findViewById(R.id.GridView);
        ArrayList<gridViewItem> gridViewItems = new ArrayList<gridViewItem>();

        gridViewItems.add(new gridViewItem("Hoyolab Login", R.drawable.hoyolab_login));
        gridViewItems.add(new gridViewItem("Interactive Map", R.drawable.interactive_map));
        gridViewItems.add(new gridViewItem("Redeem Codes", R.drawable.redeem_codes));
        gridViewItems.add(new gridViewItem("Character Guides", R.drawable.character_guide));
        gridViewItems.add(new gridViewItem("Web Events", R.drawable.web_events));
        gridViewItems.add(new gridViewItem("Wish Simulator", R.drawable.wish_simulator));

        gridViewAdapter adapter = new gridViewAdapter(this, gridViewItems);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        Intent intent0 = new Intent(Intent.ACTION_VIEW);
                        intent0.setData(Uri.parse("https://www.hoyolab.com"));
                        startActivity(intent0);
                        break;
                    case 1:
                        Intent intent1 = new Intent(Intent.ACTION_VIEW);
                        intent1.setData(Uri.parse("https://www.mapofgenshin.com"));
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(view.getContext(),RedeemCodes.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(view.getContext(),CharacterGuide.class);
                        intent3.putExtra(CharacterGuide.url,"https://genshin-builds.com/characters");
                        startActivity((intent3));
                        break;
                    case 4:
                        Intent intent4 = new Intent(Intent.ACTION_VIEW);
                        intent4.setData(Uri.parse("https://webstatic-sea.mihoyo.com/ys/event/e20210624-boat/index.html?utm_source=officialweb&utm_medium=news"));
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(Intent.ACTION_VIEW);
                        intent5.setData(Uri.parse("https://gi-wish-simulator.uzairashraf.dev/"));
                        startActivity(intent5);
                }
            }
        });
    }
}