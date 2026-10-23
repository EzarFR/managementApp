package com.example.managementapp.data
import androidx.room.Entity
import androidx.room.PrimaryKey

//Memberitahu Room bahwa ini adalah entitas yang akan disimpan dalam database
@Entity(tableName = "table_tasks")

data class TaskEntity (
    //menambah primary key
    @PrimaryKey(autoGenerate = true)
    val id: Int=0,

    //kolom table tasks
    val mapel: String,
    val judulTugas: String,
    val deskripsi: String,
    val estTime: Int
)
