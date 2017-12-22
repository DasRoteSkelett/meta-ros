require recipes-extended/suitesparse/suitesparse.inc

DESCRIPTION = "SuiteSparse CCOLAMD: constrained column approximate minimum degree ordering "


LICENSE="BSD"

LIC_FILES_CHKSUM = "file://Doc/License.txt;md5=6f2bad59ec6185e681f66425faaf13f6"


S = "${WORKDIR}/SuiteSparse/CCOLAMD"


DEPENDS = "suitesparse-config"


do_compile() {
	     oe_runmake library
}

do_install() {
	     oe_runmake DESTDIR=${D} INSTALL=${D}/usr LDLIBS="-lm -lrt -lsuitesparseconfig" install
	     rm -Rf ${D}/usr/share
}