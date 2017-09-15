package com.example.android.oscebosskey;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by peterwoodward-court on 13/09/2017.
 */
public class RecordAdapter extends ArrayAdapter<Record> {

    private int mColourResourceId;

    public RecordAdapter(Activity context, ArrayList<Record> records, int ColourResourceId) {
        super(context, 0, records);
        mColourResourceId = ColourResourceId;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Record currentRecord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView recordTextView = (TextView) listItemView.findViewById(R.id.record_text_view);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        recordTextView.setText(currentRecord.getListedItem());

        //If you have a checkbox you may need to add it here

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColourResourceId);
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}

