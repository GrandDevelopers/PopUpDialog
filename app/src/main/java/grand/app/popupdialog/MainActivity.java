package grand.app.popupdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.tv_dialog_action).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new PopUpDialogConfirm(MainActivity.this)
                        .setTitle("Dialog PopUp")
//                        .setTitleColor(R.color.colorAccent)
                        .setMessage("Please complete this action")
//                        .setMessageColor(R.color.colorPrimary)
                        .setFirstButtonText("Login")
                        .setFirstTextColor(R.color.colorPrimary)
                        .setSecondButtonText("Register")
                        .setSecondTextColor(R.color.colorAccent2)
                        .setBackgroundDialogColor(R.color.colorAccent3)
                        .setFirstBackgroundColor(R.color.colorPrimary)
                        .setSecondBackgroundColor(R.color.colorAccent)
                        .setImage(R.mipmap.ic_launcher)
//                        .setExitColor(R.color.colorPrimaryDark)
                        .show(new PopUpDialogHelperActionInterface() {
                            @Override
                            public void onFirstButton(Dialog dialog, View view) {

                            }

                            @Override
                            public void onSecondButton(Dialog dialog, View view) {

                            }
                        });
            }
        });
    }
}
