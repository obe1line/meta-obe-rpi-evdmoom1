# use local folder due to wireless key and ssid
FILESEXTRAPATHS:prepend := "/opt/secure/:"

SRC_URI:append = " file://wpa_supplicant.conf "

