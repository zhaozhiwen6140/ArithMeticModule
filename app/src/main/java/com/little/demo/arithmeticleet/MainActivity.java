package com.little.demo.arithmeticleet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.little.demo.arithmeticleet.search.BinarySearch;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "ArithmeticT";
    public static final boolean DEBUG = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        int array[] = new int[]{5,8,3,7,1,4};
        int array[] = new int[]{1,7,7,7,9,13};
        int k = BinarySearch.getLastLessThanSearchKey(array,7);
        if (DEBUG) {
            Log.d(TAG, "onCreate: k=" + k);
        }

        if (DEBUG) {
            for(int i=0;i<array.length;i++) {
                Log.d(TAG, "onCreate: array=" + array[i]);
            }
        }
    }
}
