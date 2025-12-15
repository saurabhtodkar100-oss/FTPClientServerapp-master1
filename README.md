# Android FTP Client–Server Application

## Overview
This project is an Android-based FTP Client–Server application that enables fast and secure file transfer between devices over a local Wi-Fi network. It eliminates the need for USB cables, internet connectivity, or third-party cloud services.

## Key Features
- Wireless file upload and download over LAN
- Android device acts as an FTP Server
- Supports multiple client connections
- High-speed transfer up to 75 Mbps on local Wi-Fi
- No internet connection required
- Simple and user-friendly interface

## Technology Stack
- Language: Kotlin
- Platform: Android
- Protocol: FTP
- Server Library: Apache FTPServer
- IDE: Android Studio

## Application Architecture
- Android device runs an embedded FTP Server
- FTP clients connect using IP address and port
- File operations handled in background services

## Performance
- Achieves up to 75 Mbps transfer speed over local Wi-Fi
- Significantly faster than Bluetooth and traditional USB MTP transfer

## Use Cases
- Large file transfer between phone and PC
- Local network file sharing
- Offline data exchange

## Author
Saurabh Todkar
