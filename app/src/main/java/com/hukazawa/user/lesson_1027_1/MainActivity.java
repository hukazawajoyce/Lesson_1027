package com.hukazawa.user.lesson_1027_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView autc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        autc = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        String[] data = {"Lion","Leon","Lizard","Lemon","LoL"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,
                                        android.R.layout.simple_spinner_item, data);
        autc.setThreshold(1);
        autc.setAdapter(adapter);
    }

    public void clickquik(View v)
    {
        Toast.makeText(MainActivity.this, autc.getText().toString(),
                Toast.LENGTH_SHORT).show();
    }

}
