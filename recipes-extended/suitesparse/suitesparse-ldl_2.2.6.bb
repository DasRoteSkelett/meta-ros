require recipes-extended/suitesparse/suitesparse.inc

DESCRIPTION = "SuiteSparse LDL: a sparse LDL' factorization and solve package."


LICENSE="LGPL-2.1"

LIC_FILES_CHKSUM = "file://Doc/License.txt;md5=fb42ee297eee6b151bb05973f50061ef"


S = "${WORKDIR}/SuiteSparse/LDL"


DEPENDS = "suitesparse-config"


do_compile() {
	     oe_runmake library
}

do_install() {
	     oe_runmake DESTDIR=${D} INSTALL=${D}/usr LDLIBS="-lm -lrt -lsuitesparseconfig" install
	     rm -Rf ${D}/usr/share
}