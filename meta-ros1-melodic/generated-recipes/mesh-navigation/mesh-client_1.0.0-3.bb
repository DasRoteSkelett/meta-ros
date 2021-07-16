# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The mesh_client package"
AUTHOR = "Sebastian Pütz <spuetz@uos.de>"
ROS_AUTHOR = "Sebastian Pütz <spuetz@uos.de>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "BSD-3"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=76ea7cd512d17201ff67e2488e8c4ce3"

ROS_CN = "mesh_navigation"
ROS_BPN = "mesh_client"

ROS_BUILD_DEPENDS = " \
    curl \
    jsoncpp \
    libeigen \
    lvr2 \
    pkgconfig \
    roscpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    curl \
    jsoncpp \
    libeigen \
    lvr2 \
    roscpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    curl \
    jsoncpp \
    libeigen \
    lvr2 \
    roscpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/uos-gbp/mesh_navigation-release/archive/release/melodic/mesh_client/1.0.0-3.tar.gz
ROS_BRANCH ?= "branch=release/melodic/mesh_client"
SRC_URI = "git://github.com/uos-gbp/mesh_navigation-release;${ROS_BRANCH};protocol=https"
SRCREV = "fc7d36a5d895cfb74150ed8c4874e61b651094ec"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}