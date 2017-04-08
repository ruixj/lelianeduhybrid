package com.xrui.webviewincordova;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FirstActivity extends Activity {
    private FirstActivity _this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        _this = this;
    }

    public void startActivityB(View v){
        Intent intent=new Intent(_this,MainActivity.class);
        startActivity(intent);
    }
}
