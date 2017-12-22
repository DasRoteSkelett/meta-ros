require recipes-extended/suitesparse/suitesparse.inc

DESCRIPTION = "SuiteSparse BTF is a software package for permuting a matrix into block upper triangular \
form.  It includes a maximum transversal algorithm, which finds a permutation \
of a square or rectangular matrix so that it has a zero-free diagonal (if one \
exists); otherwise, it finds a maximal matching which maximizes the number of \
nonzeros on the diagonal.  The package also includes a method for finding the \
strongly connected components of a graph.  These two methods together give the \
permutation to block upper triangular form."


LICENSE="LGPL-2.1"

LIC_FILES_CHKSUM = "file://Doc/License.txt;md5=99ef727a9426a71dacc4e6dcbad36a2e"


S = "${WORKDIR}/SuiteSparse/BTF"


DEPENDS = "suitesparse-config"


do_compile() {
	     oe_runmake library
}

do_install() {
	     oe_runmake DESTDIR=${D} INSTALL=${D}/usr LDLIBS="-lm -lrt -lsuitesparseconfig" install
	     rm -Rf ${D}/usr/share
}