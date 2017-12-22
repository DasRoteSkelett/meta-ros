require recipes-extended/suitesparse/suitesparse.inc

DESCRIPTION = "The COLAMD column approximate minimum degree ordering algorithm computes \
a permutation vector P such that the LU factorization of A (:,P) \
tends to be sparser than that of A.  The Cholesky factorization of \
(A (:,P))'*(A (:,P)) will also tend to be sparser than that of A'*A. \
SYMAMD is a symmetric minimum degree ordering method based on COLAMD, \
available as a MATLAB-callable function.  It constructs a matrix M such \
that M'*M has the same pattern as A, and then uses COLAMD to compute a column \
ordering of M.  Colamd and symamd tend to be faster and generate better \
orderings than their MATLAB counterparts, colmmd and symmmd."


LICENSE="BSD"

LIC_FILES_CHKSUM = "file://Doc/License.txt;md5=39d0916234d9db030cf028615f7429e1"


S = "${WORKDIR}/SuiteSparse/COLAMD"


DEPENDS = "suitesparse-config"


do_compile() {
	     oe_runmake library
}

do_install() {
	     oe_runmake DESTDIR=${D} INSTALL=${D}/usr LDLIBS="-lm -lrt -lsuitesparseconfig" install
	     rm -Rf ${D}/share
}