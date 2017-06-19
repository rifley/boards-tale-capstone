package me.rileywatts.aboardstale.ui;


import android.content.Context;
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

import me.rileywatts.aboardstale.R;
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

    public static PlayerNavigationFragment newInstance(Player player) {
        PlayerNavigationFragment playerNavigationFragment = new PlayerNavigationFragment();
        Bundle args = new Bundle();
        args.putParcelable("player", Parcels.wrap(player));
        playerNavigationFragment.setArguments(args);
        return playerNavigationFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPlayer = Parcels.unwrap(getArguments().getParcelable("player"));

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

        mUpButton.setOnClickListener(this);
        mDownButton.setOnClickListener(this);
        mLeftButton.setOnClickListener(this);
        mRightButton.setOnClickListener(this);

        return v;
    }


    @Override
    public void onClick(View v) {
        if( v == mUpButton) {
            mPlayer.setHealth(-20);
            Log.v("data change", mPlayer.getHealth().toString());
        }
        if( v == mDownButton) {
            Toast.makeText(mContext, "South", Toast.LENGTH_SHORT).show();
        }
        if( v == mLeftButton) {
            Toast.makeText(mContext, "West", Toast.LENGTH_SHORT).show();
        }
        if( v == mRightButton) {
            Toast.makeText(mContext, "East", Toast.LENGTH_SHORT).show();
        }
    }
}
