package cs.cuw.com.csc537_fall2016_linkedlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity
{
    private EditText newValueET;
    private LinearLayout valuesView;
    private LList theList;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);
        this.newValueET = (EditText) this.findViewById(R.id.newValueET);
        this.valuesView = (LinearLayout)this.findViewById(R.id.listValues);
        this.theList = new LList();
    }

    public void addFrontButtonPressed(View v)
    {
        this.theList.addFront(Integer.parseInt(this.newValueET.getText().toString()), this.valuesView, this);
        this.newValueET.setText("");
    }

    public void addEndButtonPressed(View v)
    {
        this.theList.addEnd(Integer.parseInt(this.newValueET.getText().toString()), this.valuesView, this);
        this.newValueET.setText("");
    }

    public void clearButtonPressed(View v)
    {
        this.newValueET.setText("");
    }
}
