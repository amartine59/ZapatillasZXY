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
    public void calcularPago(View v){


    }
}
