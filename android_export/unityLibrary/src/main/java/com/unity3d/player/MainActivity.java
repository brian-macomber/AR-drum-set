package com.unity3d.player;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button

                LaunchUnityPlayerActivity();



            }
        });
    }


    private void LaunchUnityPlayerActivity(){
        Intent UnityPlayerActivity = new Intent(MainActivity.this, com.unity3d.player.UnityPlayerActivity.class);

        startActivity(UnityPlayerActivity);
    }

}