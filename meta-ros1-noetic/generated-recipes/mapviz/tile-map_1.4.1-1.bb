# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "Tile map provides a slippy map style interface for visualizing       OpenStreetMap and GooleMap tiles.  A mapviz visualization plug-in is also      implemented"
AUTHOR = "Marc Alban <malban@swri.org>"
ROS_AUTHOR = "Marc Alban"
HOMEPAGE = "https://github.com/swri-robotics/mapviz"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "mapviz"
ROS_BPN = "tile_map"

ROS_BUILD_DEPENDS = " \
    glew \
    jsoncpp \
    mapviz \
    pluginlib \
    qtbase \
    roscpp \
    swri-math-util \
    swri-transform-util \
    swri-yaml-util \
    tf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
    qtbase-native \
"

ROS_EXPORT_DEPENDS = " \
    glew \
    mapviz \
    pluginlib \
    roscpp \
    swri-math-util \
    swri-transform-util \
    swri-yaml-util \
    tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    glew \
    jsoncpp \
    mapviz \
    pluginlib \
    qtbase \
    roscpp \
    swri-math-util \
    swri-transform-util \
    swri-yaml-util \
    tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/swri-robotics-gbp/mapviz-release/archive/release/noetic/tile_map/1.4.1-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/tile_map"
SRC_URI = "git://github.com/swri-robotics-gbp/mapviz-release;${ROS_BRANCH};protocol=https"
SRCREV = "323d5f5598c82e2b4cac715bb101e2529b90bd27"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}