package codeland.gd.rf.demonnavigationdrawer.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.view.menu.MenuView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import codeland.gd.rf.demonnavigationdrawer.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FormularioFragment extends Fragment implements View.OnClickListener {

    private EditText etPrimeiro;
    private EditText etSegundo;
    private Button somar;
    private Button subtrair;
    private Button multiplicar;
    private Button dividir;
    private int resultado;

        public FormularioFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View itemView = inflater.inflate(R.layout.fragment_formulario, container, false);
        etSegundo = (EditText) itemView.findViewById(R.id.et_segundo);
        etPrimeiro = (EditText) itemView.findViewById(R.id.et_primeiro);
        //botoes
        somar = (Button) itemView.findViewById(R.id.somar);
        subtrair = (Button) itemView.findViewById(R.id.subtrair);
        multiplicar = (Button) itemView.findViewById(R.id.dividir);
        dividir = (Button) itemView.findViewById(R.id.multiplicar);
        //
        somar.setOnClickListener(this);
        subtrair.setOnClickListener(this);
        multiplicar.setOnClickListener(this);
        dividir.setOnClickListener(this);
        return itemView;

        }

    @Override
    public void onClick(View v) {
        if (etPrimeiro.getText().toString().trim().equals("")) {
            Toast.makeText(getContext(),"Informe o primeiro valor", Toast.LENGTH_SHORT).show();
            return;
        }
        if (etSegundo.getText().toString().trim().equals("")) {
            Toast.makeText(getContext(),"Infome o segundo valor", Toast.LENGTH_SHORT).show();
            return;
        }
        switch (v.getId()) {
            case R.id.somar:
                resultado = Integer.parseInt(etSegundo.getText().toString()) + Integer.parseInt(etPrimeiro.getText().toString()) ;
                break;
        }
    }
}
