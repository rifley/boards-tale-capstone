package me.rileywatts.aboardstale.ui;

import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import org.parceler.Parcels;

import me.rileywatts.aboardstale.R;
import me.rileywatts.aboardstale.models.Level;
import me.rileywatts.aboardstale.models.Player;

public class WorldActivity extends AppCompatActivity {
    private Player player;
    public Level levelOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        int level = intent.getIntExtra("level", 0);

        setContentView(R.layout.activity_world);
        player = Parcels.unwrap(getIntent().getParcelableExtra("player"));
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        PlayerNavigationFragment navFragment = PlayerNavigationFragment.newInstance(player, level);
        DialogueFragment dialogueFragment = DialogueFragment.newInstance(player, level);
        PlayerFragment playerFragment = PlayerFragment.newInstance(player, level);
        ft.replace(R.id.navDisplayFrame, navFragment);
        ft.replace(R.id.dialogueDisplayFrame, dialogueFragment);
        ft.replace(R.id.playerDisplayFrame, playerFragment);
        ft.commit();

        Log.v("inside World", player.getName());
    }
}
