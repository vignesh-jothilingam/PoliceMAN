package com.example.policeman;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.media.MediaPlayer.create;

public class MainActivity extends AppCompatActivity {
    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
    public void plaay(View view){

   //     Toast.makeText(this, "hello", Toast.LENGTH_SHORT).show();
      player  =  MediaPlayer.create(getApplicationContext(),R.raw.siren);
      player.start();

    }
    public void pause(View view){
        player.pause();
    }
    public void stop(View view){
        player.stop();
    }
}
