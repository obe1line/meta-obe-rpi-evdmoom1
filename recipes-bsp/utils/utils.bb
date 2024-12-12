LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI = ""
SRC_URI:append = " file://scripts/capture.sh"
SRC_URI:append = " file://scripts/debug.sh"
SRC_URI:append = " file://scripts/setup.sh"
SRC_URI:append = " file://camera.cron"

SOURCE_FILES_FOLDER := "${WORKDIR}/sources-unpack/"

do_install() {
    install -d ${D}/home/root/scripts

    install -m 0755 ${SOURCE_FILES_FOLDER}/scripts/capture.sh ${D}/home/root/scripts/capture.sh
    install -m 0755 ${SOURCE_FILES_FOLDER}/scripts/debug.sh ${D}/home/root/scripts/debug.sh
    install -m 0755 ${SOURCE_FILES_FOLDER}/scripts/setup.sh ${D}/home/root/scripts/setup.sh

    install -d ${D}/${sysconfdir}/cron.d/
    install ${SOURCE_FILES_FOLDER}/camera.cron ${D}/${sysconfdir}/cron.d/
}

FILES:${PN}:append = " /home/root/scripts/capture.sh"
FILES:${PN}:append = " /home/root/scripts/debug.sh"
FILES:${PN}:append = " /home/root/scripts/setup.sh"
