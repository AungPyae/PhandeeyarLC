package aungpyaephyo.net.phandeeyarlivecoding;

import android.app.Application;
import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

import aungpyaephyo.net.phandeeyarlivecoding.data.DataManager;
import aungpyaephyo.net.phandeeyarlivecoding.data.vos.EventVO;
import aungpyaephyo.net.phandeeyarlivecoding.utils.JsonUtils;

/**
 * Created by aung on 2/27/16.
 */
public class PhandeeyarLiveCodingApp extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();

        DataManager.getInstance().loadEventList();
    }

    public static Context getContext() {
        return context;
    }



}
