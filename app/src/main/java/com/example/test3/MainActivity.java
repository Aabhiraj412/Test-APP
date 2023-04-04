package com.example.test3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    Button btn;
    FrameLayout layout;
    ImageView image;

    Random random;

    String url;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        layout = findViewById(R.id.background);
        image = findViewById(R.id.image_view);
        Picasso picasso = Picasso.get();
        random = new Random();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int color = Color.argb(255, random.nextInt(256), random.nextInt(256),
                        random.nextInt(256));

                layout.setBackgroundColor(color);

                url = "https://source.unsplash.com/random";

                Picasso.get().load(url).into(image);

            }
        });
    }
}