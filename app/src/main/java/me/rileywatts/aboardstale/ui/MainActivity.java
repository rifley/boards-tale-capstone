package me.rileywatts.aboardstale.ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.parceler.Parcels;

import me.rileywatts.aboardstale.Constants;
import me.rileywatts.aboardstale.R;
import me.rileywatts.aboardstale.models.Level;
import me.rileywatts.aboardstale.models.Player;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView mHeaderTextView;
    private EditText mNameEditText;
    private Button mStartButton;
//    private SharedPreferences mSharedPreferences;
//    private SharedPreferences.Editor mEditor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN); doesn't appear to do anything
//        mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
//        mEditor = mSharedPreferences.edit();

        mNameEditText = (EditText) findViewById(R.id.playerNameEditText);
        mStartButton = (Button) findViewById(R.id.startGameButton);
        mHeaderTextView = (TextView) findViewById(R.id.headerTextView);
        Typeface ghibliFont = Typeface.createFromAsset(getAssets(), "fonts/ghibli.ttf");
        mHeaderTextView.setTypeface(ghibliFont);
        mStartButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v == mStartButton) {
            String playerName = mNameEditText.getText().toString();
            Player player = new Player(playerName);
            if(playerName.length() == 0) {
                mNameEditText.setError("Player Name Required!");
            }
            else {
                Intent intent = new Intent(MainActivity.this, WorldActivity.class);
                intent.putExtra("player", Parcels.wrap(player));
                startActivity(intent);
            }

        }
    }
//    private void addToSharedPreferences(String userName) {
//        mEditor.putString("userName", userName).apply();
//    }
}
