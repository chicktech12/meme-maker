package com.example.hlupico.mememaker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setElevation(0f);  /** Step 1 - remove automatic action bar shadow */
        TextView getStartedText = (TextView) findViewById(R.id.get_started_text);
        getStartedText.setText("Get Started!");
        getStartedText.setTextColor(getResources().getColor(android.R.color.holo_purple));

        ImageButton imageButton = (ImageButton) findViewById(R.id.new_meme_button);
        View.OnClickListener imageClickListener = getImageButtonOnClick();
        imageButton.setOnClickListener(imageClickListener);
    }

    private View.OnClickListener getImageButtonOnClick() {
        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Show toast message
                Toast.makeText(MainActivity.this, "you clicked this button!", Toast.LENGTH_SHORT).show();

                //Go to NewMemeActivity
                Intent intent = new Intent(MainActivity. this, NewMemeActivity.class);
                startActivity(intent);
            }
        };

        return clickListener;
    }
}

