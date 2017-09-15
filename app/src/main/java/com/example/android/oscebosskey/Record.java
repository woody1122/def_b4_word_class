package com.example.android.oscebosskey;

/**
 * Created by peterwoodward-court on 13/09/2017.
 */
public class Record {

    private String mListedItem;

    public Record(String ListedItem){
        mListedItem = ListedItem;
    }

    // You may need to add a 'setter method' here when you make it possible for people to add new records to an OSCE station

    public String getListedItem(){
        return mListedItem;
    }

}
