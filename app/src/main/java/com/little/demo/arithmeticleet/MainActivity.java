package com.little.demo.arithmeticleet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.little.demo.arithmeticleet.sort.BubbleSort;
import com.little.demo.arithmeticleet.sort.InsertSort;
import com.little.demo.arithmeticleet.sort.SelectionSort;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "ArithmeticT";
    public static final boolean DEBUG = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int array[] = new int[]{5,8,3,7,1,4};
        SelectionSort.testSelectionSort(array);

        if (DEBUG) {
            for(int i=0;i<array.length;i++) {
                Log.d(TAG, "onCreate: array=" + array[i]);
            }
        }
    }
}
