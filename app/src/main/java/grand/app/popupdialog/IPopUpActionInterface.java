package grand.app.popupdialog;

import android.app.Dialog;
import android.view.View;

public interface IPopUpActionInterface {
    void onFirstButton(Dialog dialog, View view);
    void onSecondButton(Dialog dialog, View view);
}
