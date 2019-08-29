package com.superg280.dev.xfshelper;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.content.Context;
import android.view.inputmethod.InputMethodManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        */
		
		ImageView BtFind = findViewById(R.id.imageView_main_find);
        final EditText textViewCodeToFind = findViewById( R.id.editText_main_find);
        final Switch switchInfoExec = findViewById( R.id.switch_main_execute);

        textViewCodeToFind.setOnKeyListener(new View.OnKeyListener() {
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if ((event.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(textViewCodeToFind.getWindowToken(), 0);
                    //

                    String strCodeToFind = textViewCodeToFind.getText().toString();
                    if( !strCodeToFind.isEmpty())
                        findAndShowResult( strCodeToFind, switchInfoExec.isChecked());
                    return true;
                }
                return false;
            }
        });
        
        BtFind.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                //Ocultar el teclado al pulsar la imagen de buscar.
                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(textViewCodeToFind.getWindowToken(), 0);
                //

                String strCodeToFind = textViewCodeToFind.getText().toString();
                if( !strCodeToFind.isEmpty())
                    findAndShowResult( strCodeToFind, switchInfoExec.isChecked());
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
            /*Snackbar.make(getWindow().getDecorView().getRootView(), "Pulsando settings", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            */

            Intent inte = new Intent(MainActivity.this, DevicesActivity.class);
            startActivity(inte);
            return true;
        } else if( id == R.id.action_about) {
            Intent inte = new Intent(MainActivity.this, AboutActivity.class);
            startActivity(inte);
            return true;
        }


        return super.onOptionsItemSelected(item);
    }
	
	protected void findAndShowResult( String codeToFind, boolean bExecute) {
        int nCode = 0;

        try {
            nCode = Integer.valueOf( codeToFind);
        } catch ( Exception ex) {
            return;
        }

        XFSElement element;
        if( nCode <= 0) {
            element = XFSCodes.getXFSError( nCode);
        } else {
            element = XFSCodes.getXFSCommandResult( nCode, bExecute, getApplicationContext());
        }

        TextView result = findViewById( R.id.textView_main_result_text);
        result.setText( element.getErrorCode().isEmpty() ? "No Encontrado" : element.getErrorCode());
        TextView description = findViewById( R.id.textView_main_result_description);
        description.setText( element.getDescription());
    }
}
