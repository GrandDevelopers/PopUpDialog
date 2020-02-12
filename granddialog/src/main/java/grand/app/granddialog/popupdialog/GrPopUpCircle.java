package grand.app.granddialog.popupdialog;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;

import androidx.core.content.ContextCompat;
import grand.app.granddialog.R;

public class GrPopUpCircle extends BasePopUp {
    public GrPopUpCircle(Context context) {
        super(context,LayoutInflater.from(context).inflate(R.layout.layout_dialog_popup_circle_top, null, true));
    }

    public GrPopUpCircle setTitle(String title) {
        txtTitle.setText(title);
        return this;
    }

    public GrPopUpCircle setTitleColor(int color) {
        txtTitle.setTextColor(color);
        return this;
    }

    public GrPopUpCircle setFirstButtonText(String firstButtonText) {
        btnFirst.setText(firstButtonText);
        return this;
    }

    public GrPopUpCircle setFirstTextColor(int color) {
        this.btnFirst.setTextColor(color);
        return this;
    }

    public GrPopUpCircle setSecondTextColor(int color) {
        this.btnSecond.setTextColor(color);
        return this;
    }

    public GrPopUpCircle setSecondButtonText(String secondButtonText) {
        btnSecond.setText(secondButtonText);
        return this;
    }

    public GrPopUpCircle setMessage(String message) {
//        this.message = message;
        txtMessage.setText(message);
        return this;
    }

    public GrPopUpCircle setMessageColor(int color) {
        txtMessage.setTextColor(color);
        return this;
    }

    public GrPopUpCircle setBackgroundDialogColor(int color) {
        cardView.setBackgroundColor(color);
        cardView.setCardBackgroundColor(color);
        return this;
    }

    public GrPopUpCircle setSecondBackgroundColor(int color) {
        btnFirst.setBackgroundResource(color);
        return this;
    }

    public GrPopUpCircle setFirstBackgroundColor(int color) {
        btnSecond.setBackgroundResource(color);
        return this;
    }

    public GrPopUpCircle setExitColor(int color) {
        String hexColor = "#"+Integer.toHexString(ContextCompat.getColor(context, color));
        imageExit.setColorFilter(Color.parseColor(hexColor));
        return this;
    }

    public GrPopUpCircle setImage(int image) {
        imageDialog.setVisibility(View.VISIBLE);
        imageDialog.setImageResource(image);
        return this;
    }


    public GrPopUpCircle setExitEnable(boolean status) {
        if(!status)
            imageExit.setVisibility(View.GONE);
        return this;
    }

}

