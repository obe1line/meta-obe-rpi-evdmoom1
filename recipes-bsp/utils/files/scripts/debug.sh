# enable debugging of pipeline drivers
echo 'module evdmoom1 +p' > /sys/kernel/debug/dynamic_debug/control
echo 'module unicam-image +p' > /sys/kernel/debug/dynamic_debug/control
echo 'module v4l2* +p' > /sys/kernel/debug/dynamic_debug/control
echo 'module video* +p' > /sys/kernel/debug/dynamic_debug/control

# raise the log level of the kernel
dmesg -n 8