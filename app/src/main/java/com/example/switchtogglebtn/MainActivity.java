package com.example.switchtogglebtn;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    Switch swtch;
    ToggleButton tb;
    ImageView iv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        swtch = (Switch) findViewById(R.id.swBtn);
        tb = (ToggleButton) findViewById(R.id.tb);
        iv = (ImageView) findViewById(R.id.iv);
    }

    public void clicked(View view) {
        boolean checkSwitch = swtch.isChecked();
        boolean checkToggelButton = tb.isChecked();

        if(checkSwitch && checkToggelButton)
        {
            iv.setBackgroundColor(Color.RED);
        }
        else if(checkSwitch && !checkToggelButton)
        {
            iv.setBackgroundColor(Color.BLUE);
        }
        else if(!checkSwitch && checkToggelButton)
        {
            iv.setBackgroundColor(Color.GREEN);
        }
        else
        {
            iv.setBackgroundColor(Color.CYAN);
        }
    }
}