package bit.com.sv.myapplistadecompras.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import bit.com.sv.myapplistadecompras.R;

/**
 * Created by emendoza on 25/01/2017.
 */

public class Izquierda extends Fragment {
    View rootView;
    TextView texto;
    Button boton;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){

        rootView = inflater.inflate(R.layout.izquierda, container, false);
        texto = (TextView)rootView.findViewById(R.id.texto);
        boton = (Button)rootView.findViewById(R.id.boton);
        boton.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){

            }
        });
        return rootView;
    }
}
