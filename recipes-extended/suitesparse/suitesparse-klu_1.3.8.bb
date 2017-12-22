require recipes-extended/suitesparse/suitesparse.inc

DESCRIPTION = "SuiteSparse KLU"


LICENSE="LGPL-2.1"

LIC_FILES_CHKSUM = "file://Doc/License.txt;md5=25d3c5be4c5e7f870a517d6953262f45"


S = "${WORKDIR}/SuiteSparse/KLU"


DEPENDS = "suitesparse-config suitesparse-amd suitesparse-colamd suitesparse-btf"


do_compile() {
	     oe_runmake library
}

do_install() {
	     oe_runmake DESTDIR=${D} INSTALL=${D}/usr LDLIBS="-lm -lrt -lsuitesparseconfig -lamd -lcolamd -lbtf" install
	     rm -Rf ${D}/usr/share
}