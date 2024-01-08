// src/MainActivity.java
package ; // Change this to match your package name

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Access the TextView from the layout
        TextView myTextView = findViewById(R.id.myTextView);

        // Perform any additional actions
        // For example, you can set a click listener
        myTextView.setOnClickListener(view -> {
            // Do something when the TextView is clicked
        });
    }
}
