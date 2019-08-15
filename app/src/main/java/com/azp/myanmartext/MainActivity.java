package com.azp.myanmartext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.azp.myanmartext.utils.FontEmbedder;

public class MainActivity extends AppCompatActivity {

    TextView textView, textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.check_typeface);
        textView1 = findViewById(R.id.textview);

        FontEmbedder.force(textView, getString(R.string.uni_text));
        FontEmbedder.force(textView1, getString(R.string.uni_text));
    }
}
