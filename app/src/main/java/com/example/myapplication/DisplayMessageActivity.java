package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DisplayMessageActivity extends AppCompatActivity {

    private DBManager mgr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
    }

    public void loginIn(View view){
        /*ArrayList list = new ArrayList();

        EditText accountEditText = (EditText) findViewById(R.id.accountEdittext);
        String accountText = accountEditText.getText().toString();
        EditText passwordEditText = (EditText)findViewById(R.id.pwdEdittext);
        String passwordText = passwordEditText.getText().toString();

        List<User> users = mgr.query();
        ArrayList<Map<String, String>> list1 = new ArrayList<Map<String, String>>();
        for (User user : users){
            if (user.account.toString() == accountText && user.password.toString() == passwordText){
                HashMap<String, String> map = new HashMap<>();
                map.put("account", user.account);
                map.put("password", user.password );
                list1.add(map);
            }
        }*/
        //list.add(list1);
        Intent intent = new Intent(this, WelcomeActivity.class);
       // Bundle bundle = new Bundle();
       // bundle.putParcelableArrayList("list", list);
        startActivity(intent);
    }

}
