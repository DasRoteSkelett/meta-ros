DESCRIPTION = "rosgraph contains the rosgraph command-line tool, which prints \
information about the ROS Computation Graph."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

RDEPENDS_${PN} = "${PYTHON_PN}-xmlrpc ${PYTHON_PN}-threading ${PYTHON_PN}-rospkg rospy ${PYTHON_PN}-netifaces"

require ros-comm.inc

SRC_URI += " file://0001-rosgraph_no_stderr.patch "

ROS_PKG_SUBDIR = "tools"
