package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.CursorWrapper;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.SupportActionModeWrapper;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.SimpleCursorAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyActivity extends AppCompatActivity {
    /*public final static String EXTRA_MESSAGE = "com.example.myapplication.MESSAGE";*/

    private DBManager mgr;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        listView = (ListView) findViewById(R.id.listView);
        mgr = new DBManager(this);

    }

    protected void onDestroy(){
        super.onDestroy();
        mgr.closeDB();
    }

    public void signUpUser(View view){
        EditText editAccountText = (EditText) findViewById(R.id.accountEdittext);
        String account = editAccountText.getText().toString();
        EditText editPasswordText = (EditText) findViewById(R.id.pwdEdittext);
        String password = editPasswordText.getText().toString();

        ArrayList<User> users = new ArrayList<User>();

        User user = new User(account,password);
        users.add(user);

        mgr.add(users);

        Intent intent = new Intent(this, DisplayMessageActivity.class);
        startActivity(intent);
    }

    public void query(View view){
        List<User> users = mgr.query();
        ArrayList<Map<String, String>> list = new ArrayList<Map<String, String>>();
        for (User user : users){
            HashMap<String, String> map = new HashMap<>();
            map.put("account", user.account);
            map.put("password", user.password );
            list.add(map);
        }

        SimpleAdapter adapter = new SimpleAdapter(this, list, android.R.layout.simple_list_item_2, new String[]{"account","password"}, new int[]{android.R.id.text1, android.R.id.text2});
        listView.setAdapter(adapter);
    }


    public void checkSignUp(View view){
        Intent intent = new Intent(this,DisplayMessageActivity.class);
        startActivity(intent);
    }
}
