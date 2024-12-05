FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

# replace with the modified libcamera repository
SRC_URI = "git://github.com/obe1line/libcamera.git;protocol=https;branch=ap1302-support "

# commit: Added evdmoom1 to sensor properties
SRCREV = "0a9ca36c481d355b33a7d2efac5d9bbb0464d485"

SRC_URI[sha256sum] = "8c8c925089ad7265f41a5c908317371d08242e81f0e42660872d1f26a4f874ff"

do_configure:remove() {
    sed -i -e 's|py_compile=True,||' ${S}/utils/ipc/mojo/public/tools/mojom/mojom/generate/template_expander.py
}