FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append = " file://0001-dt-and-make-files.patch "
SRC_URI:append = " file://0002-add-overlay-into-makefile.patch "
SRC_URI:append = " file://0003-evdmoom1-kernel-module.patch "
SRC_URI:append = " file://0004-added-manual-controls.patch "
SRC_URI:append = " file://evdmoom1.cfg "
SRC_URI:append = " file://dynamic_debug.cfg "


KERNEL_DEVICETREE:append = " overlays/jac01.dtbo"
FILES:${PN} += "/boot/overlays/jac01.dtbo"

# do not autoload the driver as it requires a power pin enable to see the device on the I2C bus
KERNEL_MODULE_AUTOLOAD:remove = "evdmoom1"

# add 4Gb extra space
IMAGE_ROOTFS_EXTRA_SPACE = "4194304"

SOURCE_FILES_FOLDER := "/opt/secure/"

do_install:append() {
    # copy the firmware for the driver from the private path
    install -d ${D}/lib/firmware/
    install -m 0444 ${SOURCE_FILES_FOLDER}/evdmoom1_fw.bin ${D}/lib/firmware/
}