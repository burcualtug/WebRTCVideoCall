package com.orion.webrtcsample2

import com.orioninnovation.tr.oiwebrtc.IceCandidate
import com.orioninnovation.tr.oiwebrtc.SessionDescription

interface SignalingClientListener {
    fun onConnectionEstablished()
    fun onOfferReceived(description: SessionDescription)
    fun onAnswerReceived(description: SessionDescription)
    fun onIceCandidateReceived(iceCandidate: IceCandidate)
    fun onCallEnded()
}