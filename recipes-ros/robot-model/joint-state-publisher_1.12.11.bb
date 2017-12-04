DESCRIPTION = "This package contains a tool for setting and publishing \
joint state values for a given URDF."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rospy python-qt-binding sensor-msgs"

require robot-model.inc

RDEPENDS_${PN} = " python-qt-binding controller-manager-msgs sensor-msgs " 
