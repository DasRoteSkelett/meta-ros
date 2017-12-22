require recipes-extended/suitesparse/suitesparse.inc

DESCRIPTION = "SuiteSparse UMFPACK :  a set of routines solving sparse linear systems via LU \
    factorization."


LICENSE="GPL-2.0"

LIC_FILES_CHKSUM = "file://Doc/License.txt;md5=a01bebe5675a294f07597691bedc3c5b"


S = "${WORKDIR}/SuiteSparse/UMFPACK"


DEPENDS = "suitesparse-config lapack suitesparse-amd suitesparse-cholmod"


do_compile() {
	     oe_runmake BLAS="-lblas" library
}

do_install() {
	     oe_runmake DESTDIR=${D} INSTALL=${D}/usr LDLIBS="-lm -lrt -lsuitesparseconfig -lamd -lcholmod -lblas -llapack" BLAS="-lblas" install
	     rm -Rf ${D}/usr/share
}