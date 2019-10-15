package com.example.imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView messenger, skype, youtube;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        messenger = findViewById(R.id.messenger_id);
        skype = findViewById(R.id.skype_id);
        youtube = findViewById(R.id.youtube_id);

        messenger.setOnClickListener(this);
        skype.setOnClickListener(this);
        youtube.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.messenger_id){
            Toast.makeText(MainActivity.this, "Messenger", Toast.LENGTH_SHORT).show();
        }
        if (v.getId()==R.id.skype_id){
            Toast.makeText(MainActivity.this, "Skype", Toast.LENGTH_SHORT).show();
        }
        if (v.getId()==R.id.youtube_id){
            Toast.makeText(MainActivity.this, "YouTube", Toast.LENGTH_SHORT).show();
        }
    }
}
