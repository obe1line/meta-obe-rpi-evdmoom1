mount /media/usb
rm /media/usb/*.raw
./setup.sh
raspi-gpio set 26 op
