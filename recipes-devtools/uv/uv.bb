SUMMARY = "Recipe for installing uv package"
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

INSANE_SKIP:${PN} += "ldflags"
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
INHIBIT_PACKAGE_STRIP = "1"


SRC_URI = "https://github.com/astral-sh/uv/releases/download/0.5.25/uv-arm-unknown-linux-musleabihf.tar.gz"
SRC_URI[sha256sum] = "45ed53c20c5852d9dba97deeceaa1cb8fdccdaec69952c0940329e27b3830e83"

SOURCE_FILES_FOLDER := "${WORKDIR}/sources-unpack/"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${SOURCE_FILES_FOLDER}/uv-arm-unknown-linux-musleabihf/uv* ${D}${bindir}/
}

FILES_${PN} += "${D}${bindir}/uv*"
