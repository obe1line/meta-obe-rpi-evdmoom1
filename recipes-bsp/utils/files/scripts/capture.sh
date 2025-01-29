# list controls and mbus codes
v4l2-ctl -d /dev/v4l-subdev0 --verbose --list-ctrls-menus
v4l2-ctl -d /dev/v4l-subdev0 --list-subdev-mbus-codes

# set formats for non-bayer output
#media-ctl -v -d /dev/media0 --verbose -V ''\''evdmoom1'\'':0 [fmt:UYVY8_1X16/1920x1080 field:none]'
#v4l2-ctl -d /dev/video0 --verbose -v width=1920,height=1080,pixelformat=UYVY

# set formats for bayer output
#media-ctla -v -d /dev/media0 --verbose -V ''\''evdmoom1'\'':0 [fmt:RG10/1920x1080 field:none]'
#v4l2-ctl -d /dev/video0 --verbose -v width=1920,height=1080,pixelformat=RG10

# set formats for jpeg output
media-ctl -v -d /dev/media0 --verbose -V ''\''evdmoom1'\'':0 [fmt:JPEG_1X8/1920x1080 field:none]'
v4l2-ctl -d /dev/video0 --verbose -v width=1920,height=1080,pixelformat=???

# capture image
#v4l2-ctl -d /dev/video0 --verbose --stream-skip=0 --stream-mmap --stream-count=1 --stream-to=/tmp/image.raw
v4l2-ctl -d /dev/video0 --verbose --stream-skip=0 --stream-mmap --stream-count=1 --stream-to=/tmp/image.jpeg