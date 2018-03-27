package com.avdey.skype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SkypeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skype);
    }

    public void onClickActivity(View view) {
        EditText editText = findViewById(R.id.edit_text);
        Intent intent = new Intent(this, IntentActivity.class);
        String text = editText.getText().toString();
        intent.putExtra(IntentActivity.TEXT, text);

        startActivity(intent);


    }

    public void onClickIntent(View view) {
        EditText editText = findViewById(R.id.edit_text);
        String text = editText.getText().toString();
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, text);
        Intent chg = Intent.createChooser(intent, "Метод отправки");

        startActivity(chg);

    }
}
