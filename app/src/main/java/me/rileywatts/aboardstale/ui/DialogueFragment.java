package me.rileywatts.aboardstale.ui;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import org.parceler.Parcels;
import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import me.rileywatts.aboardstale.Constants;
import me.rileywatts.aboardstale.R;
import me.rileywatts.aboardstale.models.Level;
import me.rileywatts.aboardstale.models.Player;

/**
 * A simple {@link Fragment} subclass.
 */
public class DialogueFragment extends Fragment {
    private TextView mTitleTextView;
    private TextView mDescriptionTextView;
    private ListView mOptionsListView;
    private Context mContext;
    private Player mPlayer;
    private ImageView mBackground;
    private Level currentLevel;


    public static DialogueFragment newInstance(Player player, int level) {
        DialogueFragment dialogueFragment = new DialogueFragment();
        Bundle args = new Bundle();
        args.putParcelable("player", Parcels.wrap(player));
        args.putInt("level", level);
        dialogueFragment.setArguments(args);
        return dialogueFragment;
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
        View v = inflater.inflate(R.layout.fragment_dialogue, container, false);
        mContext = getActivity();
        mTitleTextView = (TextView) v.findViewById(R.id.titleTextView);
        mDescriptionTextView = (TextView) v.findViewById(R.id.levelDescriptionTextView);
        mOptionsListView = (ListView) v.findViewById(R.id.optionsListView);
        mBackground = (ImageView) v.findViewById(R.id.scenicImageView);
        int backgroundImageResource = mContext.getResources().getIdentifier(currentLevel.getImage(), "drawable", mContext.getPackageName());
        Picasso.with(mContext).load(backgroundImageResource).fit().centerCrop().into(mBackground);
        ArrayAdapter adapter = new ArrayAdapter(mContext, android.R.layout.simple_list_item_1, currentLevel.getOptions().toArray());
        mOptionsListView.setAdapter(adapter);



        mTitleTextView.setText(currentLevel.getTitle());
        mDescriptionTextView.setText(currentLevel.getDescription());
//        if(currentLevel.getOptions().get(1) != null) {
//            mOptionTextView2.setText(currentLevel.getOptions().get(1));
//        }
//        if(currentLevel.getOptions().get(2) != null) {
//            mOptionTextView3.setText(currentLevel.getOptions().get(2));
//        }



        return v;

    }

}


//    for(int i = 0; i < currentLevel.getOptions().size(); i++) {
//        List<TextView> levels = new ArrayList<TextView>();
//        levels.add(mOptionTextView1);
//        levels., mOptionTextView2, mOptionTextView3);
//        }
