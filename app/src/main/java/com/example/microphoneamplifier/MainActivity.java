package com.example.microphoneamplifier;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        TextView tv = findViewById(R.id.sample_text);
        tv.setText("Microphone Amplifier - Ready to boost your voice!");
    }
}