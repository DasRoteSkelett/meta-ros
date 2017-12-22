DESCRIPTION = "The libg2o library from http://openslamorg/g2ohtml"

AUTHOR = "Rainer Kuemmerle"

SECTION = "devel"

LICENSE = "BSD"

LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost libeigen  suitesparse-cholmod suitesparse-cxsparse lapack"

SRC_URI = "https://github.com/ros-gbp/${ROS_SPN}-release/archive/release/kinetic/${ROS_SPN}/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "cb8eb60db53cc513c4ea2499a184a967"
SRC_URI[sha256sum] = "a51f3f9fcb38e1546632f03459c5247c9362fbf54d7b7beea93a07875256571e"

S = "${WORKDIR}/libg2o-release-release-kinetic-libg2o/"

inherit catkin

