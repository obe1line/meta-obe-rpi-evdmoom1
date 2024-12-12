SUMMARY = "libdmtx is a library for reading and writing Data Matrix barcodes"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b58872aaf3a9d51c1f002b9d7940f4f1"

inherit autotools pkgconfig

SRC_URI = "git://github.com/dmtx/libdmtx.git;protocol=https;branch=master"
SRCREV = "dafd3dd813fb448eab0272f139d45a6b894912df"
PV = "0.7.7"
S = "${WORKDIR}/git"