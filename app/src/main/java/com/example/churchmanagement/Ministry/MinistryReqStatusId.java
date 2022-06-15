package com.example.churchmanagement.Ministry;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MinistryReqStatusId {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("ministry_id")
    @Expose
    private String ministryId;
    @SerializedName("member_id")
    @Expose
    private String memberId;
    @SerializedName("status")
    @Expose
    private String status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMinistryId() {
        return ministryId;
    }

    public void setMinistryId(String ministryId) {
        this.ministryId = ministryId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
