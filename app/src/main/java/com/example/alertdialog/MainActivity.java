package com.example.alertdialog;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Color;
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

    /**
     * This method will run when button 1 is clicked. It shows an AlertDialog with a message.
     * @param view
     */

    public void button1Clicked(View view)
    {
        adb=new AlertDialog.Builder(this);
        adb.setTitle("Message");
        adb.setMessage("This AlertDialog has a message");
        AlertDialog ad=adb.create();
        ad.show();
    }

    /**
     * This method will run when button 2 is clicked. It shows an AlertDialog with a message and an icon.
     * @param view
     */

    public void button2Clicked(View view)
    {
        adb=new AlertDialog.Builder(this);
        adb.setTitle("Message");
        adb.setMessage("This AlertDialog has a message and an image");
        adb.setIcon(R.drawable.image);
        AlertDialog ad=adb.create();
        ad.show();
    }

    /**
     * This method will run when button 3 is clicked. It shows an AlertDialog with a message, an icon, and a close button
     * @param view
     */

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

    /**
     * This method will run when button 4 is clicked. It shows an AlertDialog with a message, an icon, and 2 buttons.
     * The first one changes the background color to a random color.
     * The second one closes the dialog
     * @param view
     */

    public void button4Clicked(View view)
    {
        adb=new AlertDialog.Builder(this);
        adb.setTitle("Message");
        adb.setMessage("This AlertDialog has a message, an image, and 2 buttons. Do you want to change the background color?");
        adb.setIcon(R.drawable.image);
        adb.setNegativeButton("Random Color", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                layout.setBackgroundColor(rnd.nextInt());
            }
        });
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

    /**
     * This method will run when button 5 is clicked. It shows an AlertDialog with a message, an icon, and 2 buttons.
     * The first one changes the background color to white.
     * The second one changes the background color to a random color.
     * The first one closes the dialog.
     * @param view
     */

    public void button5Clicked(View view)
    {
        adb=new AlertDialog.Builder(this);
        adb.setTitle("Message");
        adb.setMessage("This AlertDialog has a message, an image, and 2 buttons. Do you want to change the background color?");
        adb.setIcon(R.drawable.image);
        adb.setNegativeButton("Random Color", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                layout.setBackgroundColor(rnd.nextInt());
            }
        });
        adb.setPositiveButton("Close", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {

            }
        });
        adb.setNeutralButton("White", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                layout.setBackgroundColor(Color.WHITE);
            }
        });
        AlertDialog ad=adb.create();
        ad.show();
    }
}
