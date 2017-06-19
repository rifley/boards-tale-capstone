package me.rileywatts.aboardstale.ui;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import me.rileywatts.aboardstale.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PlayerInventoryFragment extends Fragment implements View.OnClickListener{
    private ImageButton mUpButton;
    private ImageButton mDownButton;
    private ImageButton mLeftButton;
    private ImageButton mRightButton;
    private Context mContext;

    public PlayerInventoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_player_inventory, container, false);
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
            Toast.makeText(mContext, "North", Toast.LENGTH_SHORT).show();
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
