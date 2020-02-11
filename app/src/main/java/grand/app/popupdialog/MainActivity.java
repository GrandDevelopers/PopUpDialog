package grand.app.popupdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.tv_dialog_action).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new PopUp(MainActivity.this)
                        .setTitle("Dialog Grand PopUp")
                        .setTitleColor(Color.BLACK)
                        .setMessage("Please complete this action")
                        .setMessageColor(Color.GRAY)
                        .setFirstButtonText("Login")
                        .setFirstTextColor(Color.WHITE)
                        .setSecondButtonText("Register")
                        .setSecondTextColor(Color.WHITE)
                        .setBackgroundDialogColor(Color.WHITE)
                        .setFirstBackgroundColor(R.color.colorPrimary)
                        .setSecondBackgroundColor(R.color.colorPrimaryDark)
                        .setImage(R.drawable.grand)
                        .setExitColor(R.color.design_default_color_on_secondary)
                        .setExitEnable(true)
                        .show(new IPopUpActionInterface() {
                            @Override
                            public void onFirstButton(Dialog dialog, View view) {
                                Toast.makeText(MainActivity.this, "First Click", Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onSecondButton(Dialog dialog, View view) {
                                Toast.makeText(MainActivity.this, "Second Click", Toast.LENGTH_SHORT).show();
                            }
                        });


            }
        });


        findViewById(R.id.tv_dialog_action2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new PopUpCircle(MainActivity.this)
                        .setTitle("Dialog Grand PopUp")
                        .setTitleColor(Color.BLACK)
                        .setMessage("Please complete this action")
                        .setMessageColor(Color.GRAY)
                        .setFirstButtonText("Login")
                        .setFirstTextColor(Color.WHITE)
                        .setSecondButtonText("Register")
                        .setSecondTextColor(Color.WHITE)
                        .setBackgroundDialogColor(Color.WHITE)
                        .setFirstBackgroundColor(R.color.colorPrimary)
                        .setSecondBackgroundColor(R.color.colorPrimaryDark)
                        .setImage(R.drawable.grand)
                        .setExitColor(R.color.design_default_color_on_secondary)
                        .setExitEnable(true)
                        .show(new IPopUpActionInterface() {
                            @Override
                            public void onFirstButton(Dialog dialog, View view) {
                                Toast.makeText(MainActivity.this, "First Click", Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onSecondButton(Dialog dialog, View view) {
                                Toast.makeText(MainActivity.this, "Second Click", Toast.LENGTH_SHORT).show();
                            }
                        });


            }
        });

    }
}
