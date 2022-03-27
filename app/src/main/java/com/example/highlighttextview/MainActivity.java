package com.example.highlighttextview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BgColorTextView textView = findViewById(R.id.text);
        textView.setText(getString(R.string.text_sample));
    }
}
