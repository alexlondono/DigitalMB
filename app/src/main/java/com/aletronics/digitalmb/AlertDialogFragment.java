package com.aletronics.digitalmb;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;

/**
 * Created by Alex on 12/4/2016.
 */

public class AlertDialogFragment extends DialogFragment{
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context context = getActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(R.string.error_title).setMessage(R.string.error_message).setPositiveButton(R.string.error_ok_btn_text,null);

        AlertDialog dialog = builder.create();
        return dialog;
    }
}
