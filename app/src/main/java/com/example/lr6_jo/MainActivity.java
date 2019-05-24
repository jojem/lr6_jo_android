package com.example.lr6_jo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onBtnClick(findViewById(R.id.list));
    }

    public void onBtnClick(View v) {
        String[] array = getResources().getStringArray(R.array.stringArray);
        ArrayAdapter<String> adapter = new ArrayAdapter(getApplicationContext(),
                android.R.layout.simple_list_item_1, array);
        ((ListView)findViewById(R.id.list)).setAdapter(adapter);
        ((ListView)findViewById(R.id.list)).setOnClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id)
            {
                ((TextView)findViewById(R.id.forText)).setText(String.valueOf(
                        parent.getItemAtPosition(position)));
            }
        });

    }
}
