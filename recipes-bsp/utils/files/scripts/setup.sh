rmmod evdmoom1
raspi-gpio set 44 dh
modprobe evdmoom1

# set formats for non-bayer output
media-ctl -v -d /dev/media0 --verbose -V ''\''evdmoom1'\'':0 [fmt:UYVY8_1X16/1920x1080 field:none]'
v4l2-ctl -d /dev/video0 --verbose -v width=1920,height=1080,pixelformat=UYVY
