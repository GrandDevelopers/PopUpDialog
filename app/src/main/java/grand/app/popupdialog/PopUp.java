package grand.app.popupdialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;

import androidx.core.content.ContextCompat;

public class PopUp extends BasePopUp {
    private View view = null;

    public PopUp(Context context) {
        super(context, LayoutInflater.from(context).inflate(R.layout.layout_dialog_popup, null, true));
    }

    public PopUp setTitle(String title) {
        txtTitle.setText(title);
        return this;
    }

    public PopUp setTitleColor(int color) {
        txtTitle.setTextColor(color);
        return this;
    }

    public PopUp setFirstButtonText(String firstButtonText) {
        btnFirst.setText(firstButtonText);
        return this;
    }

    public PopUp setFirstTextColor(int color) {
        this.btnFirst.setTextColor(color);
        return this;
    }

    public PopUp setSecondTextColor(int color) {
        this.btnSecond.setTextColor(color);
        return this;
    }

    public PopUp setSecondButtonText(String secondButtonText) {
        btnSecond.setText(secondButtonText);
        return this;
    }

    public PopUp setMessage(String message) {
//        this.message = message;
        txtMessage.setText(message);
        return this;
    }

    public PopUp setMessageColor(int color) {
        txtMessage.setTextColor(color);
        return this;
    }

    public PopUp setBackgroundDialogColor(int color) {
        cardView.setBackgroundColor(color);
        cardView.setCardBackgroundColor(color);
        return this;
    }

    public PopUp setSecondBackgroundColor(int color) {
        btnFirst.setBackgroundResource(color);
        return this;
    }

    public PopUp setFirstBackgroundColor(int color) {
        btnSecond.setBackgroundResource(color);
        return this;
    }

    public PopUp setExitColor(int color) {
        imageExit.setColorFilter(ContextCompat.getColor(context, color), android.graphics.PorterDuff.Mode.MULTIPLY);
        return this;
    }

    public PopUp setImage(int image) {
        imageDialog.setVisibility(View.VISIBLE);
        imageDialog.setImageResource(image);
        return this;
    }


    public PopUp setExitEnable(boolean status) {
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

