// documents: https://material.io/components/snackbars
// Tutorial video 1: https://www.youtube.com/watch?v=IRws-Y-LDtM
// Tutorial video 2: https://www.youtube.com/watch?v=1bBwJDCww3g&t=310s
// Dependency implementation: https://material.io/develop/android/docs/getting-started
// Dependency latest version: https://maven.google.com/web/index.html#com.google.android.material:material
// Github Repository: https://github.com/sinhnguyen59/Android_Demo_1.git

package com.example.demo_1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private Button btnSnackbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSnackbar = findViewById(R.id.btnSnackbar);

        btnSnackbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar.make(v, "This is the snackbar", Snackbar.LENGTH_INDEFINITE);
                snackbar.setDuration(5000);
                snackbar.setAction("UNDO", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Snackbar undoSnackbar = Snackbar.make(view,"Undo successful", Snackbar.LENGTH_SHORT);
                        undoSnackbar.show();
                    }
                }).setTextColor(Color.RED);
                snackbar.setTextColor(Color.GREEN);
                snackbar.show();
            }
        });
    }
}