package com.example.postermakerapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    CardView diwaliFest,ganeshChaturthiFest,holiFest,navratriFest,dussehraFest,janmastamiFest,shivratriFest,makarsankrantiFest,rakshaBandhanFest,ramnavamiFest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initBinding();

        getOnBackPressedDispatcher().addCallback(MainActivity.this, new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {

                alertDialog();
            }
        });

        diwaliFest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,FestivalActivity.class);
                intent.putExtra("1",R.drawable.diwali1);
                intent.putExtra("2",R.drawable.diwali2);
                intent.putExtra("3",R.drawable.diwali3);
                intent.putExtra("4",R.drawable.diwali4);
                intent.putExtra("5",R.drawable.diwali5);
                startActivity(intent);
            }
        });

        ganeshChaturthiFest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,FestivalActivity.class);
                intent.putExtra("1",R.drawable.ganesha1);
                intent.putExtra("2",R.drawable.ganesha2);
                intent.putExtra("3",R.drawable.ganesha3);
                intent.putExtra("4",R.drawable.ganesha4);
                intent.putExtra("5",R.drawable.ganesha5);
                startActivity(intent);
            }
        });

        holiFest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,FestivalActivity.class);
                intent.putExtra("1",R.drawable.holi1);
                intent.putExtra("2",R.drawable.holi2);
                intent.putExtra("3",R.drawable.holi3);
                intent.putExtra("4",R.drawable.holi4);
                intent.putExtra("5",R.drawable.holi5);
                startActivity(intent);
            }
        });

        navratriFest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,FestivalActivity.class);
                intent.putExtra("1",R.drawable.navratri1);
                intent.putExtra("2",R.drawable.navratri2);
                intent.putExtra("3",R.drawable.navratri3);
                intent.putExtra("4",R.drawable.navratri4);
                intent.putExtra("5",R.drawable.navratri5);
                startActivity(intent);
            }
        });

        dussehraFest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,FestivalActivity.class);
                intent.putExtra("1",R.drawable.dussehra1);
                intent.putExtra("2",R.drawable.dussehra2);
                intent.putExtra("3",R.drawable.dussehra3);
                intent.putExtra("4",R.drawable.dussehra4);
                intent.putExtra("5",R.drawable.dussehra5);
                startActivity(intent);
            }
        });

        janmastamiFest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,FestivalActivity.class);
                intent.putExtra("1",R.drawable.janmastami1);
                intent.putExtra("2",R.drawable.janmastami2);
                intent.putExtra("3",R.drawable.janmastami3);
                intent.putExtra("4",R.drawable.janmastami4);
                intent.putExtra("5",R.drawable.janmastami5);
                startActivity(intent);
            }
        });

        shivratriFest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,FestivalActivity.class);
                intent.putExtra("1",R.drawable.shivratri1);
                intent.putExtra("2",R.drawable.shivratri2);
                intent.putExtra("3",R.drawable.shivratri3);
                intent.putExtra("4",R.drawable.shivratri4);
                intent.putExtra("5",R.drawable.shivratri5);
                startActivity(intent);
            }
        });

        makarsankrantiFest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,FestivalActivity.class);
                intent.putExtra("1",R.drawable.makar_shankranti1);
                intent.putExtra("2",R.drawable.makar_shankranti2);
                intent.putExtra("3",R.drawable.makar_shankranti3);
                intent.putExtra("4",R.drawable.makar_shankranti4);
                intent.putExtra("5",R.drawable.makar_shankranti5);
                startActivity(intent);
            }
        });

        rakshaBandhanFest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,FestivalActivity.class);
                intent.putExtra("1",R.drawable.raksha_bandhan1);
                intent.putExtra("2",R.drawable.raksha_bandhan2);
                intent.putExtra("3",R.drawable.raksha_bandhan3);
                intent.putExtra("4",R.drawable.raksha_bandhan4);
                intent.putExtra("5",R.drawable.raksha_bandhan5);
                startActivity(intent);
            }
        });

        ramnavamiFest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,FestivalActivity.class);
                intent.putExtra("1",R.drawable.ram_navami1);
                intent.putExtra("2",R.drawable.ram_navami2);
                intent.putExtra("3",R.drawable.ram_navami3);
                intent.putExtra("4",R.drawable.ram_navami4);
                intent.putExtra("5",R.drawable.ram_navami5);
                startActivity(intent);
            }
        });
    }

    void initBinding()
    {
        diwaliFest=findViewById(R.id.diwaliFest);
        ganeshChaturthiFest=findViewById(R.id.ganeshChaturthiFest);
        holiFest=findViewById(R.id.holiFest);
        navratriFest=findViewById(R.id.navratriFest);
        dussehraFest=findViewById(R.id.dussehraFest);
        janmastamiFest=findViewById(R.id.janmastamiFest);
        shivratriFest=findViewById(R.id.shivratriFest);
        makarsankrantiFest=findViewById(R.id.makarsankrantiFest);
        rakshaBandhanFest=findViewById(R.id.rakshaBandhanFest);
        ramnavamiFest=findViewById(R.id.ramnavamiFest);
    }

    void alertDialog()
    {
        AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
        dialog.setCancelable(false);
        dialog.setTitle("Festival Post Maker");
        dialog.setMessage("Are You Sure To Exit ?");
        dialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        dialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }



}