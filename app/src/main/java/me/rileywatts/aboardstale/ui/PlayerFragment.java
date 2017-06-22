package me.rileywatts.aboardstale.ui;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import org.parceler.Parcels;

import me.rileywatts.aboardstale.R;
import me.rileywatts.aboardstale.models.Player;

/**
 * A simple {@link Fragment} subclass.
 */
public class PlayerFragment extends Fragment {
    private Player mPlayer;
    private TextView playerName;
    private TextView playerHealth;
    private ImageView mSword;
    private ImageView mArmor;
    private ImageView mWings;
    private ImageView mKey;
    private Context mContext;


    public static PlayerFragment newInstance(Player player, int level) {
        PlayerFragment playerFragment = new PlayerFragment();
        Bundle args = new Bundle();
        args.putParcelable("player", Parcels.wrap(player));
        args.putInt("level", level);
        playerFragment.setArguments(args);
        return playerFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPlayer = Parcels.unwrap(getArguments().getParcelable("player"));

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View v = inflater.inflate(R.layout.fragment_player, container, false);
        mContext = getActivity();
        playerName = (TextView) v.findViewById(R.id.playerNameTextView);
        playerHealth = (TextView) v.findViewById(R.id.playerHealthTextView);
        mSword = (ImageView) v.findViewById(R.id.swordImageView);
        mArmor = (ImageView) v.findViewById(R.id.armorImageView);
        mWings = (ImageView) v.findViewById(R.id.wingsImageView);
        mKey = (ImageView) v.findViewById(R.id.keyImageView);


        playerName.setText("Player: " + mPlayer.getName());
        playerHealth.setText("Health: " + mPlayer.getHealth().toString());

        return v;
    }

}
