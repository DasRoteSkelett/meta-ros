require recipes-extended/suitesparse/suitesparse.inc

DESCRIPTION = "SuiteSparse is a suite of sparse matrix algorithms"

LICENSE="BSD"

LIC_FILES_CHKSUM = "file://README.txt;beginline=11;endline=12;md5=9ff1c282ff52a9a7a7e8ec5897636796"

S = "${WORKDIR}/SuiteSparse/SuiteSparse_config"

FILES_${PN}-dev += " \
  /include \
  /include/SuiteSparse_config.h \
"

do_compile() {
	     oe_runmake static
}

do_install() {
	     oe_runmake DESTDIR=${D} INSTALL=${D}/usr LDLIBS="-lm -lrt" install
	     rm -Rf ${D}/share
}
