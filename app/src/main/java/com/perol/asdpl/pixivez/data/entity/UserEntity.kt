package com.perol.asdpl.pixivez.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user")
class UserEntity(
    var userid: Int,
    var username: String,
    var useremail: String,
    var ispro: Boolean,
    @ColumnInfo(defaultValue = "0")
    var x_restrict: Int,
    var userimage: String,
    var Device_token: String,
    var Refresh_token: String,
    var Authorization: String,
    @PrimaryKey(autoGenerate = true)
    var Id: Int = 0
)
