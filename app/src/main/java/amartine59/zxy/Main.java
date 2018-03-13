package amartine59.zxy;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Main extends AppCompatActivity {
    private EditText cantidad;
    private TextView totalPagar;
    private Spinner listaGenero,listaTipoZapato,listaMarca;
    private String lGenero[],lTZapato[],lMarca[];
    private Resources recursos;
    private Button botonPagar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cantidad = findViewById(R.id.txtCantidad);
        totalPagar = findViewById(R.id.txtResultado);
        recursos = this.getResources();
        botonPagar = findViewById(R.id.btnPagar);
        listaGenero = findViewById(R.id.cmbGenero);
        lGenero = recursos.getStringArray(R.array.l_Genero);
        ArrayAdapter<String>adpGenero= new ArrayAdapter(this,android.R.layout.simple_spinner_item,lGenero);
        listaGenero.setAdapter(adpGenero);
        listaTipoZapato = findViewById(R.id.cmbTZapato);
        lTZapato = recursos.getStringArray(R.array.l_TipoZapato);
        ArrayAdapter<String>adpTZapato = new ArrayAdapter(this,android.R.layout.simple_spinner_item,lTZapato);
        listaTipoZapato.setAdapter(adpTZapato);
        listaMarca = findViewById(R.id.cmbMarca);
        lMarca = recursos.getStringArray(R.array.l_Marca);
        ArrayAdapter<String>adpMarca = new ArrayAdapter(this,android.R.layout.simple_spinner_item,lMarca);
        listaMarca.setAdapter(adpMarca);

    }
    public boolean validar(){
        if(cantidad.getText().toString().isEmpty()){
            cantidad.requestFocus();
            cantidad.setError(recursos.getString(R.string.errorvacio));
            return false;
        }

        if(Integer.parseInt(cantidad.getText().toString())<1){
            cantidad.requestFocus();
            cantidad.setError(recursos.getString(R.string.errornegativo));
            return false;
         }

        return true;
    }

    public void calcularPago(View v) {
        int cant, precio = 0, opcGenero, opcTZapato, opcMarca, valorPagar = 0;
        if (validar()) {
            opcGenero = listaGenero.getSelectedItemPosition();
            opcTZapato = listaTipoZapato.getSelectedItemPosition();
            opcMarca = listaMarca.getSelectedItemPosition();
            cant = Integer.parseInt(cantidad.getText().toString());
            switch (opcGenero) {
                case 0://Masculino
                    switch (opcTZapato) {
                        case 0://Masculino - Zapatilla
                            switch (opcMarca) {
                                case 0://Masculino - Zapatilla - Nike
                                    precio = 120000;
                                    valorPagar = Metodos.totalPagar(cant, precio);
                                    break;
                                case 1://Masculino - Zapatilla - Adidas
                                    precio = 140000;
                                    valorPagar = Metodos.totalPagar(cant, precio);
                                    break;
                                case 2://Masculino - Zapatilla - Puma
                                    precio = 130000;
                                    valorPagar = Metodos.totalPagar(cant, precio);
                                    break;
                            }
                            break;
                        case 1://Masculino - Clasico
                            switch (opcMarca) {
                                case 0://Masculino - Clasico - Nike
                                    precio = 50000;
                                    valorPagar = Metodos.totalPagar(cant, precio);
                                    break;
                                case 1://Masculino - Clasico - Adidas
                                    precio = 80000;
                                    valorPagar = Metodos.totalPagar(cant, precio);
                                    break;
                                case 2://Masculino - Clasico - Puma
                                    precio = 100000;
                                    valorPagar = Metodos.totalPagar(cant, precio);
                                    break;
                            }
                            break;
                    }
                    break;
                case 1://Femenino
                    switch (opcTZapato) {
                        case 0://Femenino - Zapatilla
                            switch (opcMarca) {
                                case 0://Femenino - Zapatilla - Nike
                                    precio = 100000;
                                    valorPagar = Metodos.totalPagar(cant, precio);
                                    break;
                                case 1://Femenino - Zapatilla - Adidas
                                    precio = 130000;
                                    valorPagar = Metodos.totalPagar(cant, precio);
                                    break;
                                case 2://Femenino - Zapatilla - Puma
                                    precio = 110000;
                                    valorPagar = Metodos.totalPagar(cant, precio);
                                    break;
                            }
                            break;
                        case 1://Femenino - Clasico
                            switch (opcMarca) {
                                case 0://Femenino - Clasico - Nike
                                    precio = 60000;
                                    valorPagar = Metodos.totalPagar(cant, precio);
                                    break;
                                case 1://Femenino - Clasico - Adidas
                                    precio = 70000;
                                    valorPagar = Metodos.totalPagar(cant, precio);
                                    break;
                                case 2://Femenino - Clasico - Puma
                                    precio = 120000;
                                    valorPagar = Metodos.totalPagar(cant, precio);
                                    break;
                            }
                            break;
                    }
                    break;
            }

            totalPagar.setText("" + valorPagar);

        }
    }
}
