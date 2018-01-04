package temerbu.edu.hellolight;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
//Comments:
//clrl + slash / multi: ctrl + shift slash...

/**
 * Java Docs
 * The Activity is a ViewController. it controls the views in the XML.
 * The Xml represents The entire View. aka superView.
 */
public class MainActivity extends Activity implements View.OnClickListener {
    //The fields of the ViewController are the controls (in android they are called Views):
    EditText etCelcius, etFahrnheit, etRankin, etKelvin;
    Button btnCelsius, btnRankin, btnFahrenheit, btnKelvin;

    @Override
    protected void onCreate(Bundle savedInstanceState /*Map / Dictionary*/) {
        super.onCreate(savedInstanceState);

        //set the xml file to be inflated by the system:
        setContentView(R.layout.temp_converter);

        //find Views by id, get a reference / pointer to the views declared in the xml file.
        etCelcius = findViewById(R.id.etCelsius);
        etFahrnheit = findViewById(R.id.etFahrenheit);
        etRankin = findViewById(R.id.etRankin);
        etKelvin = findViewById(R.id.etKelvin);

        btnCelsius = findViewById(R.id.btnCelcius);
        btnFahrenheit = findViewById(R.id.btnFahrenheit);
        btnRankin = findViewById(R.id.btnRankin);
        btnKelvin = findViewById(R.id.btnKelvin);

        btnCelsius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO: Validation:
                //TODO: Refactor this to a separate method for DRY code-reuse
                //TODO: Refactor the method into a Model class (Unit Conversion Brain) for better architecture (MVC)
                //The View is our XML, Activity is the ViewController -> The model is on you.
                //get the text from etFahrenheit:
                String fahrenheitString = etFahrnheit.getText().toString();
                //convert it a double
                Double fahrenheitDouble = Double.valueOf(fahrenheitString);
                //do some unit conversion
                Double celiusDouble = fahrenheitDouble * 32;
                //
                //convert back to String
                String celsiusString = celiusDouble.toString();
                //put the result back to the 4 edittexts
                etCelcius.setText(celsiusString);
            }
        });

        //Todo: Let's ractice, complete the Unit Converter.
        //Get your android studio up and running.
        //run your app in an emulator.
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnSayHello:
        }
    }
}

class Anon implements View.OnClickListener{
    @Override
    public void onClick(View view) {

    }
}

//TODO: Github, Slides, Project