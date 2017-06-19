package me.rileywatts.aboardstale;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView mHeaderTextView;
    private EditText mNameEditText;
    private Button mStartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);

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
            Intent intent = new Intent(MainActivity.this, World.class);
        }
    }
}
