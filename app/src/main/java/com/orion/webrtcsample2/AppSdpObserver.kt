package com.orion.webrtcsample2

import com.orioninnovation.tr.oiwebrtc.SdpObserver
import com.orioninnovation.tr.oiwebrtc.SessionDescription

open class AppSdpObserver : SdpObserver {
    override fun onSetFailure(p0: String?) {
    }

    override fun onSetSuccess() {
    }

    override fun onCreateSuccess(p0: SessionDescription?) {
    }

    override fun onCreateFailure(p0: String?) {
    }
}