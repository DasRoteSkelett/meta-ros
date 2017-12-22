require recipes-extended/suitesparse/suitesparse.inc

DESCRIPTION = "SuiteSparse SuiteSparseQR is a multithreaded, multifrontal, rank-revealing sparse QR \
factorization method, with optional GPU acceleration using NVIDIA GPUs."


LICENSE="GPL-2.0"

LIC_FILES_CHKSUM = "file://Doc/License.txt;md5=1c0c48edf24526b3cda72ce1a8a20b1d"


S = "${WORKDIR}/SuiteSparse/SPQR"


DEPENDS = "suitesparse-config suitesparse-amd suitesparse-colamd suitesparse-cholmod"


do_compile() {
	     oe_runmake BLAS="-lblas" library
}

do_install() {
	     oe_runmake DESTDIR=${D} INSTALL=${D}/usr LDLIBS="-lm -lrt -lsuitesparseconfig -lamd -lcolamd -lcholmod -llapack -lblas" install
	     rm -Rf ${D}/usr/share
}