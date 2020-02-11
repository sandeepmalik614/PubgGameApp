package com.gameapp.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.gameapp.R;

import java.util.Random;

public class AppUtils {

    public static boolean isConnectionAvailable(Context ctx) {
        ConnectivityManager mManager = (ConnectivityManager) ctx
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo mNetworkInfo = mManager.getActiveNetworkInfo();
        return (mNetworkInfo != null) && (mNetworkInfo.isConnected());
    }

    public static String generateDarkRenadomNumber() {
        Random r = new Random();
        int red = r.nextInt(150 - 0 + 1) + 1;
        int green = r.nextInt(150 - 0 + 1) + 1;
        int blue = r.nextInt(150 - 0 + 1) + 1;

        GradientDrawable draw = new GradientDrawable();
        draw.setShape(GradientDrawable.OVAL);
        draw.setColor(Color.rgb(red, green, blue));
        String color = String.format("#%02x%02x%02x", red, green, blue);
        color = color.replace("android.graphics.drawable.GradientDrawable@", "");
        return color;
    }
}
