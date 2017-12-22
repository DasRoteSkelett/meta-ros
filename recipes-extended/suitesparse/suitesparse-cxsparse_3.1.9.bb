require recipes-extended/suitesparse/suitesparse.inc

DESCRIPTION = "SuiteSparse Derived from CSparse.  Conversion originally by David Bateman, Motorola, \
and then modified by Tim Davis.  ANSI C99 is required, with support for \
the _Complex data type."



LICENSE="LGPL-2.1"

LIC_FILES_CHKSUM = "file://Doc/License.txt;md5=0e5191611fba4aac850756c5d598ff23"


S = "${WORKDIR}/SuiteSparse/CXSparse"


DEPENDS = "suitesparse-config"


do_compile() {
	     oe_runmake library
}

do_install() {
	     oe_runmake DESTDIR=${D} INSTALL=${D}/usr LDLIBS="-lm -lrt -lsuitesparseconfig" install
	     rm -Rf ${D}/usr/share
}