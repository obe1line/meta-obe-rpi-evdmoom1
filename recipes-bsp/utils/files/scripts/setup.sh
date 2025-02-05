raspi-gpio set 44 dl
sleep 5

rmmod evdmoom1

raspi-gpio set 44 dh

modprobe evdmoom1

media-ctl -v -d /dev/media0 -V ''\''evdmoom1'\'':0 [fmt:UYVY8_1X16/4208x3120 field:none]'
v4l2-ctl -d /dev/video0 -v width=4208,height=3120,pixelformat=UYVY --verbose