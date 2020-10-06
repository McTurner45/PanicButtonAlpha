package com.danielkim.soundrecorder.activities;

import android.database.Cursor;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

import com.danielkim.soundrecorder.R;

public class EmergencyContacts extends android.support.v7.app.ActionBarActivity {

    ListView ll;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_contacts);
        ll=(ListView)findViewById(R.id.contactList);
    }

    public void get(View v)
    {
        Cursor cursor=getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI,null,null,null,null);
        startManagingCursor(cursor);

        String[] from={ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME,ContactsContract.CommonDataKinds.Phone.NUMBER,
        ContactsContract.CommonDataKinds.Phone._ID};

        int[] to = {android.R.id.text1,android.R.id.text2};

        SimpleCursorAdapter simpleCursorAdapter=new SimpleCursorAdapter(this,android.R.layout.simple_list_item_2,cursor,from,to);
        ll.setAdapter(simpleCursorAdapter);
        ll.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
    }
}
