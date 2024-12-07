FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += " file://0001-ap1302-files.patch "
SRC_URI += " file://0002-add-overlay-into-makefile.patch "
SRC_URI += " file://0003-evdmoom1-driver.patch "

SRC_URI:append = " file://evdmoom1.cfg "


KERNEL_DEVICETREE:append = " overlays/jac01.dtbo"
#FILES:${PN} += "/boot/arch/arm/dt/overlays/jac01.dtbo"
FILES:${PN} += "jac01.dtbo"