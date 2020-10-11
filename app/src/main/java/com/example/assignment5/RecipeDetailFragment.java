package com.example.assignment5;

import android.app.Activity;
import android.os.Bundle;

import com.google.android.material.appbar.CollapsingToolbarLayout;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.assignment5.dummy.DummyContent;

/**
 * A fragment representing a single recipe detail screen.
 * This fragment is either contained in a {@link RecipeListActivity}
 * in two-pane mode (on tablets) or a {@link RecipeDetailActivity}
 * on handsets.
 */
public class RecipeDetailFragment extends Fragment {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";

    /**
     * The dummy content this fragment is presenting.
     */
    private DummyContent.DummyItem mItem;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public RecipeDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            // Load the dummy content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.
            mItem = DummyContent.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));

            Activity activity = this.getActivity();
            CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout) activity.findViewById(R.id.toolbar_layout);
            if (appBarLayout != null) {
                appBarLayout.setTitle(mItem.content);
            }
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.recipe_detail2, container, false);

        // Show the dummy content as text in a TextView.
        if (mItem.id.equals("1")) {
            ((TextView) rootView.findViewById(R.id.recipe_detail2)).setText(mItem.details);
            ((ImageView)rootView.findViewById(R.id.imgfood)).setImageDrawable(getResources().getDrawable(R.drawable.frozon));
        }
        else if (mItem.id.equals("2"))
        {
            ((TextView) rootView.findViewById(R.id.recipe_detail2)).setText(mItem.details);
            ((ImageView)rootView.findViewById(R.id.imgfood)).setImageDrawable(getResources().getDrawable(R.drawable.chickenthighs));
        }
        else if (mItem.id.equals("3"))
        {
            ((TextView) rootView.findViewById(R.id.recipe_detail2)).setText(mItem.details);
            ((ImageView)rootView.findViewById(R.id.imgfood)).setImageDrawable(getResources().getDrawable(R.drawable.swimbiscuits));
        }
        else if (mItem.id.equals("4"))
        {
            ((TextView) rootView.findViewById(R.id.recipe_detail2)).setText(mItem.details);
            ((ImageView)rootView.findViewById(R.id.imgfood)).setImageDrawable(getResources().getDrawable(R.drawable.blueberrymuffins));
        }
        else if (mItem.id.equals("5"))
        {
            ((TextView) rootView.findViewById(R.id.recipe_detail2)).setText(mItem.details);
            ((ImageView)rootView.findViewById(R.id.imgfood)).setImageDrawable(getResources().getDrawable(R.drawable.sausage));
        }
        else if (mItem.id.equals("6"))
        {
            ((TextView) rootView.findViewById(R.id.recipe_detail2)).setText(mItem.details);
            ((ImageView)rootView.findViewById(R.id.imgfood)).setImageDrawable(getResources().getDrawable(R.drawable.strawberry));
        }

        return rootView;
    }
}