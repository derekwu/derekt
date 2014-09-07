package com.cotosho.derekt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;


public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        ImageButton rektButton = (ImageButton) findViewById(R.id.getRekt);
        ImageView dontTouch = (ImageView) findViewById(R.id.dontTouch);
        ButtonListener bl = new ButtonListener();
        rektButton.setOnClickListener(bl);
        dontTouch.setOnClickListener(bl);
    }

    private class ButtonListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            Intent i = new Intent(getApplication(), GameOnScreen.class);
            startActivity(i);
        }
    }
}
