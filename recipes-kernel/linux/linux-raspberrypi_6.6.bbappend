FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += " file://0001-dt-and-make-files.patch "
SRC_URI += " file://0002-add-overlay-into-makefile.patch "
SRC_URI += " file://0003-evdmoom1-driver.patch "
SRC_URI += " file://0004-added-missing-controls.patch "
SRC_URI += " file://0005-integrated-test-pattern.patch "
SRC_URI += " file://0006-fixing-up-test-pattern-control.patch "

SRC_URI:append = " file://evdmoom1.cfg "


KERNEL_DEVICETREE:append = " overlays/jac01.dtbo"
FILES:${PN} += "/boot/overlays/jac01.dtbo"

# do not autoload the driver as it requires a power pin enable to see the device on the I2C bus
KERNEL_MODULE_AUTOLOAD:remove = "evdmoom1"

# add 4Gb extra space
IMAGE_ROOTFS_EXTRA_SPACE = "4194304"
