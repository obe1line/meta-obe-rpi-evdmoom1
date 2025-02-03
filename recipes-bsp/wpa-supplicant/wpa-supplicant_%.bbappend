# use local folder due to wireless key and ssid
FILESEXTRAPATHS:prepend := "${HOME}/secure/:"

SRC_URI:append = " file://wpa_supplicant.conf "