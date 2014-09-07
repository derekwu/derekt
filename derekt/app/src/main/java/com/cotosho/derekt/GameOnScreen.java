package com.cotosho.derekt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;


public class GameOnScreen extends Activity {

    private CountDownTimer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_on_screen);

        Button gameOn = (Button) findViewById(R.id.gameOn);
        timer = new CountDownTimer(5000, 1000) {
            @Override
            public void onTick(long l) {
            }

            @Override
            public void onFinish() {
                Intent i = new Intent(getApplication(), GameWonScreen.class);
                startActivity(i);
                finish();
            }
        }.start();

        gameOn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplication(), GameOverScreen.class);
                timer.cancel();
                startActivity(i);
                finish();
            }
        });
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    public void onDestroy() {
        super.onDestroy();
    }
}
