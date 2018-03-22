SUMMARY = "Linear Algebra PACKage"
URL = "http://www.netlib.org/lapack"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=930f8aa500a47c7dab0f8efb5a1c9a40"

DEPENDS = " gcc-runtime libgfortran gcc "

PV = "3.8.0"

SRC_URI = "http://www.netlib.org/lapack/lapack-${PV}.tar.gz"
SRC_URI[md5sum] = "96591affdbf58c450d45c1daa540dbd2"
SRC_URI[sha256sum] = "deb22cc4a6120bff72621155a9917f485f96ef8319ac074a7afbc68aab88bcf6"

#SRC_URI += "file://make.inc;md5=27f41711dd1bc0b15e3780e6bdf46d92"
#SRC_URI += "file://001-SRC_Makefile.patch;md5=36222be8bb239cdd62599f51f6720074"
#SRC_URI += "file://002-SRC_BLAS_Makefile.patch;md5=902cc505ecfff12f8e4d1f552b418ffc"

EXTRA_OECMAKE = " -DBUILD_SHARED_LIBS=ON "
#-DCBLAS=ON

inherit cmake pkgconfig

FILES_${PN}-dev +=" \	
  /usr/lib/cmake \
  /usr/lib/cmake/lapack-3.8.0 \
  /usr/lib/cmake/lapack-3.8.0/lapack-targets.cmake \
  /usr/lib/cmake/lapack-3.8.0/lapack-targets-release.cmake \
  /usr/lib/cmake/lapack-3.8.0/lapack-config.cmake \
  /usr/lib/cmake/lapack-3.8.0/lapack-config-version.cmake \
"

#do_configure_prepend() {
#		       export FC="$FC -std=f2008"
#}