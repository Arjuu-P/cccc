package com.example.churchmanagement.Model;

import com.example.churchmanagement.Authentication.AllMember;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResultData {

    @SerializedName("All_Members")
    @Expose
    private List<AllMember> allMembers = null;

    public List<AllMember> getAllMembers() {
        return allMembers;
    }

    public void setAllMembers(List<AllMember> allMembers) {
        this.allMembers = allMembers;
    }

}