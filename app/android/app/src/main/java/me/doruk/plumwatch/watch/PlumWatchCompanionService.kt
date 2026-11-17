package me.doruk.plumwatch.watch

import android.companion.AssociationInfo
import android.companion.CompanionDeviceService
import android.companion.DevicePresenceEvent
import android.os.Build
import androidx.annotation.RequiresApi

class PlumWatchCompanionService : CompanionDeviceService() {
    @RequiresApi(33)
    override fun onDeviceAppeared(associationInfo: AssociationInfo) {
        BleWatchManager.getInstance(applicationContext).onCompanionDeviceAppeared()
    }

    @RequiresApi(33)
    override fun onDeviceDisappeared(associationInfo: AssociationInfo) {
        BleWatchManager.getInstance(applicationContext).onCompanionDeviceDisappeared()
    }

    @Suppress("DEPRECATION")
    @RequiresApi(31)
    override fun onDeviceAppeared(address: String) {
        BleWatchManager.getInstance(applicationContext).onCompanionDeviceAppeared()
    }

    @Suppress("DEPRECATION")
    @RequiresApi(31)
    override fun onDeviceDisappeared(address: String) {
        BleWatchManager.getInstance(applicationContext).onCompanionDeviceDisappeared()
    }

    @RequiresApi(36)
    override fun onDevicePresenceEvent(event: DevicePresenceEvent) {
        val manager = BleWatchManager.getInstance(applicationContext)
        when (event.event) {
            DevicePresenceEvent.EVENT_BLE_APPEARED -> manager.onCompanionDeviceAppeared()
            DevicePresenceEvent.EVENT_BLE_DISAPPEARED -> manager.onCompanionDeviceDisappeared()
        }
    }
}
