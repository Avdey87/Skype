package com.avdey.skype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class IntentActivity extends AppCompatActivity {

    public static final String TEXT = "text";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);

        TextView text = findViewById(R.id.text);
        Intent intent = getIntent();
        String message = intent.getStringExtra(TEXT);
        text.setText(message);


    }
}
