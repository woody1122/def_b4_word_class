package com.example.android.oscebosskey;

/**
 * Created by peterwoodward-court on 13/09/2017.
 */
public class Record {

    private String mListedItem;

    private Class mListedItemId;

    public Record(String ListedItem, Class listedItemId){
        mListedItem = ListedItem;
        mListedItemId = listedItemId;
    }

    // You may need to add a 'setter method' here when you make it possible for people to add new records to an OSCE station

    public String getListedItem(){
        return mListedItem;
    }

    public Class getListedItemId(){
        return mListedItemId;
    }


}
