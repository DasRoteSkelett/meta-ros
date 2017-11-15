DESCRIPTION = "This package contains a recent version of the Bayesian Filtering Library (BFL), distributed by the Orocos Project."
SECTION = "devel"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=7fbc338309ac38fefcd64b04bb903e34"

DEPENDS = "cppunit boost"

SRC_URI = "https://github.com/ros-gbp/${PN}-release/archive/release/${ROSDISTRO}/${PN}/${PV}.tar.gz"
SRC_URI[md5sum] = "e00f4ae5e62aab3925ea8092a06564eb"
SRC_URI[sha256sum] = "54d9c8ae3cd477fa0a413e2100233e5f450760df4ad7dd8f63723889d913cea6"

SRC_URI += "file://0001-drop-pathes-to-unused-libraries-for-passing-the-qa_s.patch"

S = "${WORKDIR}/bfl-release-release-${ROSDISTRO}-${P}"

inherit cmake faulty-solibs

PACKAGES += "${PN}-tests"

FILES_${PN}-dbg += "${bindir}/bfl/.debug"
FILES_${PN}-tests = "${bindir}/bfl/*"
