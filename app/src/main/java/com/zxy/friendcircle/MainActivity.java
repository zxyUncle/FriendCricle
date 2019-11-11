package com.zxy.friendcircle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
/**
 * Created by zxy on 2019/11/10 15:13
 * ******************************************
 * * Main
 * ******************************************
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onFriendCircle(View view) {
        startActivity(new Intent(this,FriendCircleActivity.class));
    }
}
