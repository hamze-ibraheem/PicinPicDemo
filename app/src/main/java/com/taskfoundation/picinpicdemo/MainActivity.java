package com.taskfoundation.picinpicdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goPicInPicMode(View view) {
        enterPictureInPictureMode();
    }

    @Override
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode, Configuration newConfig) {
        super.onPictureInPictureModeChanged(isInPictureInPictureMode, newConfig);
        TextView textView = findViewById(R.id.textView);
        if (isInPictureInPictureMode) {
            getSupportActionBar().hide();
            findViewById(R.id.button).setVisibility(View.GONE);
            textView.setText("PIP MODE");
        } else {
            getSupportActionBar().show();
            findViewById(R.id.button).setVisibility(View.VISIBLE);
            textView.setText("HELLO WORLD!");
        }
    }
}