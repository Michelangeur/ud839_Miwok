package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by michelange on 05/12/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    // resource Id for the background colo for this list of words.
    private int mColorId;

    /*creates a new WordAdapter object.
    * @param CONTEXT is the current context (i.e. Activity) that the adapter is being created in.
    * @param word is the list of WORDS being displayed.
    * @param ColorId is the resource ID for the background colo for this list of words.
    * */
    public WordAdapter(Activity context, ArrayList<Word> words, int colorId) {
        super(context, 0, words);
        mColorId = colorId;
    }


    // checks if an existing view is being reused, otherwise inflate the view(creates a list from current views)
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {  // this checks if the listView is empty/null, inflates/creates a new list
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // gets the word object located at this position in the list
        Word currentWord = getItem(position);

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);

        //find and sets the textView from the 'list_xml layout with ID
        miwokTextView.setText(currentWord.getMiwokTranslation());

        // find TextView in the 'list__item.xml by ID
        TextView defaultWord = (TextView) listItemView.findViewById(R.id.default_text_view);

        // get the name from the Adapter & set the current word
        defaultWord.setText(currentWord.getDefaultTranslation());

        //finds the imageView from list_item.xml layout with ID @id/image
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image);

        // checks if an image is provided for this word or not
        if (currentWord.hasImage()) {
            // if an image is available, display the provided image based on the image resource ID.
            iconView.setImageResource(currentWord.getImageResourceId());

            // Makes sure the view is visible.
            iconView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the iconView setting visibility to GONE.
            iconView.setVisibility(View.GONE);
        }

        // sets the theme color for the list item.
        View textContainer = listItemView.findViewById(R.id.container);

        // finds the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorId);

        // sets background color of the text container View
        textContainer.setBackgroundColor(color);

        return listItemView;// return the whole list item so it can be shown in the ListView

    }


}
