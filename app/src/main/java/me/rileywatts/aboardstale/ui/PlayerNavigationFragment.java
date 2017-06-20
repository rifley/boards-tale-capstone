package me.rileywatts.aboardstale.ui;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.Toast;

import org.parceler.Parcels;

import java.util.List;

import me.rileywatts.aboardstale.Constants;
import me.rileywatts.aboardstale.R;
import me.rileywatts.aboardstale.models.Level;
import me.rileywatts.aboardstale.models.Player;

/**
 * A simple {@link Fragment} subclass.
 */
public class PlayerNavigationFragment extends Fragment implements View.OnClickListener{
    private ImageButton mUpButton;
    private ImageButton mDownButton;
    private ImageButton mLeftButton;
    private ImageButton mRightButton;
    private Context mContext;
    private Player mPlayer;
    private Level currentLevel;

    public static PlayerNavigationFragment newInstance(Player player, int level) {
        PlayerNavigationFragment playerNavigationFragment = new PlayerNavigationFragment();
        Bundle args = new Bundle();
        args.putParcelable("player", Parcels.wrap(player));
        args.putInt("level", level);
        playerNavigationFragment.setArguments(args);
        return playerNavigationFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPlayer = Parcels.unwrap(getArguments().getParcelable("player"));
        int level = getArguments().getInt("level", 0);
        currentLevel = Constants.Levels.get(level);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_player_navigation, container, false);
        mUpButton = (ImageButton) v.findViewById(R.id.upArrowImageButton);
        mDownButton = (ImageButton) v.findViewById(R.id.downArrowImageButton);
        mLeftButton = (ImageButton) v.findViewById(R.id.leftArrowImageButton);
        mRightButton = (ImageButton) v.findViewById(R.id.rightArrowImageButton);
        mContext = getActivity();
        if(currentLevel.getAdjacentNorth() == null) {
            mUpButton.setVisibility(View.INVISIBLE);
        }
        if(currentLevel.getAdjacentEast() == null) {
            mRightButton.setVisibility(View.INVISIBLE);
        }
        if(currentLevel.getAdjacentSouth() == null) {
            mDownButton.setVisibility(View.INVISIBLE);
        }
        if(currentLevel.getAdjacentWest() == null) {
            mLeftButton.setVisibility(View.INVISIBLE);
        }

        mUpButton.setOnClickListener(this);
        mDownButton.setOnClickListener(this);
        mLeftButton.setOnClickListener(this);
        mRightButton.setOnClickListener(this);

        return v;
    }


    @Override
    public void onClick(View v) {
        if( v == mUpButton) {
            Intent intent = new Intent(mContext, LoadingActivity.class);
            intent.putExtra("level", currentLevel.getAdjacentNorth());
            intent.putExtra("player", Parcels.wrap(mPlayer));
            startActivity(intent);
        }
        if( v == mDownButton) {
            Intent intent = new Intent(mContext, LoadingActivity.class);
            intent.putExtra("level", currentLevel.getAdjacentSouth());
            intent.putExtra("player", Parcels.wrap(mPlayer));
            startActivity(intent);
        }
        if( v == mLeftButton) {
            Intent intent = new Intent(mContext, LoadingActivity.class);
            intent.putExtra("level", currentLevel.getAdjacentWest());
            intent.putExtra("player", Parcels.wrap(mPlayer));
            startActivity(intent);
        }
        if( v == mRightButton) {
            Intent intent = new Intent(mContext, LoadingActivity.class);
            intent.putExtra("level", currentLevel.getAdjacentEast());
            intent.putExtra("player", Parcels.wrap(mPlayer));
            startActivity(intent);
        }
    }

    public void checkBooleans() {
        if(currentLevel.checkInteraction() == false) {
            // hide interact button
        }
        else {
            // idk
        }
    }
}
