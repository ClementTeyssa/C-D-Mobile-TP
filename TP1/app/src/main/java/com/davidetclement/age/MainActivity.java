package com.davidetclement.age;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.DatePicker;
import android.widget.RadioGroup;
import android.widget.Toast;
import java.util.Calendar;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onRadioButtonClicked(View view){
    boolean ok = ((RadioButton)view).isChecked();
    switch(view.getId()){
        case R.id.radioButtonF:
            if(ok){

            }
            break;
        case R.id.radioButtonH:
            if(ok){

            }
        }
    }

    public void calculerAge(View view){
        String res="";
        RadioGroup rg;
        rg = findViewById(R.id.radioGroup);
        int selected = rg.getCheckedRadioButtonId();
        RadioButton rb = findViewById(selected);
        String seks = rb.getText().toString();

        if(seks.equals("Homme")){
            res = "Mon cher ";
        }else{
            if(seks.equals("Femme")){
                res = "Ma chère ";
            }
        }

        EditText et = findViewById(R.id.editText);
        String nom = et.getText().toString();

        res = res + nom + ", tu as ";
        DatePicker dp;
        dp = findViewById(R.id.datePicker);
        int j = dp.getDayOfMonth();
        int m = dp.getMonth();
        int a = dp.getYear();

        Calendar actu = Calendar.getInstance();
        int actuJ = actu.get(Calendar.DAY_OF_MONTH);
        int actuM = actu.get(Calendar.MONTH);
        int actuA = actu.get(Calendar.YEAR);

        //Ici, on ne s'occupe que de l'année, on regarde donc juste si la différence est <= 0
        if(actuJ - j <= 0){
            actuM--;
        }
        if(actuM - m <= 0){
            actuA--;
        }
        int age = actuA - a;

        res = res + age + " ans.";

        if(age <= 18){
            //int dureeToast = Toast.LENGTH_SHORT;
            //Toast.makeText(this, res, dureeToast).show();

            //int dureeSnackBar = Snackbar.LENGTH_SHORT;
            //Snackbar.make(view, res, dureeSnackBar).show();

            Intent i = new Intent(this, Main2Activity.class);
            i.putExtra("res",res);
            startActivity(i);
        }else{
            Uri uri = Uri.parse("https://fr.wikipedia.org/wiki/Majorité");
            Intent i = new Intent(getIntent().ACTION_VIEW, uri);
            startActivity(i);
        }


    }
}
