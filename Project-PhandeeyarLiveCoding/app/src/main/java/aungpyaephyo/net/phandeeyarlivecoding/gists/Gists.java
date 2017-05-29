package aungpyaephyo.net.phandeeyarlivecoding.gists;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

import aungpyaephyo.net.phandeeyarlivecoding.activities.EventListActivity;

/**
 * Created by aung on 3/5/16.
 */
public class Gists {

    /**
     * Open browser from host device with specified url.
     *
     * @param context - starting activity.
     * @param url     - url to open in browser.
     */
    public void openBrowserWithUrl(Context context, String url) {
        Intent intentToBrowser = new Intent(Intent.ACTION_VIEW);
        intentToBrowser.setData(Uri.parse(url));
        context.startActivity(intentToBrowser);
    }

    /**
     * Open EventListActivity from current activity.
     *
     * @param context - starting activity.
     */
    public void startNewActivity(Context context) {
        Intent intentToSettings = new Intent(context, EventListActivity.class);
        context.startActivity(intentToSettings);
    }
}
