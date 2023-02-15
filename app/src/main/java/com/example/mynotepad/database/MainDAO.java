package com.example.mynotepad.database;


import static androidx.room.OnConflictStrategy.REPLACE;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.mynotepad.models.Notes;

import java.util.List;

@Dao    //Data access Object
public interface MainDAO {
    //insert method for the notes to the databse
    @Insert(onConflict = REPLACE)
    void insert(Notes notes);


    @Query("SELECT * FROM notes ORDER BY id DESC")
    List<Notes>getAll();

    @Query("UPDATE notes SET title =  :title, notes = :notes WHERE ID =:id")
    void update(int id ,String title , String notes);           //update items in database
    @Delete
    void delete (Notes notes);

    @Query("UPDATE notes SET pi nned = :pin WHERE ID = :id")
    void pin(int id , boolean pin);
}
