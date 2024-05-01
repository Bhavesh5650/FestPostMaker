package com.example.postermakerapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class FestivalActivity extends AppCompatActivity {

    ImageView firstImage,secondImage,thirdImage,fourthImage,fifthImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_festival);

        initBinding();

        Intent intent = getIntent();

        int one=intent.getIntExtra("1",0);
        int two=intent.getIntExtra("2",0);
        int three=intent.getIntExtra("3",0);
        int four=intent.getIntExtra("4",0);
        int five=intent.getIntExtra("5",0);

        firstImage.setImageResource(one);
        secondImage.setImageResource(two);
        thirdImage.setImageResource(three);
        fourthImage.setImageResource(four);
        fifthImage.setImageResource(five);

        firstImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent(FestivalActivity.this,PostEditActivity.class);
                intent1.putExtra("ek",one);
                startActivity(intent1);
            }
        });

        secondImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent(FestivalActivity.this,PostEditActivity.class);
                intent1.putExtra("ek",two);
                startActivity(intent1);
            }
        });

        thirdImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent(FestivalActivity.this,PostEditActivity.class);
                intent1.putExtra("ek",three);
                startActivity(intent1);
            }
        });

        fourthImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent(FestivalActivity.this,PostEditActivity.class);
                intent1.putExtra("ek",four);
                startActivity(intent1);
            }
        });

        fifthImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent(FestivalActivity.this,PostEditActivity.class);
                intent1.putExtra("ek",five);
                startActivity(intent1);
            }
        });

    }

    void initBinding()
    {
        firstImage=findViewById(R.id.firstImage);
        secondImage=findViewById(R.id.secondImage);
        thirdImage=findViewById(R.id.thirdImage);
        fourthImage=findViewById(R.id.fourthImage);
        fifthImage=findViewById(R.id.fifthImage);
    }
}