package me.rileywatts.aboardstale.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.parceler.Parcels;

import me.rileywatts.aboardstale.R;
import me.rileywatts.aboardstale.models.Player;

public class LoadingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);

        Player player = Parcels.unwrap(getIntent().getParcelableExtra("player"));
        Intent intent = getIntent();
        Integer level = intent.getIntExtra("level", 0);


        Intent onwardIntent = new Intent(LoadingActivity.this, WorldActivity.class);
        onwardIntent.putExtra("level", level);
        onwardIntent.putExtra("player", Parcels.wrap(player));
        startActivity(onwardIntent);
    }
}
