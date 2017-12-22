require recipes-extended/suitesparse/suitesparse.inc

DESCRIPTION = "SuiteSparse AMD: a set of routines for permuting sparse matrices prior to \
    factorization.  Includes a version in C, a version in Fortran, and a MATLAB \
    mexFunction.is a suite of sparse matrix algorithms \
"



LICENSE="BSD"

LIC_FILES_CHKSUM = "file://Doc/License.txt;md5=1e9c216df23255c2cc290676276a051c"


S = "${WORKDIR}/SuiteSparse/AMD"


DEPENDS = "suitesparse-config"


do_compile() {
	     oe_runmake library
}

do_install() {
	     oe_runmake DESTDIR=${D} INSTALL=${D}/usr LDLIBS="-lm -lrt -lsuitesparseconfig" install
	     rm -Rf ${D}/usr/share
}