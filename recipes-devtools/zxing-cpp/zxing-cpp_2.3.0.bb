SUMMARY = "ZXing C++ port for barcode detection and decoding"
DESCRIPTION = "ZXing-C++ ('zebra crossing') is an open-source, multi-format linear/matrix barcode image processing library implemented in C++."
HOMEPAGE = "https://github.com/zxing-cpp/zxing-cpp/"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=31315a70d3ab1f02fe25affbb0a4e380"

#RDEPENDS:${PN} = "python3-core"
DEPENDS += "cmake python3-pybind11 python3-native"

BBCLASSEXTEND = "native"

#RDEPENDS:${PN} = "python3-core python3-setuptools-scm"
#DEPENDS += "apt python3-distutils-extra-native cmake python3-pybind11 python3-wheel-native python3-setuptools-scm"
#DEPENDS += "python3-poetry-core-native cmake python3-pybind11"
#BBCLASSEXTEND = "native nativesdk"

SRC_NAME = "zxing-cpp"

# micro-QR support
EXTRA_OECMAKE += "-DZXING_WRITERS=NEW -DZXING_PYTHON_MODULE=ON -DZXING_EXAMPLES=OFF -DZXING_USE_BUNDLED_ZINT=ON"
EXTRA_OECMAKE += "-DPython3_INCLUDE_DIR=${STAGING_DIR_TARGET}/usr/include/python3.13/"
EXTRA_OECMAKE += "-DPython3_SITE_DIR=${PYTHON_SITEPACKAGES_DIR}"
EXTRA_OECMAKE += "-DPython3_ROOT_DIR=/usr/bin/python3-native"

#EXTRA_OECMAKE += "-DZXING_PYTHON_INSTALL_LIBDIR=${STAGING_DIR_TARGET}/usr/lib/"
#EXTRA_OECMAKE += "-DPython3_SITELIB=${STAGING_DIR_TARGET}/lib/python3.13/site-packages/"

#EXTRA_OECMAKE = "-DLIB='${baselib}' \
#                 -DPYTHON_INCLUDE_PATH=${STAGING_INCDIR}/python${PYTHON_BASEVERSION} \
#                 -DPYTHON_ABI=${PYTHON_ABI} \
#                 -DBUILD_PYTHON3=NO \
#                 -DPython3_SITE_DIR=${PYTHON_SITEPACKAGES_DIR} \
#                 "

#wrong arch!
#FILES:${PN} =+"${libdir}/zxingcpp.cpython-313-x86_64-linux-gnu.so ${PYTHON_SITEPACKAGES_DIR}/*"

inherit pypi cmake pkgconfig

#inherit python_poetry_core pypi cmake python_setuptools_build_meta pkgconfig
#inherit python_poetry_core pypi cmake pkgconfig

PYPI_SRC_URI = "https://files.pythonhosted.org/packages/d9/f2/b781bf6119abe665069777e3c0f154752cf924fe8a55fca027243abbc555/zxing_cpp-2.3.0.tar.gz"
S = "${WORKDIR}/zxing_cpp-${PV}"

SRC_URI[sha256sum] = "3babedb67a4c15c9de2c2b4c42d70af83a6c85780c1b2d9803ac64c6ae69f14e"

