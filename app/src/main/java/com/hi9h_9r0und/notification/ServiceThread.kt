package com.hi9h_9r0und.notification

import android.os.Handler

/**
 * Created by YHT on 2017-12-20.
 */
class ServiceThread(handler: Handler) : Thread() {
    lateinit var handler:Handler
    var isRun:Boolean=true

    init {
        this.handler=handler
    }

    public fun stopForever()
    {
        synchronized(this)
        {
            this.isRun=false
        }
    }

    override public fun run()
    {
        while (isRun)
        {
            handler.sendEmptyMessage(0)
            try {
                sleep(10000)
            }
            catch (e:Exception){}
        }
    }
}