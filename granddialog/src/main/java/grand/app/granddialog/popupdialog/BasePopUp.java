package grand.app.granddialog.popupdialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import grand.app.granddialog.R;

abstract class BasePopUp {
    Context context;
    View view = null;

    AppCompatTextView btnFirst, btnSecond;
    TextView txtTitle, txtMessage;
    ImageView imageDialog;
    AppCompatImageView imageExit;
    CardView cardView;

    BasePopUp(Context context, View view) {
        this.context = context;
        this.view = view;
        init();
    }


    private void init() {
        txtTitle = view.findViewById(R.id.tv_dialog_title);
        txtMessage = view.findViewById(R.id.tv_dialog_message);
        btnFirst = view.findViewById(R.id.btn_dialog_first);
        btnSecond = view.findViewById(R.id.btn_dialog_second);
        imageDialog = view.findViewById(R.id.img_dialog);
        imageExit = view.findViewById(R.id.img_dialog_close);
        cardView = view.findViewById(R.id.cv_dialog_popup);
    }
    public void show(final IPopUpActionInterface dialogHelperInterface) {
        final Dialog dialog = new Dialog(context, R.style.PauseDialog);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.getWindow().getAttributes().windowAnimations = R.style.PauseDialogAnimation;
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.setContentView(view);
        btnFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogHelperInterface.onFirstButton(dialog, v);
            }
        });
        btnSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogHelperInterface.onSecondButton(dialog, v);
            }
        });
        imageExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }


}
