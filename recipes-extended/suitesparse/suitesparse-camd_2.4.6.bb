require recipes-extended/suitesparse/suitesparse.inc

DESCRIPTION = "SuiteSparse CAMD:  a set of routines for permuting sparse matrices prior to \
    factorization.  Includes a version in C, a version in Fortran, and a MATLAB \
    mexFunction.\
"


LICENSE="BSD"

LIC_FILES_CHKSUM = "file://Doc/License.txt;md5=d0b9154e4034a3ef621f53f881e3c13c"


S = "${WORKDIR}/SuiteSparse/CAMD"


DEPENDS = "suitesparse-config"


do_compile() {
	     oe_runmake library
}

do_install() {
	     oe_runmake DESTDIR=${D} INSTALL=${D}/usr LDLIBS="-lm -lrt -lsuitesparseconfig" install
	     rm -Rf ${D}/usr/share
}