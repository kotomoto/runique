package com.koto.core.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.koto.core.database.dao.AnalyticsDao
import com.koto.core.database.dao.RunDao
import com.koto.core.database.dao.RunPendingSyncDao
import com.koto.core.database.entity.DeletedRunSyncEntity
import com.koto.core.database.entity.RunEntity
import com.koto.core.database.entity.RunPendingSyncEntity

@Database(
    entities = [
        RunEntity::class,
        RunPendingSyncEntity::class,
        DeletedRunSyncEntity::class
    ],
    version = 1
)
abstract class RunDatabase : RoomDatabase() {

    abstract val runDao: RunDao
    abstract val runPendingSyncDao: RunPendingSyncDao
    abstract val analyticsDao: AnalyticsDao
}
