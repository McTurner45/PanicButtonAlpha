package com.danielkim.soundrecorder;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.telephony.SmsManager;
import android.widget.Button;
import com.danielkim.soundrecorder.activities.MainActivity;

public class SmsMessage extends MainActivity implements LocationListener {
    private Button button;
    private String r, police;
    private String message;

    private LocationManager locationManager;
    String locationPoints;
    private LocationListener locationListener;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);

        SmsManager myManager = SmsManager.getDefault();
        myManager.sendTextMessage(String.valueOf(r), null, message, null, null);
        myManager.sendTextMessage(String.valueOf(police), null, message, null, null);
    }

    @Override
    public void onLocationChanged(Location location) {
        locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        android.location.Location loc = locationManager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);

        onLocationChanged(loc);
        double longitude = location.getLongitude();
        double latitude = location.getLatitude();

        locationPoints = "Longitude: " + longitude + "\n" + "Latitude: " + latitude;

        {
            message = "somebody help me \n" + "My Name is Nimrod Munatsi\n" +
                    "my location is blah blah \n" + locationPoints +
                    "there are chances that i am being harassed\n" + " Or some one might be taking Advantage of me" +
                    "please come soon";

            r = GetContact.getMobile();
            police = "7768374";
        }
    }


    @Override
    public void onStatusChanged(String s, int i, Bundle bundle) {

    }

    @Override
    public void onProviderEnabled(String s) {

    }

    @Override
    public void onProviderDisabled(String s) {

    }
}
