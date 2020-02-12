package grand.app.granddialog.popupdialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;

import androidx.core.content.ContextCompat;
import grand.app.granddialog.R;

public class GrPopUpSimple extends BasePopUp {

    public GrPopUpSimple(Context context) {
        super(context, LayoutInflater.from(context).inflate(R.layout.layout_dialog_popup, null, true));
    }

    public GrPopUpSimple setTitle(String title) {
        txtTitle.setText(title);
        return this;
    }

    public GrPopUpSimple setTitleColor(int color) {
        txtTitle.setTextColor(color);
        return this;
    }

    public GrPopUpSimple setFirstButtonText(String firstButtonText) {
        btnFirst.setText(firstButtonText);
        return this;
    }

    public GrPopUpSimple setFirstTextColor(int color) {
        this.btnFirst.setTextColor(color);
        return this;
    }

    public GrPopUpSimple setSecondTextColor(int color) {
        this.btnSecond.setTextColor(color);
        return this;
    }

    public GrPopUpSimple setSecondButtonText(String secondButtonText) {
        btnSecond.setText(secondButtonText);
        return this;
    }

    public GrPopUpSimple setMessage(String message) {
//        this.message = message;
        txtMessage.setText(message);
        return this;
    }

    public GrPopUpSimple setMessageColor(int color) {
        txtMessage.setTextColor(color);
        return this;
    }

    public GrPopUpSimple setBackgroundDialogColor(int color) {
        cardView.setBackgroundColor(color);
        cardView.setCardBackgroundColor(color);
        return this;
    }

    public GrPopUpSimple setSecondBackgroundColor(int color) {
        btnFirst.setBackgroundResource(color);
        return this;
    }

    public GrPopUpSimple setFirstBackgroundColor(int color) {
        btnSecond.setBackgroundResource(color);
        return this;
    }

    public GrPopUpSimple setExitColor(int color) {
        String hexColor = "#"+Integer.toHexString(ContextCompat.getColor(context, color));
        imageExit.setColorFilter(Color.parseColor(hexColor));
        return this;
    }

    public GrPopUpSimple setImage(int image) {
        imageDialog.setVisibility(View.VISIBLE);
        imageDialog.setImageResource(image);
        return this;
    }


    public GrPopUpSimple setExitEnable(boolean status) {
        if (!status)
            imageExit.setVisibility(View.GONE);
        return this;
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

