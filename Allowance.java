package com.example.agendiario;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "allowance")

public class Allowance {

    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "allowanceId")
    private int mId;

    @Nullable
    @ColumnInfo(name = "allowancenDescription")
    private String mDescription;

    private String mValue;

    public Museum(@Nullable String description, Double value, int importance , String creationDate) {
        mDescription = description;
        mValue = value;
        mImportance = importance;
        mCreationDate = creationDate;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public String getValue() {
        return mValue;
    }

    public void setValue(Double value) {
        mValue = value;
    }

    public int getImportance() {
        return mImportance;
    }

    public void setImportance(int importance) {
        mImportance = importance;
    }

    public String getCreationDate() {
        return mCreationDate;
    }

    public void setCreationDate(String creationDate) {
        mCreationDate = creationDate;
    }

    private int mImportance;
    private String mCreationDate;

}
