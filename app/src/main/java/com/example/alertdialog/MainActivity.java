package com.example.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{
    AlertDialog.Builder adb;
    LinearLayout layout;
    Random rnd;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout=(LinearLayout)findViewById(R.id.layout);
        rnd=new Random();
    }

    public void button1Clicked(View view)
    {
        adb=new AlertDialog.Builder(this);
        adb.setTitle("Message");
        adb.setMessage("This AlertDialog has a message");
        AlertDialog ad=adb.create();
        ad.show();
    }

    public void button2Clicked(View view)
    {
        adb=new AlertDialog.Builder(this);
        adb.setTitle("Message");
        adb.setMessage("This AlertDialog has a message and an image");
        adb.setIcon(R.drawable.image);
        AlertDialog ad=adb.create();
        ad.show();
    }

    public void button3Clicked(View view)
    {
        adb=new AlertDialog.Builder(this);
        adb.setTitle("Message");
        adb.setMessage("This AlertDialog has a message, an image, and a button");
        adb.setIcon(R.drawable.image);
        adb.setPositiveButton("Close", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {

            }
        });
        AlertDialog ad=adb.create();
        ad.show();
    }

    public void button4Clicked(View view)
    {
        adb=new AlertDialog.Builder(this);
        adb.setTitle("Message");
        adb.setMessage("This AlertDialog has a message, an image, and 2 buttons. Do you want to change the background color?");
        adb.setIcon(R.drawable.image);
        adb.setPositiveButton("Random Color", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                layout.setBackgroundColor(rnd.nextInt());
            }
        });
        AlertDialog ad=adb.create();
        ad.show();
    }
}
