package com.example.myapplication;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btnInspiration;
    Button btnEditDescription;
    ImageView ivMarie;
    ImageView ivAmelia;
    ImageView ivMargaret;
    EditText etDescription;
    TextView tvaboutMarie;
    TextView tvaboutAmelia;
    TextView tvaboutMargaret;
    RadioGroup radioGroup;
    RadioButton radioButton;
    RadioButton rbMarie;
    RadioButton rbAmelia;
    RadioButton rbMargaret;
    String addition;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeUI();
    }

    private void initializeUI() {
        this.btnInspiration = (Button) findViewById(R.id.btnInspiration);
        this.btnEditDescription = (Button) findViewById(R.id.btnEditDescription);
        this.ivMarie = (ImageView) findViewById(R.id.ivMarie);
        this.ivAmelia = (ImageView) findViewById(R.id.ivAmelia);
        this.ivMargaret = (ImageView) findViewById(R.id.ivMargaret);
        this.etDescription = (EditText) findViewById(R.id.etDescription);
        this.tvaboutMarie = (TextView) findViewById(R.id.tvaboutMarie);
        this.tvaboutAmelia = (TextView) findViewById(R.id.tvaboutAmelia);
        this.tvaboutMargaret = (TextView) findViewById(R.id.tvaboutMargaret);
        this.rbMarie = (RadioButton) findViewById(R.id.rbMarie);
        this.rbAmelia = (RadioButton) findViewById(R.id.rbAmelia);
        this.rbMargaret = (RadioButton) findViewById(R.id.rbMargaret);
        this.radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        Button btnEditDescription = findViewById(R.id.btnEditDescription);
        btnEditDescription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addition = etDescription.getText().toString();
                rbCheck(v);
                int radioId=radioGroup.getCheckedRadioButtonId();
                radioButton = findViewById(radioId);
                if(radioButton==rbMarie){
                    tvaboutMarie.setText("Polish and naturalized-French physicist and chemist who conducted pioneering research on radioactivity."+addition);
                }
                if(radioButton==rbAmelia){
                    tvaboutAmelia.setText("American aviation pioneer and author. First female aviator to fly solo across the Atlantic Ocean."+addition);
                }
                if(radioButton==rbMargaret){
                    tvaboutMargaret.setText("American computer scientist, systems engineer, and business owner."+addition);
                }
            }
        });
    }

    public void rbCheck(View view){
        String addition = etDescription.getText().toString();
        int radioId=radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);
    }


    public void IvMarieClick(View view) {
        ivMarie.setVisibility(View.INVISIBLE);
    }

    public void IvAmeliaClick(View view) {
        ivAmelia.setVisibility(View.INVISIBLE);
    }

    public void IvMargaretClick(View view) {
        ivMargaret.setVisibility(View.INVISIBLE);
    }

    public void btnInspirationClick(View view) {
        String[] toastMessages = new String[] {"Marie Curie became the first person to claim Nobel honors twice","Women of NASA LEGO set went on sale featuring mini figure of Hamilton","Amelia Earhart built her own roller coaster.","Margaret Hamilton was lead Apollo flight software designer.","During her 2,408-mile flight to become the first person to fly solo across the Pacific, Amelia Earhart enjoyed a cup of hot chocolate.", "Marie Curie is the first woman to win a Nobel prize."};
        Random randomNumber = new Random();
        int number = randomNumber.nextInt(5);
        Toast.makeText(this, toastMessages[number], Toast.LENGTH_LONG).show();
    }
}
