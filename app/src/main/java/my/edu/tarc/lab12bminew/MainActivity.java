package my.edu.tarc.lab12bminew;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private EditText editTextWeight, editTextHeight;
    private TextView textViewResult;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextHeight=(EditText)findViewById(R.id.editTextHeight);
        editTextWeight=(EditText)findViewById(R.id.editTextWeight);
        textViewResult = (TextView)findViewById(R.id.textViewResult);
        imageView= (ImageView)findViewById(R.id.imageView);

    }

    public void Calculate (View view)
    {   double weight,height,result;

        height=Double.parseDouble(editTextHeight.getText().toString()) / 100;
        weight=Double.parseDouble(editTextWeight.getText().toString());
        result=weight/(height*height);
        imageView.setImageResource(R.drawable.empty);


        if (result<=18.5) {
            textViewResult.setText("You Are UnderWeight!!! You Are" + result + "Now");
            imageView.setImageResource(R.drawable.under);
        }
        else if(result>=25.0) {
            textViewResult.setText("You Are OverWeight!!! You Are" + result + "Now");
            imageView.setImageResource(R.drawable.over);
        }
        else {
            textViewResult.setText("You Are Normal Weight!!! You Are" + result + "Now");
            imageView.setImageResource(R.drawable.normal);
        }

    }

    public void Reset (View view){
        textViewResult.setText("");
        editTextHeight.setText("");
        editTextWeight.setText("");
        imageView.setImageResource(R.drawable.normal);
    }
}
