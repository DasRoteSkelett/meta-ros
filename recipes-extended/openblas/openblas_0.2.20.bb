DESCRIPTION = "OpenBLAS is an optimized BLAS library based on GotoBLAS2 1.13 BSD version."
SUMMARY = "OpenBLAS : An optimized BLAS library"
AUTHOR = "Alexander Leiva <norxander@gmail.com>"
HOMEPAGE = "http://www.openblas.net/"
PRIORITY= "optional"
SECTION = "libs"
LICENSE = "BSD"
PR = "r0"

LIC_FILES_CHKSUM = "file://LICENSE;md5=5adf4792c949a00013ce25d476a2abc0"

SRC_URI = "https://github.com/xianyi/OpenBLAS/archive/v${PV}.tar.gz"
SRC_URI[md5sum] = "48637eb29f5b492b91459175dcc574b1"
SRC_URI[sha256sum] = "5ef38b15d9c652985774869efd548b8e3e972e1e99475c673b25537ed7bcf394"

S = "${WORKDIR}/OpenBLAS-${PV}"

inherit cmake

DEPENDS = " libgfortran "