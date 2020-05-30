package com.example.myapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class AlarmReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Alarm,Alarm,Alarm",Toast.LENGTH_SHORT).show();

        Intent mIntent = new Intent(context,MainActivity.class);
        context.startActivity(mIntent);
    }

}
