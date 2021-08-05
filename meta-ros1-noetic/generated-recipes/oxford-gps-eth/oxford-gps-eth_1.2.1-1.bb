# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "Ethernet interface to OxTS GPS receivers (NCOM packet structure)"
AUTHOR = "Kevin Hallenbeck <khallenbeck@dataspeedinc.com>"
ROS_AUTHOR = "Kevin Hallenbeck <khallenbeck@dataspeedinc.com>"
HOMEPAGE = "http://wiki.ros.org/oxford_gps_eth"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "oxford_gps_eth"
ROS_BPN = "oxford_gps_eth"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    gps-common \
    nav-msgs \
    roscpp \
    rospy \
    sensor-msgs \
    std-msgs \
    tf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
    python3-setuptools-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    gps-common \
    nav-msgs \
    roscpp \
    rospy \
    sensor-msgs \
    std-msgs \
    tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    gps-common \
    nav-msgs \
    roscpp \
    roslaunch \
    rospy \
    sensor-msgs \
    std-msgs \
    tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    roslaunch \
    rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/DataspeedInc-release/oxford_gps_eth-release/archive/release/noetic/oxford_gps_eth/1.2.1-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/oxford_gps_eth"
SRC_URI = "git://github.com/DataspeedInc-release/oxford_gps_eth-release;${ROS_BRANCH};protocol=https"
SRCREV = "578e458f585345820880c2e243bc8493edca51ac"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}