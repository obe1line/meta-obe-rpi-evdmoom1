# Raspberry PI Zero Wifi with EVDM-OOM1 camera module

## Requirements
python3 kas package

## Building
```bash
./kas_build.sh
```

## Write to SDCard
```bash
# bmaptool to write it to sdcard
```

## Develop the kernel module
```bash
devtool modify linux-raspberrypi
cd workspace/sources/linux-raspberrypi
# apply the patches
git apply ../../../../meta-obe-rpi-ap1302/recipes-kernel/linux/linux-raspberrypi/0001-ap1302-files.patch
git apply ../../../../meta-obe-rpi-ap1302/recipes-kernel/linux/linux-raspberrypi/0002-add-overlay-into-makefile.patch
# <edit the code and build with make etc.>
# E.g.
devtool build linux-raspberrypi
```

## TODO

* Fix: Copy the jac01.dtbo into /boot/overlays
* Fix: Crontab not running the camera.cron job
* evdmoom1_fw.bin copy - from where?
* set /etc/network/interfaces to "auto wlan0"
* add wpa_supplicant (using wpa_passphrase output)
* network time