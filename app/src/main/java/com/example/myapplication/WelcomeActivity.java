package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.Map;

public class WelcomeActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*Bundle bundle = new Bundle();
        ArrayList list = bundle.getParcelableArrayList("list");
        ArrayList<Map<String, String>> list1 = (ArrayList<Map<String,String>>) list.get(0);

        SimpleAdapter adapter = new SimpleAdapter(this, list1, android.R.layout.simple_list_item_2, new String[]{"account","password"}, new int[]{android.R.id.text1, android.R.id.text2});
        listView.setAdapter(adapter);
*/
        setContentView(R.layout.activity_welcome);
    }


}
