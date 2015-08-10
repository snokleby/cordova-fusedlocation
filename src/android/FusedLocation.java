package com.snoklecorp.fusedlocation;

import com.snoklecorp.fusedlocation.FusedLocationHelper;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;


import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

public class FusedLocation extends CordovaPlugin  {

    private static final String actiongetLocation = "getLocation";
    private static final String actiongetCurrentAddress = "getCurrentAddress";
    protected FusedLocationHelper locHelper;
    
    @Override
    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);
        Activity cordovaActivity = cordova.getActivity();

        locHelper = new FusedLocationHelper(cordovaActivity);
    }
    
    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals(actiongetLocation)) {
            locHelper.GetLocation(callbackContext);
            return true;
        }
        else if (action.equals(actiongetCurrentAddress)) {
            locHelper.GetAddress(callbackContext);
            return true;
        }

        return false;
    }
}


