SUMMARY = "ZXing C++ port for barcode detection and decoding"
DESCRIPTION = "ZXing-C++ ('zebra crossing') is an open-source, multi-format linear/matrix barcode image processing library implemented in C++."
HOMEPAGE = "https://github.com/zxing-cpp/zxing-cpp/"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fa818a259cbed7ce8bc2a22d35a464fc"

FILESEXTRAPATHS:prepend := "${THISDIR}:"

SRC_URI = "git://github.com/zxing-cpp/zxing-cpp;branch=master;protocol=https;name=main"
SRC_URI += "git://github.com/nothings/stb.git;branch=master;protocol=https;name=stb;destsuffix=stb;"
SRC_URI += "file://stb.pc;subdir=stb;"

SRC_URI[sha256sum] = "5f873c5184c897c8d9d1b05df1e3d01b14910ce69607a117bd3277098a5836ac"

SRCREV_main = "a920817b6fe0508cc4aca9003003c2812a78e935"
SRCREV_stb = "5c205738c191bcb0abc65c4febfa9bd25ff35234"

SRCREV_FORMAT = "main_stb"

S = "${WORKDIR}/git"
inherit pkgconfig cmake

SRC := "${THISDIR}:"

PKG_CONFIG_PATH .= ":${UNPACKDIR}/stb"

BBCLASSEXTEND += "native nativesdk"

do_configure:prepend() {
    install -d ${STAGING_DIR_TARGET}/usr/include/stb
    install -m 0775 ${UNPACKDIR}/stb/*.h ${STAGING_DIR_TARGET}/usr/include/stb/
}

