require recipes-extended/suitesparse/suitesparse.inc

DESCRIPTION = "Suitesparse CHOLMOD is a set of routines for factorizing sparse symmetric positive \
    definite matrices of the form A or AA', updating/downdating a sparse \
    Cholesky factorization, solving linear systems, updating/downdating \
    the solution to the triangular system Lx=b, and many other sparse matrix \
    functions for both symmetric and unsymmetric matrices.  Its supernodal \
    Cholesky factorization relies on LAPACK and the Level-3 BLAS, and obtains \
    a substantial fraction of the peak performance of the BLAS.  Both real and \
    complex matrices are supported.  CHOLMOD is written in ANSI/ISO C, with both \
    C and MATLAB interfaces.  This code works on Microsoft Windows and many \
    versions of Unix and Linux."


LICENSE="LGPL-2.1"

LIC_FILES_CHKSUM = "file://Doc/License.txt;md5=5d8c39b6ee2eb7c9e0e226a333be30cc"


S = "${WORKDIR}/SuiteSparse/CHOLMOD"


DEPENDS = "suitesparse-config suitesparse-amd suitesparse-colamd suitesparse-ccolamd suitesparse-camd lapack openblas metis"


do_compile() {
	     oe_runmake BLAS="-lblas" library
}

do_install() {
	     oe_runmake BLAS="-lblas" DESTDIR=${D} INSTALL=${D}/usr LDLIBS="-lm -lrt -lsuitesparseconfig -lblas -llapack -lmetis -lamd -lcolamd -lccolamd -lcamd" install
	     rm -Rf ${D}/share
}