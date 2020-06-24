package com.jamybailly.dialog_corner_issue

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.view.ContextThemeWrapper
import androidx.fragment.app.DialogFragment

class DialogSample : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return requireActivity().let { activity ->
            val builder = AlertDialog.Builder(ContextThemeWrapper(activity, R.style.ThemeOverlay_App_MaterialAlertDialog))
            builder.setTitle("Test")
            builder.setPositiveButton("OK") { _, _ ->
            }
            builder.create()
        }
    }
}