package grand.app.granddialog.popupdialog;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;

import androidx.core.content.ContextCompat;
import grand.app.granddialog.R;

public class PopUpCircle extends BasePopUp {
    public PopUpCircle(Context context) {
        super(context,LayoutInflater.from(context).inflate(R.layout.layout_dialog_popup_circle_top, null, true));
    }

    public PopUpCircle setTitle(String title) {
        txtTitle.setText(title);
        return this;
    }

    public PopUpCircle setTitleColor(int color) {
        txtTitle.setTextColor(color);
        return this;
    }

    public PopUpCircle setFirstButtonText(String firstButtonText) {
        btnFirst.setText(firstButtonText);
        return this;
    }

    public PopUpCircle setFirstTextColor(int color) {
        this.btnFirst.setTextColor(color);
        return this;
    }

    public PopUpCircle setSecondTextColor(int color) {
        this.btnSecond.setTextColor(color);
        return this;
    }

    public PopUpCircle setSecondButtonText(String secondButtonText) {
        btnSecond.setText(secondButtonText);
        return this;
    }

    public PopUpCircle setMessage(String message) {
//        this.message = message;
        txtMessage.setText(message);
        return this;
    }

    public PopUpCircle setMessageColor(int color) {
        txtMessage.setTextColor(color);
        return this;
    }

    public PopUpCircle setBackgroundDialogColor(int color) {
        cardView.setBackgroundColor(color);
        cardView.setCardBackgroundColor(color);
        return this;
    }

    public PopUpCircle setSecondBackgroundColor(int color) {
        btnFirst.setBackgroundResource(color);
        return this;
    }

    public PopUpCircle setFirstBackgroundColor(int color) {
        btnSecond.setBackgroundResource(color);
        return this;
    }

    public PopUpCircle setExitColor(int color) {
        String hexColor = "#"+Integer.toHexString(ContextCompat.getColor(context, color));
        imageExit.setColorFilter(Color.parseColor(hexColor));
        return this;
    }

    public PopUpCircle setImage(int image) {
        imageDialog.setVisibility(View.VISIBLE);
        imageDialog.setImageResource(image);
        return this;
    }


    public PopUpCircle setExitEnable(boolean status) {
        if(!status)
            imageExit.setVisibility(View.GONE);
        return this;
    }

}

