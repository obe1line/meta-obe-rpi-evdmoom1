SUMMARY = "ZXing C++ port for barcode detection and decoding"
DESCRIPTION = "ZXing-C++ ('zebra crossing') is an open-source, multi-format linear/matrix barcode image processing library implemented in C++."
HOMEPAGE = "https://github.com/zxing-cpp/zxing-cpp/"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=31315a70d3ab1f02fe25affbb0a4e380"

inherit python_poetry_core pypi cmake pkgconfig python3-dir

PYPI_SRC_URI = "https://files.pythonhosted.org/packages/d9/f2/b781bf6119abe665069777e3c0f154752cf924fe8a55fca027243abbc555/zxing_cpp-2.3.0.tar.gz"
S = "${WORKDIR}/zxing_cpp-${PV}"
SRC_NAME = "zxing-cpp"
SRC_URI[sha256sum] = "3babedb67a4c15c9de2c2b4c42d70af83a6c85780c1b2d9803ac64c6ae69f14e"

DEPENDS += "cmake python3-pybind11 python3"

EXTRA_OECMAKE += "-DZXING_WRITERS=NEW -DZXING_PYTHON_MODULE=ON -DZXING_EXAMPLES=OFF -DZXING_USE_BUNDLED_ZINT=ON"
EXTRA_OECMAKE += "-DPython3_INCLUDE_DIR=${STAGING_INCDIR}/${PYTHON_DIR}"
EXTRA_OECMAKE += "-DPython3_SITE_DIR=${PYTHON_SITEPACKAGES_DIR}"
EXTRA_OECMAKE += "-DPYTHON_ABI=${PYTHON_ABI}"
EXTRA_OECMAKE += "-DPYTHON3_PACKAGES_PATH:PATH=${baselib}/python${PYTHON_BASEVERSION}/site-packages"

INSANE_SKIP:${PN} = "already-stripped"
FILES:${PN} += "${libdir}"