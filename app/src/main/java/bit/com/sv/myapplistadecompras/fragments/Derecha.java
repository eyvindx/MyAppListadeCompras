package bit.com.sv.myapplistadecompras.fragments;

import android.app.Fragment;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import bit.com.sv.myapplistadecompras.R;

/**
 * Created by emendoza on 25/01/2017.
 */

public class Derecha extends Fragment {

    View rootView;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        rootView = inflater.inflate(R.layout.derecha,container,false);

        return rootView;
    }
}
