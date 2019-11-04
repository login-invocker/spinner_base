package com.example.spinner_base;

import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

public class SpinnerNameAdapter extends ArrayAdapter<String> {
    public SpinnerNameAdapter(@NonNull Context context, int resource,String name) {
        super(context, resource);
    }
}
