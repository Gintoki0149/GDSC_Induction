package com.example.gdsc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class RedeemCodes extends AppCompatActivity {
    String [] redeemcodelist = new String[RedeemCodeList.redeemcodes.length];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_redeem_codes);
        ListView listView = findViewById(R.id.listView);
        for(int k = 0;k<redeemcodelist.length;k++){
            redeemcodelist[k] = RedeemCodeList.redeemcodes[k].getName();
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<>(RedeemCodes.this, android.R.layout.simple_list_item_1,redeemcodelist);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(view.getContext(),"This redeem code is "+RedeemCodeList.redeemcodes[i].getStatus(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}