package com.yourname.myapplication

import android.content.Context
import android.os.Environment
import android.util.Log
import org.apache.ftpserver.FtpServer
import org.apache.ftpserver.FtpServerFactory
import org.apache.ftpserver.listener.ListenerFactory
import org.apache.ftpserver.usermanager.impl.BaseUser
import org.apache.ftpserver.usermanager.impl.WritePermission

class myftpserver (private val context: Context) {
    fun startserver()
    {
        val serverFactory = FtpServerFactory()
        val listnerFactory = ListenerFactory()
        listnerFactory.port = 2221
        serverFactory.addListener("default", listnerFactory.createListener())
        val userManager = serverFactory.userManager
        val user: BaseUser = BaseUser().apply {
            name = "admin"
            password = "12345678"
            homeDirectory=getStoragepath()
            authorities = listOf(WritePermission())

        }
        userManager.save(user)
        val server: FtpServer = serverFactory.createServer()
        server.start()

    }
    private fun getStoragepath(): String {
        val storagepath = Environment.getExternalStorageDirectory().absolutePath
        Log.e("FTPpath", storagepath)
        return storagepath
    }



}
