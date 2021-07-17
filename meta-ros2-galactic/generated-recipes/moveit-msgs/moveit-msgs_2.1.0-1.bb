# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_galactic
inherit ros_superflore_generated

DESCRIPTION = "Messages, services and actions used by MoveIt"
AUTHOR = "Dave Coleman <dave@dav.ee>"
ROS_AUTHOR = "Ioan Sucan <isucan@google.com>"
HOMEPAGE = "http://moveit.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "moveit_msgs"
ROS_BPN = "moveit_msgs"

ROS_BUILD_DEPENDS = " \
    action-msgs \
    geometry-msgs \
    object-recognition-msgs \
    octomap-msgs \
    rosidl-default-generators \
    sensor-msgs \
    shape-msgs \
    std-msgs \
    trajectory-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    action-msgs \
    geometry-msgs \
    object-recognition-msgs \
    octomap-msgs \
    sensor-msgs \
    shape-msgs \
    std-msgs \
    trajectory-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    action-msgs \
    geometry-msgs \
    object-recognition-msgs \
    octomap-msgs \
    rosidl-default-runtime \
    sensor-msgs \
    shape-msgs \
    std-msgs \
    trajectory-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-cmake \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/moveit/moveit_msgs-release/archive/release/galactic/moveit_msgs/2.1.0-1.tar.gz
ROS_BRANCH ?= "branch=release/galactic/moveit_msgs"
SRC_URI = "git://github.com/moveit/moveit_msgs-release;${ROS_BRANCH};protocol=https"
SRCREV = "b46e279894157035d882c5dc155ebff9ec3ec084"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
