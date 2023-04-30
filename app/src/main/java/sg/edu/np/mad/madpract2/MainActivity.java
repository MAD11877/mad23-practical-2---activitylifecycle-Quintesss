package sg.edu.np.mad.madpract2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //define elements
        TextView textName = findViewById(R.id.textName);
        TextView textDesc = findViewById(R.id.textDesc);
        Button buttonFollow = findViewById(R.id.button);

        User newUser = new User("MAD","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua",
                1, Boolean.FALSE);

        //set text variables
        textName.setText(newUser.getName());
        textDesc.setText(newUser.getDescription());

        if (newUser.getFollowed() == Boolean.FALSE){
            buttonFollow.setText("Follow");
        } else {
            buttonFollow.setText("Unfollow");
        }
    }

    @Override
    protected void onResume(){
        super.onResume();
        Button buttonFollow = findViewById(R.id.button);

        //button to toggle between Follow and Unfollow on click
        buttonFollow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (buttonFollow.getText().equals("Follow")) {
                    buttonFollow.setText("Unfollow");
                } else {
                    buttonFollow.setText("Follow");
                }
            }


        });

    }
}
