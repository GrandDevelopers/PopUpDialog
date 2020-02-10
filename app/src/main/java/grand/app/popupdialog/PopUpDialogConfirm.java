package grand.app.popupdialog;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.content.ContextCompat;

public class PopUpDialogConfirm {
    private Context context;
    private View view = null;

    private String title, message, firstButtonText, secondButtonText;
    private Drawable firstButtonBackground, secondButtonBackground;
    private int image = -1;
    private float width = -1, height = -1;


    private AppCompatButton btnFirst, btnSecond;
    private TextView txtTitle, txtMessage;
    private ImageView imageDialog, imageExit;


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

    public PopUpDialogConfirm setFirstTextColor(int color){
        this.btnFirst.setTextColor(color);
        return this;
    }

    public PopUpDialogConfirm setSecondTextColor(int color){
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

    public PopUpDialogConfirm setSecondButtonBackground(Drawable secondButtonBackground) {
        this.secondButtonBackground = secondButtonBackground;
        return this;
    }

    public PopUpDialogConfirm setFirstButtonBackground(Drawable firstButtonBackground) {
        this.firstButtonBackground = firstButtonBackground;
        return this;
    }

    public PopUpDialogConfirm setExitColor(int color) {
        imageExit.setColorFilter(ContextCompat.getColor(context,color), android.graphics.PorterDuff.Mode.MULTIPLY);
        return this;
    }

    public PopUpDialogConfirm setImage(int image, float width, float height) {
        this.image = image;
        this.width = width;
        this.height = height;
        return this;
    }

    private void init() {
        view = LayoutInflater.from(context).inflate(R.layout.layout_dialog_remove, null, true);
        txtTitle = view.findViewById(R.id.tv_dialog_title);
        txtMessage = view.findViewById(R.id.tv_dialog_message);
        btnFirst = view.findViewById(R.id.btn_dialog_first);
        btnSecond = view.findViewById(R.id.btn_dialog_second);
        imageDialog = view.findViewById(R.id.img_dialog);
        imageExit = view.findViewById(R.id.img_dialog_close);
    }

    public void show(final PopUpDialogHelperActionInterface dialogHelperInterface) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(context, R.style.PauseDialog);
        final AlertDialog dialog = builder.create();
        dialog.getWindow().getAttributes().windowAnimations = R.style.PauseDialogAnimation;
        dialog.setView(view);
        dialog.show();
        txtTitle.setText(title);
        txtMessage.setText(message);
        btnFirst.setText(firstButtonText);
        btnSecond.setText(secondButtonText);
        btnFirst.setBackground(firstButtonBackground);
        btnSecond.setBackground(secondButtonBackground);
        if (image != -1) {
            imageDialog.setVisibility(View.VISIBLE);
            imageDialog.setImageResource(image);
            imageDialog.setMinimumWidth((int) width);
            imageDialog.setMaxWidth((int) width);
            imageDialog.setMaxHeight((int) height);
            imageDialog.setMinimumHeight((int) height);
        }
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
        imageExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });


    }
}

