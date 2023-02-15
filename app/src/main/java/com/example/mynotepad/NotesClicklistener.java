package com.example.mynotepad;

import androidx.cardview.widget.CardView;

import com.example.mynotepad.models.Notes;

public interface NotesClicklistener {

    void onCLICK(Notes notes);
    void onLongClick (Notes notes , CardView cardView);
}
