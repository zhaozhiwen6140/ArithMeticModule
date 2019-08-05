package com.little.demo.arithmeticleet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.little.demo.arithmeticleet.sort.MergeSort;
import com.little.demo.arithmeticleet.sort.QuickSort;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "ArithmeticT";
    public static final boolean DEBUG = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int array[] = new int[]{5,8,3,7,1,4};
        int k = QuickSort.getTheFirstBigK(array,2);
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
