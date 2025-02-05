dt=$(date '+%Y%m%d-%H%M%S')

raspi-gpio set 26 dh
v4l2-ctl -d /dev/v4l-subdev0 --set-ctrl white_balance_auto_preset=1 
v4l2-ctl -d /dev/v4l-subdev0 --set-ctrl contrast=0
v4l2-ctl -d /dev/v4l-subdev0 --set-ctrl brightness=0
v4l2-ctl -d /dev/v4l-subdev0 --set-ctrl exposure=$1
v4l2-ctl -d /dev/video0 --stream-skip=1 --stream-mmap --stream-count=1 --stream-to=image$dt.raw --verbose

raspi-gpio set 26 dl

cp image$dt.raw /media/usb
rm image$dt.raw

