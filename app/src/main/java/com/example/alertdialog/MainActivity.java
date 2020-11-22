package com.example.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity
{
    AlertDialog.Builder adb;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
}
