package com.example.managementapp.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface TaskDao{
    //Simpan data baru ke database
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTask(task: TaskEntity)

    //menampilkan data
    @Query(value = "SELECT * FROM table_tasks ORDER BY id DESC")
    fun getAllTasks(): Flow<List<TaskEntity>>

    //update data
    @Update
    suspend fun updateTask(task: TaskEntity)

    //hapus data
    @Delete
    suspend fun deleteTask(task: TaskEntity)
}

class TaskDAO {
}