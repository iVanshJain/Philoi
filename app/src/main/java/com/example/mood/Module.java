package com.example.mood;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Module extends AppCompatActivity {

    ImageButton musicbtn,chatbotbtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module);

        musicbtn= (ImageButton)findViewById(R.id.ib_moodmusic);
        chatbotbtn=(ImageButton)findViewById(R.id.ib_chatbot);

        musicbtn.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                Intent intent = new Intent(Module.this, MainActivity.class);
                Module.this.startActivity(intent);
            }


        });

        chatbotbtn.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                Intent intent = new Intent(Module.this, Chatbot.class);
                Module.this.startActivity(intent);
            }


        });





    }
}
