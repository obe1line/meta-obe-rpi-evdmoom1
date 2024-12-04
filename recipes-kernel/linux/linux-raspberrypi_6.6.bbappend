FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://0001-ap1302-files.patch"
SRC_URI += "file://0002-add-overlay-into-makefile.patch"
SRC_URI += "file://0003-jac01-driver.patch"
SRC_URI += "file://ap1302.cfg"

KERNEL_DEVICETREE:append = " overlays/jac01.dtbo"
