package com.moengage.supdoc.flutter.supdoc_flutter

import com.moengage.core.DataCenter
import com.moengage.core.MoEngage
import com.moengage.flutter.MoEInitializer
import io.flutter.app.FlutterApplication

class FlutterApp: FlutterApplication() {

    override fun onCreate() {
        super.onCreate()
        val moEngage = MoEngage.Builder(this, "8SIW681S80Z08KSHQFSTIZ8T", DataCenter.DATA_CENTER_1);
        MoEInitializer.initialiseDefaultInstance(this, moEngage);
    }
}