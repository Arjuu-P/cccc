package com.example.churchmanagement.Retrofit;

import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface Api {

    @POST(APIClient.APPEND_URL + "addMinistry")
    Call<JsonObject> addMinistry(@Body JsonObject object);

    @POST(APIClient.APPEND_URL + "register")
    Call<JsonObject> register(@Body JsonObject object);

    @POST(APIClient.APPEND_URL + "login")
    Call<JsonObject> login(@Body JsonObject object);

    @POST(APIClient.APPEND_URL + "getAllMembers")
    Call<JsonObject> getAllMembers(@Body JsonObject object);

    @POST(APIClient.APPEND_URL + "getAllMinistry")
    Call<JsonObject> getAllMinistry(@Body JsonObject object);

    @POST(APIClient.APPEND_URL + "updateMinistry")
    Call<JsonObject> updateMinistry(@Body JsonObject object);

    @POST(APIClient.APPEND_URL + "del_ministry")
    Call<JsonObject> del_ministry(@Body JsonObject object);

    @POST(APIClient.APPEND_URL + "addMinistryRequest")
    Call<JsonObject> addMinistryRequest(@Body JsonObject object);

    @POST(APIClient.APPEND_URL + "getMinistryRequestStatus")
    Call<JsonObject> getMinistryRequestStatus(@Body JsonObject object);

    @POST(APIClient.APPEND_URL + "getAllMembersInMinistry")
    Call<JsonObject> getAllMembersInMinistry(@Body JsonObject object);

    @POST(APIClient.APPEND_URL + "updateMinistryRequest")
    Call<JsonObject> updateMinistryRequest(@Body JsonObject object);

    @POST(APIClient.APPEND_URL + "deleteMinistryRequest")
    Call<JsonObject> deleteMinistryRequest(@Body JsonObject object);

    /*  CHURCH EVENTS NOT COMPLETED*/
    @POST(APIClient.APPEND_URL + "addChurchEvents")
    Call<JsonObject> addChurchEvents(@Body JsonObject object);

    @POST(APIClient.APPEND_URL + "getAllChurchEvents")
    Call<JsonObject> getAllChurchEvents(@Body JsonObject object);

    @POST(APIClient.APPEND_URL + "updateChurchEvents")
    Call<JsonObject> updateChurchEvents(@Body JsonObject object);

    @POST(APIClient.APPEND_URL + "deleteChurchEvents")
    Call<JsonObject> deleteChurchEvents(@Body JsonObject object);

    /*  ADVERTISEMENTS/NEWS NOT COMPLETED*/
    @POST(APIClient.APPEND_URL + "addAdvertisements")
    Call<JsonObject> addAdvertisements(@Body JsonObject object);

    @POST(APIClient.APPEND_URL + "getAllAdvertisements")
    Call<JsonObject> getAllAdvertisements(@Body JsonObject object);

    @POST(APIClient.APPEND_URL + "updateAdvertisements")
    Call<JsonObject> updateAdvertisements(@Body JsonObject object);

    @POST(APIClient.APPEND_URL + "deleteAdvertisements")
    Call<JsonObject> deleteAdvertisements(@Body JsonObject object);

    @POST(APIClient.APPEND_URL + "addAppointment")
    Call<JsonObject> addAppointment(@Body JsonObject object);

    @POST(APIClient.APPEND_URL + "getAllAppointments")
    Call<JsonObject> getAllAppointments(@Body JsonObject object);

    @POST(APIClient.APPEND_URL + "updateAppointmenmtStatus")
    Call<JsonObject> updateAppointmenmtStatus(@Body JsonObject object);

    @POST(APIClient.APPEND_URL + "addDonations")
    Call<JsonObject> addDonations(@Body JsonObject object);

    @POST(APIClient.APPEND_URL + "getAllDonations")
    Call<JsonObject> getAllDonations(@Body JsonObject object);

    @POST(APIClient.APPEND_URL + "addAmenities")
    Call<JsonObject> addAmenities(@Body JsonObject object);

    @POST(APIClient.APPEND_URL + "getAllAmenities")
    Call<JsonObject> getAllAmenities(@Body JsonObject object);

    @POST(APIClient.APPEND_URL + "addConfirmBookingRequest")
    Call<JsonObject> addConfirmBookingRequest(@Body JsonObject object);

    @POST(APIClient.APPEND_URL + "getBookingCStatus")
    Call<JsonObject> getBookingCStatus(@Body JsonObject object);

    @POST(APIClient.APPEND_URL + "getAllAdminBookings")
    Call<JsonObject> getAllAdminBookings(@Body JsonObject object);

    @POST(APIClient.APPEND_URL + "updateBStatus")
    Call<JsonObject> updateBStatus(@Body JsonObject object);

    @POST(APIClient.APPEND_URL + "updateUStatus")
    Call<JsonObject> updateUStatus(@Body JsonObject object);























}
