package grand.app.popupdialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.icu.lang.UCharacter;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.card.MaterialCardView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;

public class PopUpDialogConfirm {
    private Context context;
    private View view = null;

    private String title, message, firstButtonText, secondButtonText;
    private int firstButtonColor = -1, secondButtonColor = -1;
    private int image = -1;


    private AppCompatButton btnFirst, btnSecond;
    private TextView txtTitle, txtMessage;
    private ImageView imageDialog, imageExit;
    private LinearLayout llDialogActions;
    private CardView materialCardView;


    public PopUpDialogConfirm(Context context) {
        this.context = context;
        init();
    }

    public PopUpDialogConfirm setTitle(String title) {
        this.title = title;
        return this;
    }

    public PopUpDialogConfirm setTitleColor(int color) {
        txtTitle.setTextColor(color);
        return this;
    }

    public PopUpDialogConfirm setFirstButtonText(String firstButtonText) {
        this.firstButtonText = firstButtonText;
        return this;
    }

    public PopUpDialogConfirm setFirstTextColor(int color) {
        this.btnFirst.setTextColor(color);
        return this;
    }

    public PopUpDialogConfirm setSecondTextColor(int color) {
        this.btnSecond.setTextColor(color);
        return this;
    }

    public PopUpDialogConfirm setSecondButtonText(String secondButtonText) {
        this.secondButtonText = secondButtonText;
        return this;
    }

    public PopUpDialogConfirm setMessage(String message) {
        this.message = message;
        return this;
    }

    public PopUpDialogConfirm setMessageColor(int color) {
        txtMessage.setTextColor(color);
        return this;
    }

    public PopUpDialogConfirm setBackgroundDialogColor(int color) {
        materialCardView.setBackgroundColor(color);
        return this;
    }

    public PopUpDialogConfirm setSecondBackgroundColor(int color) {
        this.firstButtonColor = color;
        return this;
    }

    public PopUpDialogConfirm setFirstBackgroundColor(int color) {
        this.secondButtonColor = color;
        return this;
    }

    public PopUpDialogConfirm setExitColor(int color) {
        imageExit.setColorFilter(ContextCompat.getColor(context, color), android.graphics.PorterDuff.Mode.MULTIPLY);
        return this;
    }

    public PopUpDialogConfirm setImage(int image) {
        this.image = image;
        return this;
    }


//    // 1=> vertical , 0=> horizontal
//    public PopUpDialogConfirm setOrientation(int orientation) {
//        if (orientation == LinearLayout.HORIZONTAL) {
//            llDialogActions.setOrientation(LinearLayout.HORIZONTAL);
//            llDialogActions.setWeightSum(2);
//            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
//                   0, LinearLayout.LayoutParams.WRAP_CONTENT);
//            params.weight = 1f;
//            params.setMargins(20, 20, 20, 15);
//            btnFirst.setLayoutParams(params);
//            btnSecond.setLayoutParams(params);
//
//        } else {
//
//        }
//        return this;
//    }


    private void init() {
        view = LayoutInflater.from(context).inflate(R.layout.layout_dialog_popup, null, true);
        txtTitle = view.findViewById(R.id.tv_dialog_title);
        txtMessage = view.findViewById(R.id.tv_dialog_message);
        btnFirst = view.findViewById(R.id.btn_dialog_first);
        btnSecond = view.findViewById(R.id.btn_dialog_second);
        imageDialog = view.findViewById(R.id.img_dialog);
        imageExit = view.findViewById(R.id.img_dialog_close);
        llDialogActions = view.findViewById(R.id.ll_dialog_popup_actions);
        materialCardView = view.findViewById(R.id.cv_dialog_popup);
    }

//    public void show(final PopUpDialogHelperActionInterface dialogHelperInterface) {
//        final AlertDialog.Builder builder = new AlertDialog.Builder(context, R.style.PauseDialog);
//        final AlertDialog dialog = builder.create();
//        dialog.getWindow().getAttributes().windowAnimations = R.style.PauseDialogAnimation;
//        dialog.setView(view);
//        dialog.show();
//        txtTitle.setText(title);
//        txtMessage.setText(message);
//        btnFirst.setText(firstButtonText);
//        btnSecond.setText(secondButtonText);
//        if (firstButtonColor != -1)
//            btnFirst.setBackgroundColor(firstButtonColor);
//        if (secondButtonColor != -1)
//            btnSecond.setBackgroundColor(secondButtonColor);
//        if (image != -1) {
//            imageDialog.setVisibility(View.VISIBLE);
//            imageDialog.setImageResource(image);
////            imageDialog.setMinimumWidth((int) width);
////            imageDialog.setMaxWidth((int) width);
////            imageDialog.setMaxHeight((int) height);
////            imageDialog.setMinimumHeight((int) height);
//        }
//        btnFirst.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                dialog.dismiss();
//                dialogHelperInterface.onFirstButton(dialog, v);
//            }
//        });
//        btnSecond.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                dialog.dismiss();
//                dialogHelperInterface.onSecondButton(dialog, v);
//            }
//        });
//        imageExit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                dialog.dismiss();
//            }
//        });
//    }

    public void show(final PopUpDialogHelperActionInterface dialogHelperInterface){
        final Dialog dialog = new Dialog(context, R.style.PauseDialog);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.getWindow().getAttributes().windowAnimations = R.style.PauseDialogAnimation;
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.setContentView(R.layout.layout_dialog_popup);



        txtTitle.setText(title);
        txtMessage.setText(message);
        btnFirst.setText(firstButtonText);
        btnSecond.setText(secondButtonText);
        if (firstButtonColor != -1)
            btnFirst.setBackgroundColor(firstButtonColor);
        if (secondButtonColor != -1)
            btnSecond.setBackgroundColor(secondButtonColor);
        if (image != -1) {
            Log.e("setImage","True");
            imageDialog.setVisibility(View.VISIBLE);
            imageDialog.setImageResource(image);
        }
        Log.e("setImage","false");
        btnFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                dialogHelperInterface.onFirstButton(dialog, v);
            }
        });
        btnSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                dialogHelperInterface.onSecondButton(dialog, v);
            }
        });
//        imageExit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                dialog.dismiss();
//            }
//        });
        dialog.show();
    }
}

